package misskey4j.api.request;

public class UserKeyAuthSessionRequest {

    public static UserKeyAuthSessionRequestBuilder builder() {
        return new UserKeyAuthSessionRequestBuilder();
    }

    private String appSecret;
    private String token;

    // region
    public String getAppSecret() {
        return appSecret;
    }

    public String getToken() {
        return token;
    }

    public static final class UserKeyAuthSessionRequestBuilder {
        private String appSecret;
        private String token;

        private UserKeyAuthSessionRequestBuilder() {
        }

        public UserKeyAuthSessionRequestBuilder appSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        public UserKeyAuthSessionRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UserKeyAuthSessionRequest build() {
            UserKeyAuthSessionRequest userKeyAuthSessionRequest = new UserKeyAuthSessionRequest();
            userKeyAuthSessionRequest.token = this.token;
            userKeyAuthSessionRequest.appSecret = this.appSecret;
            return userKeyAuthSessionRequest;
        }
    }
    // endregion
}
