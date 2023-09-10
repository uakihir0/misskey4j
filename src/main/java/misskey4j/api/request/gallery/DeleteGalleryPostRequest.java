package misskey4j.api.request.gallery;

import misskey4j.api.model.TokenRequest;

import javax.annotation.Nonnull;

public class DeleteGalleryPostRequest extends TokenRequest {
    @Nonnull
    private String postId;

    public static DeleteGalleryPostsRequestBuilder builder() {
        return new DeleteGalleryPostsRequestBuilder();
    }

    // region

    public String getPostId() {
        return postId;
    }

    public static final class DeleteGalleryPostsRequestBuilder {
        private String postId;

        private DeleteGalleryPostsRequestBuilder() {
        }

        public DeleteGalleryPostsRequestBuilder postId(String postId) {
            this.postId = postId;
            return this;
        }

        public DeleteGalleryPostRequest build() {
            DeleteGalleryPostRequest deleteGalleryPostRequest = new DeleteGalleryPostRequest();
            deleteGalleryPostRequest.postId = this.postId;
            return deleteGalleryPostRequest;
        }
    }

    // endregion

}
