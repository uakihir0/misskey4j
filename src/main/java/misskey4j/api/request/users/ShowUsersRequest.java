package misskey4j.api.request.users;

import java.util.List;

public class ShowUsersRequest {

    public static ShowUsersRequestBuilder builder() {
        return new ShowUsersRequestBuilder();
    }

    private String userId;
    private List<String> userIds;

    private String username;
    private String host;

    // region
    public String getUserId() {
        return userId;
    }

    public List<String> getUserIds() {
        return userIds;
    }

    public String getUsername() {
        return username;
    }

    public String getHost() {
        return host;
    }

    public static final class ShowUsersRequestBuilder {
        private String userId;
        private List<String> userIds;
        private String username;
        private String host;

        private ShowUsersRequestBuilder() {
        }

        public ShowUsersRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public ShowUsersRequestBuilder userIds(List<String> userIds) {
            this.userIds = userIds;
            return this;
        }

        public ShowUsersRequestBuilder username(String username) {
            this.username = username;
            return this;
        }

        public ShowUsersRequestBuilder host(String host) {
            this.host = host;
            return this;
        }

        public ShowUsersRequest build() {
            ShowUsersRequest showUsersRequest = new ShowUsersRequest();
            showUsersRequest.host = this.host;
            showUsersRequest.userIds = this.userIds;
            showUsersRequest.username = this.username;
            showUsersRequest.userId = this.userId;
            return showUsersRequest;
        }
    }
    // endregion
}
