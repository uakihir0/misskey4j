package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class UsersListsCreateRequest extends TokenRequest {

    private String name;

    public UsersListsCreateRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
