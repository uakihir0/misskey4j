package misskey4j.api.request.users;

import misskey4j.api.model.TokenRequest;

public class CreateFollowRequest extends TokenRequest {

    public static CreateFollowRequestBuilder builder() {
        return new CreateFollowRequestBuilder();
    }

    private String userId;

    // region
    public String getUserId() {
        return userId;
    }

    public static final class CreateFollowRequestBuilder {
        private String userId;

        private CreateFollowRequestBuilder() {
        }

        public CreateFollowRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public CreateFollowRequest build() {
            CreateFollowRequest createFollowRequest = new CreateFollowRequest();
            createFollowRequest.userId = this.userId;
            return createFollowRequest;
        }
    }
    // endregion
}
