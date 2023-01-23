package misskey4j.api.request.meta;

public class EmojisRequest {

    public static EmojisRequestBuilder builder() {
        return new EmojisRequestBuilder();
    }

    // region
    public static final class EmojisRequestBuilder {

        private EmojisRequestBuilder() {
        }

        public EmojisRequest build() {
            EmojisRequest emojisRequest = new EmojisRequest();
            return emojisRequest;
        }
    }
    // endregion
}
