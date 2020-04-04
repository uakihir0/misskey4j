package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.FavoritesResource;
import misskey4j.api.request.favorites.FavoritesCreateRequest;
import misskey4j.api.request.favorites.FavoritesDeleteRequest;
import misskey4j.entity.share.Response;

public class FavoritesResourceImpl extends AbstractResourceImpl implements FavoritesResource {

    public FavoritesResourceImpl(String uri, String i) {
        super(uri, i);
    }

    @Override
    public Response<Void> create(
            FavoritesCreateRequest request) {
        return post(MisskeyAPI.FavoritesCreate.code(), request);
    }

    @Override
    public Response<Void> delete(
            FavoritesDeleteRequest request) {
        return post(MisskeyAPI.FavoritesDelete.code(), request);
    }
}
