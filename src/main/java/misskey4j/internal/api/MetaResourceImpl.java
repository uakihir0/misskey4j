package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.MetaResource;
import misskey4j.api.request.meta.MetaRequest;
import misskey4j.api.response.meta.MetaResponse;
import misskey4j.entity.share.Response;

public class MetaResourceImpl extends AbstractResourceImpl implements MetaResource {

    public MetaResourceImpl(String uri) {
        super(uri, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<MetaResponse> meta(
            MetaRequest request) {
        return post(MetaResponse.class,
                MisskeyAPI.Meta.code(), request);
    }
}
