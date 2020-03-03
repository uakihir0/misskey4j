package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;

public class NotesDeleteRequest extends TokenRequest {

    public static NotesDeleteRequestBuilder builder() {
        return new NotesDeleteRequestBuilder();
    }

    private String noteId;

    // region
    public String getNoteId() {
        return noteId;
    }

    public static final class NotesDeleteRequestBuilder {
        private String noteId;

        private NotesDeleteRequestBuilder() {
        }


        public NotesDeleteRequestBuilder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public NotesDeleteRequest build() {
            NotesDeleteRequest notesDeleteRequest = new NotesDeleteRequest();
            notesDeleteRequest.noteId = this.noteId;
            return notesDeleteRequest;
        }
    }
    // endregion
}
