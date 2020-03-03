package misskey4j.api.request.mute;

import misskey4j.api.model.TokenRequest;

public class MuteListRequest extends TokenRequest {

    public static MuteListRequestBuilder builder() {
        return new MuteListRequestBuilder();
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

    public static final class MuteListRequestBuilder {
        private Long limit;
        private String sinceId;
        private String untilId;

        private MuteListRequestBuilder() {
        }

        public MuteListRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public MuteListRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public MuteListRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public MuteListRequest build() {
            MuteListRequest muteListRequest = new MuteListRequest();
            muteListRequest.limit = this.limit;
            muteListRequest.sinceId = this.sinceId;
            muteListRequest.untilId = this.untilId;
            return muteListRequest;
        }
    }
    // endregion
}

