package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;

public class NotesChildrenRequest extends TokenRequest {

    public static NotesChildrenRequestBuilder builder() {
        return new NotesChildrenRequestBuilder();
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

    public static final class NotesChildrenRequestBuilder {
        private String noteId;
        private Long limit;
        private String sinceId;
        private String untilId;

        private NotesChildrenRequestBuilder() {
        }

        public NotesChildrenRequestBuilder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public NotesChildrenRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesChildrenRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public NotesChildrenRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public NotesChildrenRequest build() {
            NotesChildrenRequest notesChildrenRequest = new NotesChildrenRequest();
            notesChildrenRequest.limit = this.limit;
            notesChildrenRequest.noteId = this.noteId;
            notesChildrenRequest.untilId = this.untilId;
            notesChildrenRequest.sinceId = this.sinceId;
            return notesChildrenRequest;
        }
    }
    // endregion
}