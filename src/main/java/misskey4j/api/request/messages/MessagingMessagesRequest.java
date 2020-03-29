package misskey4j.api.request.messages;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

public class MessagingMessagesRequest extends TokenRequest {

    public static MessagingMessagesRequestBuilder builder() {
        return new MessagingMessagesRequestBuilder();
    }

    private String userId;
    private String groupId;
    private Long limit;

    private String sinceId;
    private String untilId;

    private Boolean markAsRead;

    // region
    public String getUserId() {
        return userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public Long getLimit() {
        return limit;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public Boolean getMarkAsRead() {
        return markAsRead;
    }

    public static final class MessagingMessagesRequestBuilder
            implements PagingBuilder<MessagingMessagesRequestBuilder> {
        
        private String userId;
        private String groupId;
        private Long limit;
        private String sinceId;
        private String untilId;
        private Boolean markAsRead;

        private MessagingMessagesRequestBuilder() {
        }

        public MessagingMessagesRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public MessagingMessagesRequestBuilder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public MessagingMessagesRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public MessagingMessagesRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public MessagingMessagesRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public MessagingMessagesRequestBuilder markAsRead(Boolean markAsRead) {
            this.markAsRead = markAsRead;
            return this;
        }

        public MessagingMessagesRequest build() {
            MessagingMessagesRequest messagingMessagesRequest = new MessagingMessagesRequest();
            messagingMessagesRequest.sinceId = this.sinceId;
            messagingMessagesRequest.userId = this.userId;
            messagingMessagesRequest.markAsRead = this.markAsRead;
            messagingMessagesRequest.groupId = this.groupId;
            messagingMessagesRequest.limit = this.limit;
            messagingMessagesRequest.untilId = this.untilId;
            return messagingMessagesRequest;
        }
    }
    // endregion
}
