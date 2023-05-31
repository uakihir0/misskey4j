package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.ChannelsResource;
import misskey4j.api.request.ChannelsFollowedRequest;
import misskey4j.api.request.ChannelsMyFavoritesRequest;
import misskey4j.api.request.ChannelsOwnedRequest;
import misskey4j.api.request.ChannelsShowRequest;
import misskey4j.api.request.ChannelsTimelineRequest;
import misskey4j.api.response.ChannelsFollowedResponse;
import misskey4j.api.response.ChannelsMyFavoritesResponse;
import misskey4j.api.response.ChannelsOwnedResponse;
import misskey4j.api.response.ChannelsShowResponse;
import misskey4j.api.response.ChannelsTimelineResponse;
import misskey4j.entity.share.Response;

public class ChannelsResourceImpl extends AbstractResourceImpl implements ChannelsResource {

    public ChannelsResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ChannelsOwnedResponse[]> owned(ChannelsOwnedRequest request) {
        return post(ChannelsOwnedResponse[].class,
                MisskeyAPI.ChannelsOwned.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ChannelsMyFavoritesResponse[]> myFavorites(ChannelsMyFavoritesRequest request) {
        return post(ChannelsMyFavoritesResponse[].class,
                MisskeyAPI.ChannelsMyFavorites.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ChannelsFollowedResponse[]> followed(ChannelsFollowedRequest request) {
        return post(ChannelsFollowedResponse[].class,
                MisskeyAPI.ChannelsFollowed.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ChannelsTimelineResponse[]> timeline(ChannelsTimelineRequest request) {
        return post(ChannelsTimelineResponse[].class,
                MisskeyAPI.ChannelsTimeline.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ChannelsShowResponse> show(ChannelsShowRequest request) {
        return post(ChannelsShowResponse.class,
                MisskeyAPI.ChannelsShow.code(), request);
    }

}
