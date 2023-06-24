package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.FullPagingBuilder;

public class ChannelsTimelineRequest extends TokenRequest {

    public static ChannelsTimelineRequestBuilder builder() {
        return new ChannelsTimelineRequestBuilder();
    }

    private String channelId;

    private Long limit;

    private String sinceId;
    private String untilId;
    private Long sinceDate;
    private Long untilDate;

    // region
    public String getChannelId() {
        return channelId;
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

    public Long getSinceDate() {
        return sinceDate;
    }

    public Long getUntilDate() {
        return untilDate;
    }

    public static final class ChannelsTimelineRequestBuilder
            implements FullPagingBuilder<ChannelsTimelineRequestBuilder> {

        private String channelId;
        private Long limit;
        private String sinceId;
        private String untilId;
        private Long sinceDate;
        private Long untilDate;

        private ChannelsTimelineRequestBuilder() {
        }

        public ChannelsTimelineRequestBuilder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        public ChannelsTimelineRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public ChannelsTimelineRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public ChannelsTimelineRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public ChannelsTimelineRequestBuilder sinceDate(Long sinceDate) {
            this.sinceDate = sinceDate;
            return this;
        }

        public ChannelsTimelineRequestBuilder untilDate(Long untilDate) {
            this.untilDate = untilDate;
            return this;
        }

        public ChannelsTimelineRequest build() {
            ChannelsTimelineRequest channelsTimelineRequest = new ChannelsTimelineRequest();
            channelsTimelineRequest.channelId = this.channelId;
            channelsTimelineRequest.limit = this.limit;
            channelsTimelineRequest.sinceId = this.sinceId;
            channelsTimelineRequest.untilId = this.untilId;
            channelsTimelineRequest.sinceDate = this.sinceDate;
            channelsTimelineRequest.untilDate = this.untilDate;
            return channelsTimelineRequest;
        }
    }
    // endregion
}