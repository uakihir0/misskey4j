package misskey4j.api.request.users;

import misskey4j.api.model.TokenRequest;

import java.util.List;

public class UsersShowMultipleRequest extends TokenRequest {

    public static UsersShowMultipleRequestBuilder builder() {
        return new UsersShowMultipleRequestBuilder();
    }

    private List<String> userIds;

    // region
    public List<String> getUserIds() {
        return userIds;
    }

    public static final class UsersShowMultipleRequestBuilder {
        private List<String> userIds;

        private UsersShowMultipleRequestBuilder() {
        }

        public UsersShowMultipleRequestBuilder userIds(List<String> userIds) {
            this.userIds = userIds;
            return this;
        }

        public UsersShowMultipleRequest build() {
            UsersShowMultipleRequest usersShowMultipleRequest = new UsersShowMultipleRequest();
            usersShowMultipleRequest.userIds = this.userIds;
            return usersShowMultipleRequest;
        }
    }
    // endregion
}
