package misskey4j.api.request;

public class GenerateAuthSessionRequest {

    public static GenerateAuthSessionRequestBuilder builder() {
        return new GenerateAuthSessionRequestBuilder();
    }

    private String appSecret;

    // region
    public String getAppSecret() {
        return appSecret;
    }

    public static final class GenerateAuthSessionRequestBuilder {
        private String appSecret;

        private GenerateAuthSessionRequestBuilder() {
        }

        public GenerateAuthSessionRequestBuilder appSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        public GenerateAuthSessionRequest build() {
            GenerateAuthSessionRequest generateAuthSessionRequest = new GenerateAuthSessionRequest();
            generateAuthSessionRequest.appSecret = this.appSecret;
            return generateAuthSessionRequest;
        }
    }
    // endregion
}


