package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class ListUsersListsRequest extends TokenRequest {

    public static ListUsersListsRequestBuilder builder() {
        return new ListUsersListsRequestBuilder();
    }

    public static final class ListUsersListsRequestBuilder {

        private ListUsersListsRequestBuilder() {
        }

        public ListUsersListsRequest build() {
            return new ListUsersListsRequest();
        }
    }
}
