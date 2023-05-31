package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class UsersListsPushRequest extends TokenRequest {

    public static UsersListsPushRequestBuilder builder() {
        return new UsersListsPushRequestBuilder();
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

    public static final class UsersListsPushRequestBuilder {
        private String listId;
        private String userId;

        private UsersListsPushRequestBuilder() {
        }

        public UsersListsPushRequestBuilder listId(String listId) {
            this.listId = listId;
            return this;
        }

        public UsersListsPushRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UsersListsPushRequest build() {
            UsersListsPushRequest request = new UsersListsPushRequest();
            request.listId = this.listId;
            request.userId = this.userId;
            return request;
        }
    }
    // endregion
}
