package misskey4j.internal;

import misskey4j.api.UserResource;
import misskey4j.api.request.users.CreateFollowRequest;
import misskey4j.api.request.users.CreateMuteRequest;
import misskey4j.api.request.users.DeleteFollowRequest;
import misskey4j.api.request.users.DeleteMuteRequest;
import misskey4j.api.request.users.UsersFollowersRequest;
import misskey4j.api.request.users.UsersFollowingsRequest;
import misskey4j.api.response.users.UsersFollowersResponse;
import misskey4j.api.response.users.UsersFollowingsResponse;
import misskey4j.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

public class UserResourceImpl extends AbstractResourceImpl implements UserResource {

    UserResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> createFollow(CreateFollowRequest request) {

        return proceed(() -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("following/create")
                    .json(toJson(auth(request)))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> deleteFollow(DeleteFollowRequest request) {

        return proceed(() -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("following/delete")
                    .json(toJson(auth(request)))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> createMute(CreateMuteRequest request) {

        return proceed(() -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("mute/create")
                    .json(toJson(auth(request)))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> deleteMute(DeleteMuteRequest request) {

        return proceed(() -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("mute/delete")
                    .json(toJson(auth(request)))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UsersFollowersResponse[]> usersFollowers(
            UsersFollowersRequest request) {

        return proceed(UsersFollowersResponse[].class, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("users/followers")
                    .json(toJson(request))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UsersFollowingsResponse[]> usersFollowings(
            UsersFollowingsRequest request) {

        return proceed(UsersFollowingsResponse[].class, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("users/following")
                    .json(toJson(request))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }
}
