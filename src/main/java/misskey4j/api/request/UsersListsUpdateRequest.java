package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class UsersListsUpdateRequest extends TokenRequest {

    private String listId;

    private String name;


    public UsersListsUpdateRequest(String listId, String name) {
        this.listId = listId;
        this.name = name;
    }

    public String getListId() {
        return listId;
    }

    public String getName() {
        return name;
    }
}
