package misskey4j.api;

import misskey4j.api.request.users.UsersFollowersRequest;
import misskey4j.api.request.users.UsersFollowingsRequest;
import misskey4j.api.request.users.UsersReactionsRequest;
import misskey4j.api.request.users.UsersRelationRequest;
import misskey4j.api.request.users.UsersSearchByUsernameAndHostRequest;
import misskey4j.api.request.users.UsersSearchRequest;
import misskey4j.api.request.users.UsersShowMultipleRequest;
import misskey4j.api.request.users.UsersShowSingleRequest;
import misskey4j.api.response.notes.UsersReactionsResponse;
import misskey4j.api.response.users.UsersFollowersResponse;
import misskey4j.api.response.users.UsersFollowingsResponse;
import misskey4j.api.response.users.UsersRelationResponse;
import misskey4j.api.response.users.UsersSearchByUsernameAndHostResponse;
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
     * 指定したユーザーの情報を取得します。(単数)
     * https://misskey.io/api-doc#operation/users/show
     */
    Response<UsersShowResponse> show(
            UsersShowSingleRequest request);

    /**
     * 指定したユーザーの情報を取得します。(複数)
     * https://misskey.io/api-doc#operation/users/show
     */
    Response<UsersShowResponse[]> show(
            UsersShowMultipleRequest request);

    /**
     * ユーザーがつけたリアクションを取得します。
     * https://misskey.io/api-doc#operation/users/reactions
     */
    Response<UsersReactionsResponse[]> reactions(
            UsersReactionsRequest request);

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

    /**
     * ユーザー名・ホスト名からユーザーを検索します。
     * https://misskey.io/api-doc#operation/users/search-by-username-and-host
     */
    Response<UsersSearchByUsernameAndHostResponse[]> searchByUsernameAndHost(
            UsersSearchByUsernameAndHostRequest request);

}
