package misskey4j.api.request.users;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

import javax.annotation.Nonnull;

public class ListUserGalleryPostsRequest extends TokenRequest {

    @Nonnull
    private String userId;
    private Long limit;
    private String sinceId;
    private String untilId;

    public String getUserId() {
        return userId;
    }

    public Long getLimit() {
        return limit;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public static ListUserGalleryPostsRequestBuilder builder() {
        return new ListUserGalleryPostsRequestBuilder();
    }

    public static final class ListUserGalleryPostsRequestBuilder implements
            PagingBuilder<ListUserGalleryPostsRequestBuilder> {
        @Nonnull
        private String userId;
        private Long limit;
        private String sinceId;
        private String untilId;
        private ListUserGalleryPostsRequestBuilder() {
        }

        public ListUserGalleryPostsRequestBuilder userId(@Nonnull String userId) {
            this.userId = userId;
            return this;
        }

        public ListUserGalleryPostsRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public ListUserGalleryPostsRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public ListUserGalleryPostsRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public ListUserGalleryPostsRequest build() {
            ListUserGalleryPostsRequest iListUserGalleryPostsRequest = new ListUserGalleryPostsRequest();
            iListUserGalleryPostsRequest.userId = this.userId;
            iListUserGalleryPostsRequest.limit = this.limit;
            iListUserGalleryPostsRequest.untilId = this.untilId;
            iListUserGalleryPostsRequest.sinceId = this.sinceId;
            return iListUserGalleryPostsRequest;
        }
    }
}
