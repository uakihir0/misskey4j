package misskey4j.api.request.messages;

import misskey4j.api.model.TokenRequest;

public class MessagingMessagesDeleteRequest extends TokenRequest {

    public static MessagingMessagesDeleteRequestBuilder builder() {
        return new MessagingMessagesDeleteRequestBuilder();
    }

    private String messageId;

    // region
    public String getMessageId() {
        return messageId;
    }

    public static final class MessagingMessagesDeleteRequestBuilder {
        private String messageId;

        private MessagingMessagesDeleteRequestBuilder() {
        }

        public MessagingMessagesDeleteRequestBuilder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        public MessagingMessagesDeleteRequest build() {
            MessagingMessagesDeleteRequest messagingMessagesDeleteRequest = new MessagingMessagesDeleteRequest();
            messagingMessagesDeleteRequest.messageId = this.messageId;
            return messagingMessagesDeleteRequest;
        }
    }
    // endregion
}
