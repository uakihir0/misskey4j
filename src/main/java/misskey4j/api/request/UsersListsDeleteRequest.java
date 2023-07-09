package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class UsersListsDeleteRequest extends TokenRequest {

    private String listId;


    public UsersListsDeleteRequest(String listId) {
        this.listId = listId;
    }

    public String getListId() {
        return listId;
    }
}
