package misskey4j.api;

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

public interface UsersResource {

    /**
     * 指定したユーザーのフォロワー一覧を取得します。
     * https://misskey.io/api-doc#operation/users/followers
     */
    Response<UsersFollowersResponse[]> followers(
            UsersFollowersRequest request);

    /**
     * 指定したユーザーのフォロー一覧を取得します。
     * https://misskey.io/api-doc#operation/users/following
     */
    Response<UsersFollowingsResponse[]> followings(
            UsersFollowingsRequest request);

    /**
     * 指定したユーザーの情報を取得します。
     * https://misskey.io/api-doc#operation/users/show
     */
    Response<UsersShowResponse[]> show(
            UsersShowRequest request);

    /**
     * ユーザー間のリレーションを取得します。
     * https://misskey.io/api-doc#operation/users/relation
     */
    Response<UsersRelationResponse[]> relation(
            UsersRelationRequest request);

    /**
     * ユーザーを検索します。
     * https://misskey.io/api-doc#operation/users/search
     */
    Response<UsersSearchResponse[]> search(
            UsersSearchRequest request);

}
