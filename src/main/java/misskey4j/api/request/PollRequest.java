package misskey4j.api.request;

import java.util.List;

public class PollRequest {

    public static PollRequestBuilder builder() {
        return new PollRequestBuilder();
    }

    private List<String> choices;
    private Boolean multiple;

    private Long expiresAt;
    private Long expiredAfter;

    // region
    public List<String> getChoices() {
        return choices;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public Long getExpiresAt() {
        return expiresAt;
    }

    public Long getExpiredAfter() {
        return expiredAfter;
    }

    public static final class PollRequestBuilder {
        private List<String> choices;
        private Boolean multiple;
        private Long expiresAt;
        private Long expiredAfter;

        private PollRequestBuilder() {
        }

        public PollRequestBuilder choices(List<String> choices) {
            this.choices = choices;
            return this;
        }

        public PollRequestBuilder multiple(Boolean multiple) {
            this.multiple = multiple;
            return this;
        }

        public PollRequestBuilder expiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        public PollRequestBuilder expiredAfter(Long expiredAfter) {
            this.expiredAfter = expiredAfter;
            return this;
        }

        public PollRequest build() {
            PollRequest pollRequest = new PollRequest();
            pollRequest.expiresAt = this.expiresAt;
            pollRequest.multiple = this.multiple;
            pollRequest.expiredAfter = this.expiredAfter;
            pollRequest.choices = this.choices;
            return pollRequest;
        }
    }
    // endregion
}
