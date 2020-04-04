package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;

public class NoteUnrenoteRequest extends TokenRequest {

    public static NoteUnrenoteRequestBuilder builder() {
        return new NoteUnrenoteRequestBuilder();
    }

    private String noteId;

    // region
    public String getNoteId() {
        return noteId;
    }

    public static final class NoteUnrenoteRequestBuilder {
        private String noteId;

        private NoteUnrenoteRequestBuilder() {
        }

        public NoteUnrenoteRequestBuilder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public NoteUnrenoteRequest build() {
            NoteUnrenoteRequest noteUnrenoteRequest = new NoteUnrenoteRequest();
            noteUnrenoteRequest.noteId = this.noteId;
            return noteUnrenoteRequest;
        }
    }
    // endregion
}
