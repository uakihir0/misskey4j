package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class UsersListsListRequest extends TokenRequest {

    public static UsersListsListRequestBuilder builder() {
        return new UsersListsListRequestBuilder();
    }

    public static final class UsersListsListRequestBuilder {

        private UsersListsListRequestBuilder() {
        }

        public UsersListsListRequest build() {
            return new UsersListsListRequest();
        }
    }
}
