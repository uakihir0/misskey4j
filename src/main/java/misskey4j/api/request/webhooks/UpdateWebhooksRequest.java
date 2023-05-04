package misskey4j.api.request.webhooks;

import misskey4j.api.model.TokenRequest;
import misskey4j.entity.contant.WebhooksType;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpdateWebhooksRequest extends TokenRequest {

    public static CreateWebhooksRequestBuilder builder() {
        return new CreateWebhooksRequestBuilder();
    }

    private String webhookId;
    private String name;
    private String url;
    private List<String> on;
    private String secret;
    private Boolean active;

    // region
    public String getWebhookId() {
        return webhookId;
    }

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

    public Boolean getActive() {
        return active;
    }

    public static final class CreateWebhooksRequestBuilder {
        private String webhookId;
        private String name;
        private String url;
        private List<String> on;
        private String secret;
        private Boolean active;

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

        public CreateWebhooksRequestBuilder webhookId(String webhookId) {
            this.webhookId = webhookId;
            return this;
        }

        public CreateWebhooksRequestBuilder active(Boolean active) {
            this.active = active;
            return this;
        }

        public UpdateWebhooksRequest build() {
            UpdateWebhooksRequest createAppRequest = new UpdateWebhooksRequest();
            createAppRequest.on = this.on;
            createAppRequest.secret = this.secret;
            createAppRequest.name = this.name;
            createAppRequest.url = this.url;
            createAppRequest.webhookId = this.webhookId;
            createAppRequest.active = this.active;
            return createAppRequest;
        }
    }
    // endregion
}
