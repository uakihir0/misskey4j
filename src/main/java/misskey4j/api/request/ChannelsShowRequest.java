package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class ChannelsShowRequest extends TokenRequest {

    public static ChannelsShowRequestBuilder builder() {
        return new ChannelsShowRequestBuilder();
    }

    private String channelId;

    // region
    public String getChannelId() {
        return channelId;
    }

    public static final class ChannelsShowRequestBuilder {

        private String channelId;

        private ChannelsShowRequestBuilder() {
        }

        public ChannelsShowRequestBuilder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        public ChannelsShowRequest build() {
            ChannelsShowRequest channelsTimelineRequest = new ChannelsShowRequest();
            channelsTimelineRequest.channelId = this.channelId;
            return channelsTimelineRequest;
        }
    }
    // endregion
}