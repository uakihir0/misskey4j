package misskey4j.api.request.webhooks;

import misskey4j.api.model.TokenRequest;

public class DeleteWebhooksRequest extends TokenRequest {

    public static DeleteWebhooksRequestBuilder builder() {
        return new DeleteWebhooksRequestBuilder();
    }

    private String webhookId;

    // region
    public String getWebhookId() {
        return webhookId;
    }

    public static final class DeleteWebhooksRequestBuilder {
        private String webhookId;

        private DeleteWebhooksRequestBuilder() {
        }

        public DeleteWebhooksRequestBuilder webhookId(String webhookId) {
            this.webhookId = webhookId;
            return this;
        }


        public DeleteWebhooksRequest build() {
            DeleteWebhooksRequest createAppRequest = new DeleteWebhooksRequest();
            createAppRequest.webhookId = this.webhookId;
            return createAppRequest;
        }
    }
    // endregion
}
