package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class IRequest extends TokenRequest {

    public static IRequestBuilder builder() {
        return new IRequestBuilder();
    }

    public static final class IRequestBuilder {

        private IRequestBuilder() {
        }

        public IRequest build() {
            return new IRequest();
        }
    }
}
