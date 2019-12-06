package misskey4j.api.request.users;

public class UsersFollowingsRequest {

    public static UsersFollowingsRequestBuilder builder() {
        return new UsersFollowingsRequestBuilder();
    }

    private String userId;
    private String username;
    private String host;

    private String sinceId;
    private String untilId;

    private Long limit;

    // region
    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getHost() {
        return host;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public Long getLimit() {
        return limit;
    }

    public static final class UsersFollowingsRequestBuilder {
        private String userId;
        private String username;
        private String host;
        private String sinceId;
        private String untilId;
        private Long limit;

        private UsersFollowingsRequestBuilder() {
        }

        public UsersFollowingsRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UsersFollowingsRequestBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UsersFollowingsRequestBuilder host(String host) {
            this.host = host;
            return this;
        }

        public UsersFollowingsRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public UsersFollowingsRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public UsersFollowingsRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public UsersFollowingsRequest build() {
            UsersFollowingsRequest usersFollowingsRequest = new UsersFollowingsRequest();
            usersFollowingsRequest.userId = this.userId;
            usersFollowingsRequest.username = this.username;
            usersFollowingsRequest.limit = this.limit;
            usersFollowingsRequest.host = this.host;
            usersFollowingsRequest.sinceId = this.sinceId;
            usersFollowingsRequest.untilId = this.untilId;
            return usersFollowingsRequest;
        }
    }
    // endregion
}
