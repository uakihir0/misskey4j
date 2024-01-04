package misskey4j.api.request.i;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

public class IListGalleryPostsRequest extends TokenRequest {

    private Long limit;
    private String sinceId;
    private String untilId;

    public Long getLimit() {
        return limit;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public static ListGalleryPostsRequestBuilder builder() {
        return new ListGalleryPostsRequestBuilder();
    }

    public static final class ListGalleryPostsRequestBuilder implements PagingBuilder<ListGalleryPostsRequestBuilder>  {
        private Long limit;
        private String sinceId;
        private String untilId;
        private ListGalleryPostsRequestBuilder() {
        }

        public ListGalleryPostsRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public ListGalleryPostsRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public ListGalleryPostsRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public IListGalleryPostsRequest build() {
            IListGalleryPostsRequest iListGalleryPostsRequest = new IListGalleryPostsRequest();
            iListGalleryPostsRequest.limit = this.limit;
            iListGalleryPostsRequest.untilId = this.untilId;
            iListGalleryPostsRequest.sinceId = this.sinceId;
            return iListGalleryPostsRequest;
        }
    }
}
