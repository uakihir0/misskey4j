package misskey4j.internal.api;

import com.google.gson.Gson;
import misskey4j.MisskeyException;
import misskey4j.api.model.TokenRequest;
import misskey4j.entity.Error;
import misskey4j.entity.share.RateLimit;
import misskey4j.entity.share.Response;
import misskey4j.internal.model.StreamFile;
import net.socialhub.http.HttpException;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;
import net.socialhub.http.HttpResponse;
import net.socialhub.http.HttpResponseCode;

import java.io.File;
import java.net.URLEncoder;
import java.util.Map;

public abstract class AbstractResourceImpl {

    private static final Gson gson = new Gson();

    public static Gson getGsonInstance() {
        return gson;
    }

    protected final String uri;
    protected final String i;

    AbstractResourceImpl(String uri, String i) {
        this.uri = uri;
        this.i = i;
    }

    public <T extends TokenRequest> T auth(T req) {
        req.setI(i);
        return req;
    }

    /**
     * API を実行のハンドリングを行う関数
     * 引数で与えられた関数内で HTTP コールを実行
     */
    protected Response<Void> proceed(RequestInterface function) {
        try {
            HttpResponse response = function.proceed();
            if (response.getStatusCode() == HttpResponseCode.OK) {
                Response<Void> result = new Response<>();
                result.setRateLimit(RateLimit.of(response));
                return result;
            }
            Error error = gson.fromJson(response.asString(), Error.class);
            throw new MisskeyException(error, response.getStatusCode());

        } catch (HttpException e) {
            throw new MisskeyException(e);
        }
    }

    /**
     * API を実行のハンドリングを行う関数
     * 引数で与えられた関数内で HTTP コールを実行
     */
    protected <T> Response<T> proceed(Class<T> clazz, RequestInterface function) {
        try {
            HttpResponse response = function.proceed();
            if (response.getStatusCode() == HttpResponseCode.OK) {
                Response<T> result = new Response<>();
                result.set(gson.fromJson(response.asString(), clazz));
                result.setRateLimit(RateLimit.of(response));
                return result;
            }
            Error error = gson.fromJson(response.asString(), Error.class);
            throw new MisskeyException(error, response.getStatusCode());

        } catch (HttpException e) {
            throw new MisskeyException(e);
        }
    }

    /**
     * API の呼び出しを行う場合
     */
    protected <T> Response<T> post(Class<T> clazz, String path, Object request) {
        return proceed(clazz, () -> {

            // 認証リクエストの場合
            if (request instanceof TokenRequest) {
                return new HttpRequestBuilder()
                        .target(uri).path(path)
                        .json(toJson(auth((TokenRequest) request)))
                        .request(HttpMediaType.APPLICATION_JSON)
                        .post();
            }

            // 通常のリクエストの場合
            return new HttpRequestBuilder()
                    .target(uri).path(path)
                    .json(toJson(request))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }

    /**
     * API の呼び出しを行う場合
     */
    protected Response<Void> post(String path, Object request) {
        return proceed(() -> {

            // 認証リクエストの場合
            if (request instanceof TokenRequest) {
                return new HttpRequestBuilder()
                        .target(uri).path(path)
                        .json(toJson(auth((TokenRequest) request)))
                        .request(HttpMediaType.APPLICATION_JSON)
                        .post();
            }

            // 通常のリクエストの場合
            return new HttpRequestBuilder()
                    .target(uri).path(path)
                    .json(toJson(request))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }

    /**
     * API の呼び出しを行う場合
     * (ファイル付きの POST を行う場合)
     */
    protected <T> Response<T> post(Class<T> clazz, String path, Map<String, Object> params) {
        return proceed(clazz, () -> {

            HttpRequestBuilder builder = new HttpRequestBuilder();
            addParam(builder, "i", i);

            params.forEach((key, value) ->
                    addParam(builder, key, value));

            return builder.target(uri).path(path)
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }

    static void addParam(HttpRequestBuilder builder, String key, Object value) {
        if (value != null) {
            if (value instanceof StreamFile) {
                builder.file(key,
                        ((StreamFile) value).getStream(),
                        ((StreamFile) value).getName());
                return;
            }
            if (value instanceof File) {
                builder.file(key, (File) value);
                return;
            }
            builder.param(key, value.toString());
        }
    }

    static void addParam(Map<String, Object> builder, String key, Object value) {
        if (value != null) {
            builder.put(key, value);
        }
    }

    static String encode(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (Exception e) {
            return str;
        }
    }

    static String toJson(Object object) {
        return getGsonInstance().toJson(object);
    }

    interface RequestInterface {
        HttpResponse proceed() throws HttpException;
    }
}
