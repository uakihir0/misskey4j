package misskey4j.api.response;

import misskey4j.entity.User;

public class UserKeyAuthSessionResponse {

    private String accessToken;
    private User user;

    // region
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    // endregion
}
