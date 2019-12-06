package misskey4j.internal;

import com.google.gson.Gson;
import misskey4j.MisskeyException;
import misskey4j.api.model.TokenRequest;
import misskey4j.entity.share.RateLimit;
import misskey4j.entity.share.Response;
import net.socialhub.http.HttpException;
import net.socialhub.http.HttpRequestBuilder;
import net.socialhub.http.HttpResponse;
import net.socialhub.http.HttpResponseCode;

import java.net.URLEncoder;

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

    static Response<Void> proceed(RequestInterface function) {
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

    static <T> Response<T> proceed(Class<T> clazz, RequestInterface function) {
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

    static void addParam(HttpRequestBuilder builder, String key, Object value) {
        if (value != null) {
            builder.param(key, value.toString());
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
