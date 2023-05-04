package misskey4j.api.request.webhooks;

import misskey4j.api.model.TokenRequest;

public class ShowWebhooksRequest extends TokenRequest  {

    public static DeleteWebhooksBuilder builder() {
        return new DeleteWebhooksBuilder();
    }

    private String webhookId;


    // region
    public String getWebhookId() {
        return webhookId;
    }

    public static final class DeleteWebhooksBuilder {
        private String webhookId;

        private DeleteWebhooksBuilder() {
        }

        public DeleteWebhooksBuilder webhookId(String webhookId) {
            this.webhookId = webhookId;
            return this;
        }


        public ShowWebhooksRequest build() {
            ShowWebhooksRequest createAppRequest = new ShowWebhooksRequest();
            createAppRequest.webhookId = this.webhookId;
            return createAppRequest;
        }
    }
    // endregion
}
