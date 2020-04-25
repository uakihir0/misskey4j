package misskey4j.api.request.users;

import misskey4j.api.model.TokenRequest;

public class UsersShowSingleRequest extends TokenRequest {

    public static UsersShowSingleRequestBuilder builder() {
        return new UsersShowSingleRequestBuilder();
    }

    private String userId;
    private String username;
    private String host;

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

    public static final class UsersShowSingleRequestBuilder {
        private String userId;
        private String username;
        private String host;

        private UsersShowSingleRequestBuilder() {
        }


        public UsersShowSingleRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UsersShowSingleRequestBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UsersShowSingleRequestBuilder host(String host) {
            this.host = host;
            return this;
        }

        public UsersShowSingleRequest build() {
            UsersShowSingleRequest usersShowSingleRequest = new UsersShowSingleRequest();
            usersShowSingleRequest.userId = this.userId;
            usersShowSingleRequest.username = this.username;
            usersShowSingleRequest.host = this.host;
            return usersShowSingleRequest;
        }
    }
    // endregion
}
