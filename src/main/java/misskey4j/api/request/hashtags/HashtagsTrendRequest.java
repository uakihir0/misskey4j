package misskey4j.api.request.hashtags;

public class HashtagsTrendRequest {

    public static HashtagsTrendRequestBuilder builder() {
        return new HashtagsTrendRequestBuilder();
    }

    public static final class HashtagsTrendRequestBuilder {

        private HashtagsTrendRequestBuilder() {
        }

        public HashtagsTrendRequest build() {
            return new HashtagsTrendRequest();
        }
    }
}
