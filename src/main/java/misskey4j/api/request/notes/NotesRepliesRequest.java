package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;

public class NotesRepliesRequest extends TokenRequest {

    public static NotesRepliesRequestBuilder builder() {
        return new NotesRepliesRequestBuilder();
    }

    private String noteId;
    private String sinceId;
    private String untilId;
    private Long limit;

    // region
    public String getNoteId() {
        return noteId;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public Long getLimit() {
        return limit;
    }

    public static final class NotesRepliesRequestBuilder {
        private String noteId;
        private String sinceId;
        private String untilId;
        private Long limit;

        private NotesRepliesRequestBuilder() {
        }


        public NotesRepliesRequestBuilder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public NotesRepliesRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public NotesRepliesRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public NotesRepliesRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesRepliesRequest build() {
            NotesRepliesRequest notesRepliesRequest = new NotesRepliesRequest();
            notesRepliesRequest.noteId = this.noteId;
            notesRepliesRequest.sinceId = this.sinceId;
            notesRepliesRequest.untilId = this.untilId;
            notesRepliesRequest.limit = this.limit;
            return notesRepliesRequest;
        }
    }
    // endregion
}
