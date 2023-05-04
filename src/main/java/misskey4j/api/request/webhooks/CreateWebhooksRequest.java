package misskey4j.api.request.webhooks;

import misskey4j.api.model.TokenRequest;
import misskey4j.entity.contant.WebhooksType;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateWebhooksRequest extends TokenRequest {

    public static CreateWebhooksRequestBuilder builder() {
        return new CreateWebhooksRequestBuilder();
    }

    private String name;
    private String url;
    private List<String> on;
    private String secret;

    // region
    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public List<String> getOn() {
        return on;
    }

    public String getSecret() {
        return secret;
    }

    public static final class CreateWebhooksRequestBuilder {
        private String name;
        private String url;
        private List<String> on;
        private String secret;

        private CreateWebhooksRequestBuilder() {
        }

        public CreateWebhooksRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CreateWebhooksRequestBuilder url(String url) {
            this.url = url;
            return this;
        }

        public CreateWebhooksRequestBuilder on(List<String> on) {
            this.on = on;
            return this;
        }

        public CreateWebhooksRequestBuilder on(WebhooksType[] on) {
            this.on = Stream.of(on)
                    .map(WebhooksType::code)
                    .collect(Collectors.toList());
            return this;
        }

        public CreateWebhooksRequestBuilder secret(String secret) {
            this.secret = secret;
            return this;
        }

        public CreateWebhooksRequest build() {
            CreateWebhooksRequest createAppRequest = new CreateWebhooksRequest();
            createAppRequest.on = this.on;
            createAppRequest.secret = this.secret;
            createAppRequest.name = this.name;
            createAppRequest.url = this.url;
            return createAppRequest;
        }
    }
    // endregion
}
