package misskey4j.api.request.reactions;

import misskey4j.api.model.TokenRequest;

public class ReactionsDeleteRequest extends TokenRequest {

    public static ReactionsDeleteRequestBuilder builder() {
        return new ReactionsDeleteRequestBuilder();
    }

    private String noteId;

    // region
    public String getNoteId() {
        return noteId;
    }

    public static final class ReactionsDeleteRequestBuilder {
        private String noteId;

        private ReactionsDeleteRequestBuilder() {
        }

        public ReactionsDeleteRequestBuilder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public ReactionsDeleteRequest build() {
            ReactionsDeleteRequest reactionsDeleteRequest = new ReactionsDeleteRequest();
            reactionsDeleteRequest.noteId = this.noteId;
            return reactionsDeleteRequest;
        }
    }
    // endregion
}
