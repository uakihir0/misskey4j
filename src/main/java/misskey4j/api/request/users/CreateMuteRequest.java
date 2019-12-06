package misskey4j.api.request.users;

import misskey4j.api.model.TokenRequest;

public class CreateMuteRequest extends TokenRequest {

    public static CreateMuteRequestBuilder builder() {
        return new CreateMuteRequestBuilder();
    }

    private String userId;

    // region
    public String getUserId() {
        return userId;
    }

    public static final class CreateMuteRequestBuilder {
        private String userId;

        private CreateMuteRequestBuilder() {
        }

        public CreateMuteRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public CreateMuteRequest build() {
            CreateMuteRequest createMuteRequest = new CreateMuteRequest();
            createMuteRequest.userId = this.userId;
            return createMuteRequest;
        }
    }
    // endregion
}
