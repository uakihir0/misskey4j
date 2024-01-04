package misskey4j.api.request.gallery;

import misskey4j.api.model.TokenRequest;

public class ShowGalleryPostRequest extends TokenRequest {

    private String postId;

    // region

    public String getPostId() {
        return postId;
    }

    public static ShowGalleryPostsRequestBuilder builder() {
        return new ShowGalleryPostsRequestBuilder();
    }

    public static class ShowGalleryPostsRequestBuilder {
        private String postId;
        private ShowGalleryPostsRequestBuilder() {
        }

        public ShowGalleryPostsRequestBuilder postId(String postId) {
            this.postId = postId;
            return this;
        }

        public ShowGalleryPostRequest build() {
            ShowGalleryPostRequest showGalleryPostRequest = new ShowGalleryPostRequest();
            showGalleryPostRequest.postId = this.postId;
            return showGalleryPostRequest;
        }
    }

    // endregion

}