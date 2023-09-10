package misskey4j.api.request.gallery;

import misskey4j.api.model.TokenRequest;

import javax.annotation.Nonnull;
import java.util.List;

public class UpdateGalleryPostRequest extends TokenRequest {
    @Nonnull
    private String postId;
    @Nonnull
    private String title;
    private String description;
    @Nonnull
    private List<String> fileIds;
    private Boolean isSensitive = false;

    public static UpdateGalleryPostsRequestBuilder builder() {
        return new UpdateGalleryPostsRequestBuilder();
    }

    public static final class UpdateGalleryPostsRequestBuilder {
        @Nonnull
        private String postId;
        @Nonnull
        private String title;
        private String description;
        @Nonnull
        private List<String> fileIds;
        private Boolean isSensitive = false;

        // region

        private UpdateGalleryPostsRequestBuilder() {
        }

        public UpdateGalleryPostsRequestBuilder postId(@Nonnull String postId) {
            this.postId = postId;
            return this;
        }

        public UpdateGalleryPostsRequestBuilder title(@Nonnull String title) {
            this.title = title;
            return this;
        }

        public UpdateGalleryPostsRequestBuilder description(String description) {
            this.description = description;
            return this;
        }

        public UpdateGalleryPostsRequestBuilder fileIds(@Nonnull List<String> fileIds) {
            this.fileIds = fileIds;
            return this;
        }

        public UpdateGalleryPostsRequestBuilder isSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
            return this;
        }

        public UpdateGalleryPostRequest build() {
            UpdateGalleryPostRequest updateGalleryPostRequest = new UpdateGalleryPostRequest();
            updateGalleryPostRequest.postId = this.postId;
            updateGalleryPostRequest.title = this.title;
            updateGalleryPostRequest.description = this.description;
            updateGalleryPostRequest.fileIds = this.fileIds;
            updateGalleryPostRequest.isSensitive = this.isSensitive;
            return updateGalleryPostRequest;
        }
    }

    // endregion
}
