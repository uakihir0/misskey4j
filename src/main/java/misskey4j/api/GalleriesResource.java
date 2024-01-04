package misskey4j.api;

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

public interface GalleriesResource {

    /**
     * Get gallery posts.
     *
     * @see "https://misskey.io/api-doc#operation/gallery/posts"
     */
    Response<ListGalleryPostsResponse[]> posts(ListGalleryPostsRequest request);

    /**
     * Get my gallery posts.
     *
     * @see "https://misskey.io/api-doc#operation/i/gallery/posts"
     */
    Response<ListGalleryPostsResponse[]> posts(IListGalleryPostsRequest request);

    /**
     * Get user's gallery posts.
     *
     * @see "https://misskey.io/api-doc#operation/users/gallery/posts"
     */
    Response<ListGalleryPostsResponse[]> posts(ListUserGalleryPostsRequest request);

    /**
     * Show a gallery post.
     *
     * @see "https://misskey.io/api-doc#operation/gallery/posts/show"
     */
    Response<GalleryPost> show(ShowGalleryPostRequest request);

    /**
     * Create a gallery post.
     *
     * @see "https://misskey.io/api-doc#operation/gallery/posts/create"
     */
    Response<GalleryPost> create(CreateGalleryPostRequest request);

    /**
     * Delete a gallery post.
     *
     * @see "https://misskey.io/api-doc#operation/gallery/posts/delete"
     */
    Response<Void> delete(DeleteGalleryPostRequest request);

    /**
     * Update a gallery post.
     *
     * @see "https://misskey.io/api-doc#operation/gallery/posts/delete"
     */
    Response<GalleryPost> update(UpdateGalleryPostRequest request);

    /**
     * Like a gallery post.
     *
     * @see "https://misskey.io/api-doc#operation/gallery/posts/like"
     */
    Response<Void> like(LikeGalleryPostRequest request);

    /**
     * Unlike a gallery post.
     *
     * @see "https://misskey.io/api-doc#operation/gallery/posts/unlike"
     */
    Response<Void> like(UnlikeGalleryPostRequest request);


}
