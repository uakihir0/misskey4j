package misskey4j.api.request.mute;

import misskey4j.api.model.TokenRequest;

public class MuteCreateRequest extends TokenRequest {

    public static MuteCreateRequestBuilder builder() {
        return new MuteCreateRequestBuilder();
    }

    private String userId;

    // region
    public String getUserId() {
        return userId;
    }

    public static final class MuteCreateRequestBuilder {
        private String userId;

        private MuteCreateRequestBuilder() {
        }

        public MuteCreateRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public MuteCreateRequest build() {
            MuteCreateRequest muteCreateRequest = new MuteCreateRequest();
            muteCreateRequest.userId = this.userId;
            return muteCreateRequest;
        }
    }
    // endregion
}
