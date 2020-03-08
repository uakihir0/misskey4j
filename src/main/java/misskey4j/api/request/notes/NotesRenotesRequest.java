package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;

public class NotesRenotesRequest extends TokenRequest {

    public static NotesRenotesRequestBuilder builder() {
        return new NotesRenotesRequestBuilder();
    }

    private String noteId;
    private Long limit;

    private String sinceId;
    private String untilId;

    // region
    public String getNoteId() {
        return noteId;
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

    public static final class NotesRenotesRequestBuilder {
        private String noteId;
        private Long limit;
        private String sinceId;
        private String untilId;

        private NotesRenotesRequestBuilder() {
        }

        public NotesRenotesRequestBuilder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public NotesRenotesRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesRenotesRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public NotesRenotesRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public NotesRenotesRequest build() {
            NotesRenotesRequest notesRenotesRequest = new NotesRenotesRequest();
            notesRenotesRequest.noteId = this.noteId;
            notesRenotesRequest.untilId = this.untilId;
            notesRenotesRequest.limit = this.limit;
            notesRenotesRequest.sinceId = this.sinceId;
            return notesRenotesRequest;
        }
    }
    // endregion
}
