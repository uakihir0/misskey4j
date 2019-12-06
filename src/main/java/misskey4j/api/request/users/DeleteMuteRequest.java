package misskey4j.api.request.users;

import misskey4j.api.model.TokenRequest;

public class DeleteMuteRequest extends TokenRequest {

    public static DeleteMuteRequestBuilder builder() {
        return new DeleteMuteRequestBuilder();
    }

    private String userId;

    // region
    public String getUserId() {
        return userId;
    }

    public static final class DeleteMuteRequestBuilder {
        private String userId;

        private DeleteMuteRequestBuilder() {
        }

        public DeleteMuteRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public DeleteMuteRequest build() {
            DeleteMuteRequest deleteMuteRequest = new DeleteMuteRequest();
            deleteMuteRequest.userId = this.userId;
            return deleteMuteRequest;
        }
    }
    // endregion
}
