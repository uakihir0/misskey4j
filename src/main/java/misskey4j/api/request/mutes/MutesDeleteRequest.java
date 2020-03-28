package misskey4j.api.request.mutes;

import misskey4j.api.model.TokenRequest;

public class MutesDeleteRequest extends TokenRequest {

    public static MutesDeleteRequestBuilder builder() {
        return new MutesDeleteRequestBuilder();
    }

    private String userId;

    // region
    public String getUserId() {
        return userId;
    }

    public static final class MutesDeleteRequestBuilder {
        private String userId;

        private MutesDeleteRequestBuilder() {
        }

        public MutesDeleteRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public MutesDeleteRequest build() {
            MutesDeleteRequest mutesDeleteRequest = new MutesDeleteRequest();
            mutesDeleteRequest.userId = this.userId;
            return mutesDeleteRequest;
        }
    }
    // endregion
}
