package misskey4j.api.request.mutes;

import misskey4j.api.model.TokenRequest;

public class MutesListRequest extends TokenRequest {

    public static MutesListRequestBuilder builder() {
        return new MutesListRequestBuilder();
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

    public static final class MutesListRequestBuilder {
        private Long limit;
        private String sinceId;
        private String untilId;

        private MutesListRequestBuilder() {
        }

        public MutesListRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public MutesListRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public MutesListRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public MutesListRequest build() {
            MutesListRequest mutesListRequest = new MutesListRequest();
            mutesListRequest.limit = this.limit;
            mutesListRequest.sinceId = this.sinceId;
            mutesListRequest.untilId = this.untilId;
            return mutesListRequest;
        }
    }
    // endregion
}

