package misskey4j.api.request.mutes;

import misskey4j.api.model.TokenRequest;

public class MutesCreateRequest extends TokenRequest {

    public static MutesCreateRequestBuilder builder() {
        return new MutesCreateRequestBuilder();
    }

    private String userId;

    // region
    public String getUserId() {
        return userId;
    }

    public static final class MutesCreateRequestBuilder {
        private String userId;

        private MutesCreateRequestBuilder() {
        }

        public MutesCreateRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public MutesCreateRequest build() {
            MutesCreateRequest mutesCreateRequest = new MutesCreateRequest();
            mutesCreateRequest.userId = this.userId;
            return mutesCreateRequest;
        }
    }
    // endregion
}
