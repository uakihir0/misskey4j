package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class ShowUsersListsRequest extends TokenRequest {

    public static ShowUsersListsRequestBuilder builder() {
        return new ShowUsersListsRequestBuilder();
    }

    private String listId;

    // region
    public String getListId() {
        return listId;
    }

    public static final class ShowUsersListsRequestBuilder {
        private String listId;

        private ShowUsersListsRequestBuilder() {
        }

        public ShowUsersListsRequestBuilder listId(String listId) {
            this.listId = listId;
            return this;
        }

        public ShowUsersListsRequest build() {
            ShowUsersListsRequest showUsersListsRequest = new ShowUsersListsRequest();
            showUsersListsRequest.listId = this.listId;
            return showUsersListsRequest;
        }
    }
    // endregion
}
