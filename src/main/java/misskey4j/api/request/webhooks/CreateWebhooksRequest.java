package misskey4j.api.request.webhooks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import misskey4j.api.model.TokenRequest;
import misskey4j.entity.contant.WebhooksType;

public class CreateWebhooksRequest extends TokenRequest  {

    public static CreateWebhooksBuilder builder() {
        return new CreateWebhooksBuilder();
    }

    private String name;
    private String url;
    private List<String> on;
    private String secret;

    // region
    public String getName() {
        return name;
    }

    public String geturl() {
        return url;
    }

    public List<String> geton() {
        return on;
    }

    public String getsecret() {
        return secret;
    }

    public static final class CreateWebhooksBuilder {
        private String name;
        private String url;
        private List<String> on;
        private String secret;

        private CreateWebhooksBuilder() {
        }

        public CreateWebhooksBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CreateWebhooksBuilder url(String url) {
            this.url = url;
            return this;
        }

        public CreateWebhooksBuilder on(List<String> on) {
            this.on = on;
            return this;
        }

        public CreateWebhooksBuilder on(WebhooksType[] on) {
            this.on = Stream.of(on)
                    .map(WebhooksType::code)
                    .collect(Collectors.toList());
            return this;
        }

        public CreateWebhooksBuilder secret(String secret) {
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
