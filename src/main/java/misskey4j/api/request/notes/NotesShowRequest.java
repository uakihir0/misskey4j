package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;

public class NotesShowRequest extends TokenRequest {

    public static NotesShowRequestBuilder builder() {
        return new NotesShowRequestBuilder();
    }

    private String noteId;

    // region
    public String getNoteId() {
        return noteId;
    }

    public static final class NotesShowRequestBuilder {
        private String noteId;

        private NotesShowRequestBuilder() {
        }

        public NotesShowRequestBuilder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public NotesShowRequest build() {
            NotesShowRequest notesShowRequest = new NotesShowRequest();
            notesShowRequest.noteId = this.noteId;
            return notesShowRequest;
        }
    }
    // endregion
}
