package misskey4j.api.request.mute;

import misskey4j.api.model.TokenRequest;

public class MuteDeleteRequest extends TokenRequest {

    public static MuteDeleteRequestBuilder builder() {
        return new MuteDeleteRequestBuilder();
    }

    private String userId;

    // region
    public String getUserId() {
        return userId;
    }

    public static final class MuteDeleteRequestBuilder {
        private String userId;

        private MuteDeleteRequestBuilder() {
        }

        public MuteDeleteRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public MuteDeleteRequest build() {
            MuteDeleteRequest muteDeleteRequest = new MuteDeleteRequest();
            muteDeleteRequest.userId = this.userId;
            return muteDeleteRequest;
        }
    }
    // endregion
}
