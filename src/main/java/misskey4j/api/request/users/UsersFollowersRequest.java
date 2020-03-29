package misskey4j.api.request.users;

import misskey4j.api.request.protocol.PagingBuilder;

public class UsersFollowersRequest {

    public static UsersFollowersRequestBuilder builder() {
        return new UsersFollowersRequestBuilder();
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

    public static final class UsersFollowersRequestBuilder
            implements PagingBuilder<UsersFollowersRequestBuilder> {

        private String userId;
        private String username;
        private String host;
        private String sinceId;
        private String untilId;
        private Long limit;

        private UsersFollowersRequestBuilder() {
        }

        public UsersFollowersRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UsersFollowersRequestBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UsersFollowersRequestBuilder host(String host) {
            this.host = host;
            return this;
        }

        public UsersFollowersRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public UsersFollowersRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public UsersFollowersRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public UsersFollowersRequest build() {
            UsersFollowersRequest usersFollowersRequest = new UsersFollowersRequest();
            usersFollowersRequest.host = this.host;
            usersFollowersRequest.username = this.username;
            usersFollowersRequest.sinceId = this.sinceId;
            usersFollowersRequest.untilId = this.untilId;
            usersFollowersRequest.userId = this.userId;
            usersFollowersRequest.limit = this.limit;
            return usersFollowersRequest;
        }
    }
    // endregion
}
