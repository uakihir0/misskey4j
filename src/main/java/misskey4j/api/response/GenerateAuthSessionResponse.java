package misskey4j.api.response;

public class GenerateAuthSessionResponse {

    private String token;
    private String url;

    // region
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    // endregion
}
