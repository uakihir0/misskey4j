package misskey4j.api.request.webhooks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import misskey4j.api.model.TokenRequest;
import misskey4j.entity.contant.WebhooksType;

public class UpdateWebhooksRequest extends TokenRequest  {

    public static CreateWebhooksBuilder builder() {
        return new CreateWebhooksBuilder();
    }

    private String webhookId;
    private String name;
    private String url;
    private List<String> on;
    private String secret;
    private Boolean active;

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

    public String getWebhookId() {
		return webhookId;
	}

	public Boolean getActive() {
		return active;
	}

	public static final class CreateWebhooksBuilder {
	    private String webhookId;
        private String name;
        private String url;
        private List<String> on;
        private String secret;
        private Boolean active;

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
        public CreateWebhooksBuilder webhookId(String webhookId) {
            this.webhookId = webhookId;
            return this;
        }

        public CreateWebhooksBuilder active(Boolean active) {
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
