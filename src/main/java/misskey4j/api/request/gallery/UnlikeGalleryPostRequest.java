package misskey4j.api.request.gallery;

import misskey4j.api.model.TokenRequest;

import javax.annotation.Nonnull;

public class UnlikeGalleryPostRequest extends TokenRequest {
    @Nonnull
    private String postId;

    public static UnlikeGalleryPostsRequestBuilder builder() {
        return new UnlikeGalleryPostsRequestBuilder();
    }

    // region

    public String getPostId() {
        return postId;
    }

    public static final class UnlikeGalleryPostsRequestBuilder {
        private String postId;

        private UnlikeGalleryPostsRequestBuilder() {
        }

        public UnlikeGalleryPostsRequestBuilder postId(String postId) {
            this.postId = postId;
            return this;
        }

        public UnlikeGalleryPostRequest build() {
            UnlikeGalleryPostRequest unlikeGalleryPostRequest = new UnlikeGalleryPostRequest();
            unlikeGalleryPostRequest.postId = this.postId;
            return unlikeGalleryPostRequest;
        }
    }
}
