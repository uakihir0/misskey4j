package misskey4j.api.request.messages;

import misskey4j.api.model.TokenRequest;

public class MessagingMessagesCreateRequest extends TokenRequest {

    public static MessagingMessagesCreateRequestBuilder builder() {
        return new MessagingMessagesCreateRequestBuilder();
    }

    private String userId;
    private String groupId;
    private String text;
    private String fileId;

    // region
    public String getUserId() {
        return userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getText() {
        return text;
    }

    public String getFileId() {
        return fileId;
    }

    public static final class MessagingMessagesCreateRequestBuilder {
        private String userId;
        private String groupId;
        private String text;
        private String fileId;

        private MessagingMessagesCreateRequestBuilder() {
        }

        public MessagingMessagesCreateRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public MessagingMessagesCreateRequestBuilder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public MessagingMessagesCreateRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public MessagingMessagesCreateRequestBuilder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public MessagingMessagesCreateRequest build() {
            MessagingMessagesCreateRequest messagingMessagesCreateRequest = new MessagingMessagesCreateRequest();
            messagingMessagesCreateRequest.fileId = this.fileId;
            messagingMessagesCreateRequest.text = this.text;
            messagingMessagesCreateRequest.userId = this.userId;
            messagingMessagesCreateRequest.groupId = this.groupId;
            return messagingMessagesCreateRequest;
        }
    }
    // endregion
}
