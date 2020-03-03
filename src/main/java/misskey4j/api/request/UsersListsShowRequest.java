package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class UsersListsShowRequest extends TokenRequest {

    public static UsersListsShowRequestBuilder builder() {
        return new UsersListsShowRequestBuilder();
    }

    private String listId;

    // region
    public String getListId() {
        return listId;
    }

    public static final class UsersListsShowRequestBuilder {
        private String listId;

        private UsersListsShowRequestBuilder() {
        }

        public UsersListsShowRequestBuilder listId(String listId) {
            this.listId = listId;
            return this;
        }

        public UsersListsShowRequest build() {
            UsersListsShowRequest usersListsShowRequest = new UsersListsShowRequest();
            usersListsShowRequest.listId = this.listId;
            return usersListsShowRequest;
        }
    }
    // endregion
}
