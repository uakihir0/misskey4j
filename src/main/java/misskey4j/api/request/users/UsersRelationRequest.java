package misskey4j.api.request.users;

import misskey4j.api.model.TokenRequest;

import java.util.List;

public class UsersRelationRequest extends TokenRequest {

    public static UsersRelationRequestBuilder builder() {
        return new UsersRelationRequestBuilder();
    }

    private List<String> userId;

    // region
    public List<String> getUserId() {
        return userId;
    }

    public static final class UsersRelationRequestBuilder {
        private List<String> userId;

        private UsersRelationRequestBuilder() {
        }

        public UsersRelationRequestBuilder userId(List<String> userId) {
            this.userId = userId;
            return this;
        }

        public UsersRelationRequest build() {
            UsersRelationRequest usersRelationRequest = new UsersRelationRequest();
            usersRelationRequest.userId = this.userId;
            return usersRelationRequest;
        }
    }

    // endregion
}
