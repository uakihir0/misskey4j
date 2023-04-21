package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.AuthResource;
import misskey4j.api.request.GenerateAuthSessionRequest;
import misskey4j.api.request.GetMiAuthUriRequest;
import misskey4j.api.request.UserKeyAuthSessionRequest;
import misskey4j.api.response.GenerateAuthSessionResponse;
import misskey4j.api.response.UserKeyAuthSessionResponse;
import misskey4j.entity.share.Response;

import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class AuthResourceImpl extends AbstractResourceImpl implements AuthResource {

    public AuthResourceImpl(String uri) {
        super(uri, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<GenerateAuthSessionResponse> sessionGenerate(
            GenerateAuthSessionRequest request) {
        return post(GenerateAuthSessionResponse.class,
                MisskeyAPI.AuthSessionGenerate.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UserKeyAuthSessionResponse> sessionUserKey(
            UserKeyAuthSessionRequest request) {
        return post(UserKeyAuthSessionResponse.class,
                MisskeyAPI.AuthSessionUserkey.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<String> getMiAuthUri(
            GetMiAuthUriRequest request
    ) {
        try {
            URL url = new URL(uri);

            StringBuilder builder = new StringBuilder();
            builder.append(url.getProtocol());
            builder.append("://");
            builder.append(url.getHost());
            builder.append("/miauth/");
            builder.append(request.getSessionId());

            List<String> params = new ArrayList<>();
            if (request.getName() != null) {
                params.add("name=" + encode(request.getName()));
            }
            if (request.getIconUri() != null) {
                params.add("icon=" + encode(request.getIconUri()));
            }
            if (request.getCallbackUrl() != null) {
                params.add("callback=" + encode(request.getCallbackUrl()));
            }
            if (request.getPermission() != null) {
                params.add("permission=" + encode(String.join(",", request.getPermission())));
            }

            if (params.size() > 0) {
                builder.append("?");
                builder.append(String.join("&", params));
            }

            Response<String> response = new Response<>();
            response.set(builder.toString());
            return response;

        } catch (Exception e) {
            return null;
        }
    }

    protected static String encode(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            return null;
        }
    }
}
