package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.AppResource;
import misskey4j.api.request.CreateAppRequest;
import misskey4j.api.response.CreateAppResponse;
import misskey4j.entity.share.Response;

public class AppResourceImpl extends AbstractResourceImpl implements AppResource {

    public AppResourceImpl(String uri) {
        super(uri, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<CreateAppResponse> createApp(
            CreateAppRequest request) {
        return post(CreateAppResponse.class,
                MisskeyAPI.AppCreate.code(), request);
    }
}
