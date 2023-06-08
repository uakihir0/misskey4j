package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class ApShowRequest extends TokenRequest {

    public static ApShowRequestBuilder builder() {
        return new ApShowRequestBuilder();
    }

    private String uri;

    // region
    public String getUri() {
        return uri;
    }

    public static final class ApShowRequestBuilder {
        private String uri;

        private ApShowRequestBuilder() {
        }

        public ApShowRequestBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public ApShowRequest build() {
            ApShowRequest request = new ApShowRequest();
            request.uri = this.uri;
            return request;
        }
    }
    // endregion
}
