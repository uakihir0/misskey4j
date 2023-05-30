package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

public class ChannelsOwnedRequest extends TokenRequest {

    public static ChannelsOwnedRequestBuilder builder() {
        return new ChannelsOwnedRequestBuilder();
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

    public static final class ChannelsOwnedRequestBuilder implements PagingBuilder<ChannelsOwnedRequestBuilder> {

        private Long limit;
        private String sinceId;
        private String untilId;

        private ChannelsOwnedRequestBuilder() {
        }

        @Override
        public ChannelsOwnedRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        @Override
        public ChannelsOwnedRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        @Override
        public ChannelsOwnedRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public ChannelsOwnedRequest build() {
            ChannelsOwnedRequest request = new ChannelsOwnedRequest();
            request.sinceId = this.sinceId;
            request.limit = this.limit;
            request.untilId = this.untilId;
            return request;
        }
    }
    // endregion
}
