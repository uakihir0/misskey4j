package misskey4j.api.request.users;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

public class UsersReactionsRequest extends TokenRequest {

    public static UsersReactionsRequestBuilder builder() {
        return new UsersReactionsRequestBuilder();
    }

    private String userId;

    private Long limit;
    private String sinceId;
    private String untilId;

    // region
    public String getUserId() {
        return userId;
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

    public static final class UsersReactionsRequestBuilder
            implements PagingBuilder<UsersReactionsRequestBuilder> {

        private String userId;

        private Long limit;
        private String sinceId;
        private String untilId;

        private UsersReactionsRequestBuilder() {
        }

        public UsersReactionsRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UsersReactionsRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public UsersReactionsRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public UsersReactionsRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public UsersReactionsRequest build() {
            UsersReactionsRequest usersReactionsRequest = new UsersReactionsRequest();
            usersReactionsRequest.userId = this.userId;
            usersReactionsRequest.limit = this.limit;
            usersReactionsRequest.sinceId = this.sinceId;
            usersReactionsRequest.untilId = this.untilId;
            return usersReactionsRequest;
        }
    }
    // endregion
}
