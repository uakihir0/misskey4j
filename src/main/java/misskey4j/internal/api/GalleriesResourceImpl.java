package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.GalleriesResource;
import misskey4j.api.request.gallery.CreateGalleryPostRequest;
import misskey4j.api.request.gallery.DeleteGalleryPostRequest;
import misskey4j.api.request.gallery.LikeGalleryPostRequest;
import misskey4j.api.request.gallery.ListGalleryPostsRequest;
import misskey4j.api.request.gallery.ShowGalleryPostRequest;
import misskey4j.api.request.gallery.UnlikeGalleryPostRequest;
import misskey4j.api.request.gallery.UpdateGalleryPostRequest;
import misskey4j.api.request.i.IListGalleryPostsRequest;
import misskey4j.api.request.users.ListUserGalleryPostsRequest;
import misskey4j.api.response.gallery.ListGalleryPostsResponse;
import misskey4j.entity.GalleryPost;
import misskey4j.entity.share.Response;

public class GalleriesResourceImpl extends AbstractResourceImpl implements GalleriesResource {

    public GalleriesResourceImpl(String uri, String i) {
        super(uri, i);
    }

    @Override
    public Response<ListGalleryPostsResponse[]> posts(final ListGalleryPostsRequest request) {
        return post(ListGalleryPostsResponse[].class,
                MisskeyAPI.GalleryPosts.code(), request);
    }

    @Override
    public Response<ListGalleryPostsResponse[]> posts(final IListGalleryPostsRequest request) {
        return post(ListGalleryPostsResponse[].class,
                MisskeyAPI.IGalleryPosts.code(), request);
    }

    @Override
    public Response<ListGalleryPostsResponse[]> posts(final ListUserGalleryPostsRequest request) {
        return post(ListGalleryPostsResponse[].class,
                MisskeyAPI.UserGalleryPosts.code(), request);
    }

    @Override
    public Response<GalleryPost> show(final ShowGalleryPostRequest request) {
        return post(GalleryPost.class,
                MisskeyAPI.ShowGalleryPost.code(), request);
    }

    @Override
    public Response<GalleryPost> create(final CreateGalleryPostRequest request) {
         return post(GalleryPost.class,
                MisskeyAPI.CreateGalleryPost.code(), request);
    }

    @Override
    public Response<Void> delete(final DeleteGalleryPostRequest request) {
        return post(MisskeyAPI.DeleteGalleryPost.code(), request);
    }

    @Override
    public Response<GalleryPost> update(final UpdateGalleryPostRequest request) {
        return post(GalleryPost.class,
                MisskeyAPI.UpdateGalleryPost.code(), request);
    }

    @Override
    public Response<Void> like(final LikeGalleryPostRequest request) {
        return post(MisskeyAPI.LikeGalleryPost.code(), request);
    }

    @Override
    public Response<Void> like(final UnlikeGalleryPostRequest request) {
        return post(MisskeyAPI.UnlikeGalleryPost.code(), request);
    }
}
