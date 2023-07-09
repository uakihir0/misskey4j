package misskey4j.api;

import javax.annotation.Nonnull;

import misskey4j.api.request.UsersListsListRequest;
import misskey4j.api.request.UsersListsShowRequest;
import misskey4j.api.response.UsersListsListResponse;
import misskey4j.api.response.UsersListsShowResponse;
import misskey4j.entity.List;
import misskey4j.entity.share.Response;

public interface ListsResource {

    /**
     * 認証ユーザーの作成したユーザーリスト一覧を取得します。
     *
     * @see "https://misskey.io/api-doc#operation/users/lists/list"
     */
    Response<UsersListsListResponse[]> list(UsersListsListRequest request);

    /**
     * 指定したユーザーリストの情報を取得します。
     *
     * @see "https://misskey.io/api-doc#operation/users/lists/show"
     */
    Response<UsersListsShowResponse> show(UsersListsShowRequest request);

    /**
     * 指定したユーザーをリストに追加します。
     *
     * @see "https://misskey.io/api-doc#tag/lists/operation/users/lists/push"
     */
    void push(@Nonnull String listId, @Nonnull String userId);

    /**
     * 指定したユーザーをリストから削除します。
     *
     * @see "https://misskey.io/api-doc#tag/lists/operation/users/lists/pull"
     */
    void pull(@Nonnull String listId, @Nonnull String userId);

    /**
     * リストを作成します。
     *
     * @see "https://misskey.io/api-doc#tag/lists/operation/users/lists/create"
     */
    Response<List> create(@Nonnull String name);

    /**
     * リストを更新します。
     *
     * @see "https://misskey.io/api-doc#tag/lists/operation/users/lists/update"
     */
    Response<List> update(@Nonnull String listId, @Nonnull String name);

    /**
     * リストを削除します。
     *
     * @see "https://misskey.io/api-doc#tag/lists/operation/users/lists/delete"
     */
    void delete(@Nonnull String listId);
}
