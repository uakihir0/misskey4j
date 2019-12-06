package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class IFavoritesRequest extends TokenRequest {

    public static IFavoritesRequestBuilder builder() {
        return new IFavoritesRequestBuilder();
    }

    private Long limit;
    private String sinceId;
    private String untilId;

    // region
    public Long getLimit() {
        return limit;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public static final class IFavoritesRequestBuilder {
        private Long limit;
        private String sinceId;
        private String untilId;

        private IFavoritesRequestBuilder() {
        }

        public IFavoritesRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public IFavoritesRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public IFavoritesRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public IFavoritesRequest build() {
            IFavoritesRequest iFavoritesRequest = new IFavoritesRequest();
            iFavoritesRequest.limit = this.limit;
            iFavoritesRequest.sinceId = this.sinceId;
            iFavoritesRequest.untilId = this.untilId;
            return iFavoritesRequest;
        }
    }
    // endregion
}
