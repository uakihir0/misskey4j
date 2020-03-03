package misskey4j.api;

import misskey4j.api.request.UsersListsListRequest;
import misskey4j.api.request.UsersListsShowRequest;
import misskey4j.api.response.UsersListsListResponse;
import misskey4j.api.response.UsersListsShowResponse;
import misskey4j.entity.share.Response;

public interface ListsResource {

    /**
     * 認証ユーザーの作成したユーザーリスト一覧を取得します。
     * https://misskey.io/api-doc#operation/users/lists/list
     */
    Response<UsersListsListResponse[]> list(
            UsersListsListRequest request);

    /**
     * 指定したユーザーリストの情報を取得します。
     * https://misskey.io/api-doc#operation/users/lists/show
     */
    Response<UsersListsShowResponse> show(
            UsersListsShowRequest request);
}
