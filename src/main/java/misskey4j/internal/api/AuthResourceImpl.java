package misskey4j.internal.api;

import misskey4j.api.AuthResource;
import misskey4j.api.request.GenerateAuthSessionRequest;
import misskey4j.api.request.UserKeyAuthSessionRequest;
import misskey4j.api.response.GenerateAuthSessionResponse;
import misskey4j.api.response.UserKeyAuthSessionResponse;
import misskey4j.entity.share.Response;

public class AuthResourceImpl extends AbstractResourceImpl implements AuthResource {

    public AuthResourceImpl(String uri) {
        super(uri, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<GenerateAuthSessionResponse> generateAuthSession(
            GenerateAuthSessionRequest request) {
        return post(GenerateAuthSessionResponse.class,
                "auth/session/generate", request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UserKeyAuthSessionResponse> userKeyAuthSession(
            UserKeyAuthSessionRequest request) {
        return post(UserKeyAuthSessionResponse.class,
                "auth/session/userkey", request);
    }
}
