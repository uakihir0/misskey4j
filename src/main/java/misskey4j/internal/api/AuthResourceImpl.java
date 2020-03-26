package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
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
}
