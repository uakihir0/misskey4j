package misskey4j.api;

import misskey4j.api.request.IFavoritesRequest;
import misskey4j.api.request.INotificationsRequest;
import misskey4j.api.request.IRequest;
import misskey4j.api.response.IFavoritesResponse;
import misskey4j.api.response.INotificationsResponse;
import misskey4j.api.response.IResponse;
import misskey4j.entity.share.Response;

/**
 * Account APIs.
 */
public interface AccountsResource {

    /**
     * 自分のアカウント情報を取得します。
     * https://misskey.io/api-doc#operation/i
     */
    Response<IResponse> i(
            IRequest request);

    /**
     * お気に入りに登録した投稿一覧を取得します。
     * https://misskey.io/api-doc#operation/i/favorites
     */
    Response<IFavoritesResponse[]> iFavorites(
            IFavoritesRequest request);

    /**
     * 通知一覧を取得します。
     * https://misskey.io/api-doc#operation/i/notifications
     */
    Response<INotificationsResponse[]> iNotifications(
            INotificationsRequest request);
}
