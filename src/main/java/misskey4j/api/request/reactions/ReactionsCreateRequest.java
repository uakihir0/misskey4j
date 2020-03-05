package misskey4j.api.request.reactions;

import misskey4j.api.model.TokenRequest;

public class ReactionsCreateRequest extends TokenRequest {

    public static ReactionsCreateRequestBuilder builder() {
        return new ReactionsCreateRequestBuilder();
    }

    private String noteId;
    private String reaction;

    // region
    public String getNoteId() {
        return noteId;
    }

    public String getReaction() {
        return reaction;
    }

    public static final class ReactionsCreateRequestBuilder {
        private String noteId;
        private String reaction;

        private ReactionsCreateRequestBuilder() {
        }

        public ReactionsCreateRequestBuilder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public ReactionsCreateRequestBuilder reaction(String reaction) {
            this.reaction = reaction;
            return this;
        }

        public ReactionsCreateRequest build() {
            ReactionsCreateRequest reactionsCreateRequest = new ReactionsCreateRequest();
            reactionsCreateRequest.noteId = this.noteId;
            reactionsCreateRequest.reaction = this.reaction;
            return reactionsCreateRequest;
        }
    }
    // endregion
}

