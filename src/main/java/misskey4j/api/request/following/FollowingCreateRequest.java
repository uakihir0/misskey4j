package misskey4j.api.request.following;

import misskey4j.api.model.TokenRequest;

public class FollowingCreateRequest extends TokenRequest {

    public static FollowingCreateRequestBuilder builder() {
        return new FollowingCreateRequestBuilder();
    }

    private String userId;

    // region
    public String getUserId() {
        return userId;
    }

    public static final class FollowingCreateRequestBuilder {
        private String userId;

        private FollowingCreateRequestBuilder() {
        }

        public FollowingCreateRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public FollowingCreateRequest build() {
            FollowingCreateRequest followingCreateRequest = new FollowingCreateRequest();
            followingCreateRequest.userId = this.userId;
            return followingCreateRequest;
        }
    }

    // endregion
}
