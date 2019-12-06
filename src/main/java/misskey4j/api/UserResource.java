package misskey4j.api;

import misskey4j.api.request.users.CreateFollowRequest;
import misskey4j.api.request.users.CreateMuteRequest;
import misskey4j.api.request.users.DeleteFollowRequest;
import misskey4j.api.request.users.DeleteMuteRequest;
import misskey4j.api.request.users.UsersFollowersRequest;
import misskey4j.api.request.users.UsersFollowingsRequest;
import misskey4j.api.response.users.UsersFollowersResponse;
import misskey4j.api.response.users.UsersFollowingsResponse;
import misskey4j.entity.share.Response;

public interface UserResource {

    /**
     * 指定したユーザーをフォローします。
     * https://misskey.io/api-doc#operation/following/create
     */
    Response<Void> createFollow(CreateFollowRequest request);

    /**
     * 指定したユーザーのフォローを解除します。
     * https://misskey.io/api-doc#operation/following/delete
     */
    Response<Void> deleteFollow(DeleteFollowRequest request);

    /**
     * ユーザーをミュートします。
     * https://misskey.io/api-doc#operation/mute/create
     */
    Response<Void> createMute(CreateMuteRequest request);

    /**
     * ユーザーのミュートを解除します。
     * https://misskey.io/api-doc#operation/mute/delete
     */
    Response<Void> deleteMute(DeleteMuteRequest request);

    /**
     * 指定したユーザーのフォロワー一覧を取得します。
     * https://misskey.io/api-doc#operation/users/followers
     */
    Response<UsersFollowersResponse[]> usersFollowers(
            UsersFollowersRequest request);

    /**
     * 指定したユーザーのフォロー一覧を取得します。
     * https://misskey.io/api-doc#operation/users/following
     */
    Response<UsersFollowingsResponse[]> usersFollowings(
            UsersFollowingsRequest request);
}
