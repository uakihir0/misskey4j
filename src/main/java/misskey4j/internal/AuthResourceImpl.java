package misskey4j.internal;

import misskey4j.api.AuthResource;
import misskey4j.api.request.GenerateAuthSessionRequest;
import misskey4j.api.request.UserKeyAuthSessionRequest;
import misskey4j.api.response.GenerateAuthSessionResponse;
import misskey4j.api.response.UserKeyAuthSessionResponse;
import misskey4j.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

public class AuthResourceImpl extends AbstractResourceImpl implements AuthResource {

    AuthResourceImpl(String uri) {
        super(uri, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<GenerateAuthSessionResponse> generateAuthSession(
            GenerateAuthSessionRequest request) {

        return proceed(GenerateAuthSessionResponse.class, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("auth/session/generate")
                    .json(toJson(request))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UserKeyAuthSessionResponse> userKeyAuthSession(
            UserKeyAuthSessionRequest request) {

        return proceed(UserKeyAuthSessionResponse.class, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("auth/session/userkey")
                    .json(toJson(request))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }
}
