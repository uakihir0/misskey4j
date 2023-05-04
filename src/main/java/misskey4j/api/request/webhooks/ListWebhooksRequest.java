package misskey4j.api.request.webhooks;

import misskey4j.api.model.TokenRequest;

public class ListWebhooksRequest extends TokenRequest {

    public static DeleteWebhooksBuilder builder() {
        return new DeleteWebhooksBuilder();
    }


    // region
    public static final class DeleteWebhooksBuilder {
        private String webhookId;

        private DeleteWebhooksBuilder() {
        }

        public ListWebhooksRequest build() {
            ListWebhooksRequest createAppRequest = new ListWebhooksRequest();
            return createAppRequest;
        }
    }
    // endregion
}
