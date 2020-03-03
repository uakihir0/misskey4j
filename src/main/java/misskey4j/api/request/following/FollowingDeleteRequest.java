package misskey4j.api.request.following;

import misskey4j.api.model.TokenRequest;

public class FollowingDeleteRequest extends TokenRequest {

    public static FollowingDeleteRequestBuilder builder() {
        return new FollowingDeleteRequestBuilder();
    }

    private String userId;

    // region
    public String getUserId() {
        return userId;
    }

    public static final class FollowingDeleteRequestBuilder {
        private String userId;

        private FollowingDeleteRequestBuilder() {
        }

        public FollowingDeleteRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public FollowingDeleteRequest build() {
            FollowingDeleteRequest followingDeleteRequest = new FollowingDeleteRequest();
            followingDeleteRequest.userId = this.userId;
            return followingDeleteRequest;
        }
    }
    // endregion
}
