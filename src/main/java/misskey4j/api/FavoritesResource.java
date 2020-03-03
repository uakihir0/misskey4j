package misskey4j.api;

import misskey4j.api.request.favorites.FavoritesCreateRequest;
import misskey4j.api.request.favorites.FavoritesDeleteRequest;
import misskey4j.entity.share.Response;

public interface FavoritesResource {

    /**
     * 指定した投稿をお気に入りに登録します。
     * https://misskey.io/api-doc#operation/notes/favorites/create
     */
    Response<Void> create(
            FavoritesCreateRequest request);

    /**
     * 指定した投稿のお気に入りを解除します。
     */
    Response<Void> delete(
            FavoritesDeleteRequest request);

}
