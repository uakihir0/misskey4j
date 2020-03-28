package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.MutesResource;
import misskey4j.api.request.mutes.MutesCreateRequest;
import misskey4j.api.request.mutes.MutesDeleteRequest;
import misskey4j.api.request.mutes.MutesListRequest;
import misskey4j.api.response.mutes.MutesListResponse;
import misskey4j.entity.share.Response;

public class MutesResourceImpl extends AbstractResourceImpl implements MutesResource {

    public MutesResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> create(
            MutesCreateRequest request) {
        return post(MisskeyAPI.MutesCreate.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> delete(
            MutesDeleteRequest request) {
        return post(MisskeyAPI.MutesDelete.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<MutesListResponse[]> list(
            MutesListRequest request) {
        return post(MutesListResponse[].class,
                MisskeyAPI.MutesList.code(), request);
    }
}
