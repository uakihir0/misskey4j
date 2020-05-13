package misskey4j.api.response.other;

public class ServiceWorkerRegisterResponse {

    private String state;
    private String key;

    // region
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    // endregion
}


