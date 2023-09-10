package misskey4j.api.request.gallery;

import misskey4j.api.model.TokenRequest;

import javax.annotation.Nonnull;

public class LikeGalleryPostRequest extends TokenRequest {
    @Nonnull
    private String postId;

    public static LikeGalleryPostsRequestBuilder builder() {
        return new LikeGalleryPostsRequestBuilder();
    }

    // region

    public String getPostId() {
        return postId;
    }

    public static final class LikeGalleryPostsRequestBuilder {
        private String postId;

        private LikeGalleryPostsRequestBuilder() {
        }

        public LikeGalleryPostsRequestBuilder postId(String postId) {
            this.postId = postId;
            return this;
        }

        public LikeGalleryPostRequest build() {
            LikeGalleryPostRequest likeGalleryPostRequest = new LikeGalleryPostRequest();
            likeGalleryPostRequest.postId = this.postId;
            return likeGalleryPostRequest;
        }
    }
}
