package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.UsersResource;
import misskey4j.api.request.users.UsersFollowersRequest;
import misskey4j.api.request.users.UsersFollowingsRequest;
import misskey4j.api.request.users.UsersRelationRequest;
import misskey4j.api.request.users.UsersSearchRequest;
import misskey4j.api.request.users.UsersShowRequest;
import misskey4j.api.response.users.UsersFollowersResponse;
import misskey4j.api.response.users.UsersFollowingsResponse;
import misskey4j.api.response.users.UsersRelationResponse;
import misskey4j.api.response.users.UsersSearchResponse;
import misskey4j.api.response.users.UsersShowResponse;
import misskey4j.entity.share.Response;

public class UsersResourceImpl extends AbstractResourceImpl implements UsersResource {

    public UsersResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UsersFollowersResponse[]> followers(
            UsersFollowersRequest request) {
        return post(UsersFollowersResponse[].class,
                MisskeyAPI.UsersFollowers.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UsersFollowingsResponse[]> followings(
            UsersFollowingsRequest request) {
        return post(UsersFollowingsResponse[].class,
                MisskeyAPI.UsersFollowing.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UsersShowResponse[]> show(
            UsersShowRequest request) {
        return post(UsersShowResponse[].class,
                MisskeyAPI.UsersShow.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UsersRelationResponse[]> relation(
            UsersRelationRequest request) {
        return post(UsersRelationResponse[].class,
                MisskeyAPI.UsersRelation.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UsersSearchResponse[]> search(
            UsersSearchRequest request) {
        return post(UsersSearchResponse[].class,
                MisskeyAPI.UsersSearch.code(), request);
    }
}
