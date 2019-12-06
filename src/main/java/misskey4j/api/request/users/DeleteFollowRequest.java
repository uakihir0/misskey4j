package misskey4j.api.request.users;

import misskey4j.api.model.TokenRequest;

public class DeleteFollowRequest extends TokenRequest {

    public static DeleteFollowRequestBuilder builder() {
        return new DeleteFollowRequestBuilder();
    }

    private String userId;

    // region
    public String getUserId() {
        return userId;
    }

    public static final class DeleteFollowRequestBuilder {
        private String userId;

        private DeleteFollowRequestBuilder() {
        }

        public DeleteFollowRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public DeleteFollowRequest build() {
            DeleteFollowRequest deleteFollowRequest = new DeleteFollowRequest();
            deleteFollowRequest.userId = this.userId;
            return deleteFollowRequest;
        }
    }
    // endregion
}
