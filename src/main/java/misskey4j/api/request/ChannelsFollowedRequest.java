package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

public class ChannelsFollowedRequest extends TokenRequest {

    public static ChannelsFollowedRequestBuilder builder() {
        return new ChannelsFollowedRequestBuilder();
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

    public static final class ChannelsFollowedRequestBuilder implements PagingBuilder<ChannelsFollowedRequestBuilder> {

        private Long limit;
        private String sinceId;
        private String untilId;

        private ChannelsFollowedRequestBuilder() {
        }

        @Override
        public ChannelsFollowedRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        @Override
        public ChannelsFollowedRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        @Override
        public ChannelsFollowedRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public ChannelsFollowedRequest build() {
            ChannelsFollowedRequest request = new ChannelsFollowedRequest();
            request.sinceId = this.sinceId;
            request.limit = this.limit;
            request.untilId = this.untilId;
            return request;
        }
    }
    // endregion
}
