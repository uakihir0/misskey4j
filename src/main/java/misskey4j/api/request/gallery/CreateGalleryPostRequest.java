package misskey4j.api.request.gallery;

import misskey4j.api.model.TokenRequest;

import javax.annotation.Nonnull;
import java.util.List;

public class CreateGalleryPostRequest extends TokenRequest {
    @Nonnull
    private String title;
    private String description;
    @Nonnull
    private List<String> fileIds;
    private Boolean isSensitive = false;

    // region

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getFileIds() {
        return fileIds;
    }

    public Boolean getIsSensitive() {
        return isSensitive;
    }

    public static CreateGalleryPostsRequestBuilder builder() {
        return new CreateGalleryPostsRequestBuilder();
    }

    public static final class CreateGalleryPostsRequestBuilder {
        @Nonnull
        private String title;
        private String description;
        @Nonnull
        private List<String> fileIds;
        private Boolean isSensitive = false;

        private CreateGalleryPostsRequestBuilder() {
        }

        public CreateGalleryPostsRequestBuilder title(@Nonnull String title) {
            this.title = title;
            return this;
        }

        public CreateGalleryPostsRequestBuilder description(String description) {
            this.description = description;
            return this;
        }

        public CreateGalleryPostsRequestBuilder fileIds(@Nonnull List<String> fileIds) {
            this.fileIds = fileIds;
            return this;
        }

        public CreateGalleryPostsRequestBuilder isSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
            return this;
        }

        public CreateGalleryPostRequest build() {
            CreateGalleryPostRequest createGalleryPostRequest = new CreateGalleryPostRequest();
            createGalleryPostRequest.title = this.title;
            createGalleryPostRequest.description = this.description;
            createGalleryPostRequest.fileIds = this.fileIds;
            createGalleryPostRequest.isSensitive = this.isSensitive;
            return createGalleryPostRequest;
        }
    }

    // endregion
}
