package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.ChannelsResource;
import misskey4j.api.request.ChannelsFollowedRequest;
import misskey4j.api.response.ChannelsFollowedResponse;
import misskey4j.entity.share.Response;

public class ChannelsResourceImpl extends AbstractResourceImpl implements ChannelsResource {

    public ChannelsResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ChannelsFollowedResponse[]> followed(ChannelsFollowedRequest request) {
        return post(ChannelsFollowedResponse[].class,
                MisskeyAPI.ChannelsFollowed.code(), request);
    }
}
