package misskey4j.api;

import misskey4j.api.request.ListUsersListsRequest;
import misskey4j.api.request.ShowUsersListsRequest;
import misskey4j.api.response.ListUsersListsResponse;
import misskey4j.api.response.ShowUsersListsResponse;
import misskey4j.entity.share.Response;

public interface ListResource {

    /**
     * 認証ユーザーの作成したユーザーリスト一覧を取得します。
     * https://misskey.io/api-doc#operation/users/lists/list
     */
    Response<ListUsersListsResponse[]> listUsersLists(
            ListUsersListsRequest request);

    /**
     * 指定したユーザーリストの情報を取得します。
     * https://misskey.io/api-doc#operation/users/lists/show
     */
    Response<ShowUsersListsResponse> showUsersLists(
            ShowUsersListsRequest request);
}
