package misskey4j.api.request.users;

import java.util.Collections;
import java.util.List;

public class UsersShowRequest {

    public static UsersShowRequestBuilder builder() {
        return new UsersShowRequestBuilder();
    }

    private List<String> userIds;
    private String username;
    private String host;

    // region
    public List<String> getUserIds() {
        return userIds;
    }

    public String getUsername() {
        return username;
    }

    public String getHost() {
        return host;
    }

    public static final class UsersShowRequestBuilder {

        private List<String> userIds;
        private String username;
        private String host;

        private UsersShowRequestBuilder() {
        }

        public UsersShowRequestBuilder userId(String userId) {
            this.userIds = Collections.singletonList(userId);
            return this;
        }

        public UsersShowRequestBuilder userIds(List<String> userIds) {
            this.userIds = userIds;
            return this;
        }

        public UsersShowRequestBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UsersShowRequestBuilder host(String host) {
            this.host = host;
            return this;
        }

        public UsersShowRequest build() {
            UsersShowRequest usersShowRequest = new UsersShowRequest();
            usersShowRequest.host = this.host;
            usersShowRequest.userIds = this.userIds;
            usersShowRequest.username = this.username;
            return usersShowRequest;
        }
    }
    // endregion
}
