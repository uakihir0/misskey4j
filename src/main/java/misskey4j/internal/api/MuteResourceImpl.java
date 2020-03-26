package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.MuteResource;
import misskey4j.api.request.mute.MuteCreateRequest;
import misskey4j.api.request.mute.MuteDeleteRequest;
import misskey4j.api.request.mute.MuteListRequest;
import misskey4j.api.response.mute.MuteListResponse;
import misskey4j.entity.share.Response;

public class MuteResourceImpl extends AbstractResourceImpl implements MuteResource {

    public MuteResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> create(
            MuteCreateRequest request) {
        return post(MisskeyAPI.MuteCreate.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> delete(
            MuteDeleteRequest request) {
        return post(MisskeyAPI.MuteDelete.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<MuteListResponse[]> list(
            MuteListRequest request) {
        return post(MuteListResponse[].class,
                MisskeyAPI.MuteList.code(), request);
    }
}
