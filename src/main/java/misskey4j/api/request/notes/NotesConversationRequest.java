package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;

public class NotesConversationRequest extends TokenRequest {

    public static NotesConversationRequestBuilder builder() {
        return new NotesConversationRequestBuilder();
    }

    private String noteId;

    private Long limit;
    private Long offset;

    // region
    public String getNoteId() {
        return noteId;
    }

    public Long getLimit() {
        return limit;
    }

    public Long getOffset() {
        return offset;
    }

    public static final class NotesConversationRequestBuilder {
        private String noteId;
        private Long limit;
        private Long offset;

        private NotesConversationRequestBuilder() {
        }

        public NotesConversationRequestBuilder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public NotesConversationRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesConversationRequestBuilder offset(Long offset) {
            this.offset = offset;
            return this;
        }

        public NotesConversationRequest build() {
            NotesConversationRequest notesConversationRequest = new NotesConversationRequest();
            notesConversationRequest.limit = this.limit;
            notesConversationRequest.noteId = this.noteId;
            notesConversationRequest.offset = this.offset;
            return notesConversationRequest;
        }
    }
    // endregion
}
