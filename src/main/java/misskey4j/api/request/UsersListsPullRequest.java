package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class UsersListsPullRequest extends TokenRequest {

    public static UsersListsPullRequestBuilder builder() {
        return new UsersListsPullRequestBuilder();
    }

    private String listId;
    private String userId;

    // region
    public String getListId() {
        return listId;
    }

    public String getUserId() {
        return userId;
    }

    public static final class UsersListsPullRequestBuilder {
        private String listId;
        private String userId;

        private UsersListsPullRequestBuilder() {
        }

        public UsersListsPullRequestBuilder listId(String listId) {
            this.listId = listId;
            return this;
        }

        public UsersListsPullRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UsersListsPullRequest build() {
            UsersListsPullRequest request = new UsersListsPullRequest();
            request.listId = this.listId;
            request.userId = this.userId;
            return request;
        }
    }
    // endregion
}
