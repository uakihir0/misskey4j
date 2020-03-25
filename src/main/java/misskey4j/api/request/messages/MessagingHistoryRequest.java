package misskey4j.api.request.messages;

import misskey4j.api.model.TokenRequest;

public class MessagingHistoryRequest extends TokenRequest {

    public static MessagingHistoryRequestBuilder builder() {
        return new MessagingHistoryRequestBuilder();
    }

    private Long limit;
    private Boolean group;

    // region
    public Long getLimit() {
        return limit;
    }

    public Boolean getGroup() {
        return group;
    }

    public static final class MessagingHistoryRequestBuilder {
        private Long limit;
        private Boolean group;

        private MessagingHistoryRequestBuilder() {
        }

        public MessagingHistoryRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public MessagingHistoryRequestBuilder group(Boolean group) {
            this.group = group;
            return this;
        }

        public MessagingHistoryRequest build() {
            MessagingHistoryRequest messagingHistoryRequest = new MessagingHistoryRequest();
            messagingHistoryRequest.limit = this.limit;
            messagingHistoryRequest.group = this.group;
            return messagingHistoryRequest;
        }
    }
    // endregion
}
