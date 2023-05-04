package misskey4j.api.request.federation;

public class ShowInstanceRequest {

    private String host;

    // region
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
    // endregion
}
