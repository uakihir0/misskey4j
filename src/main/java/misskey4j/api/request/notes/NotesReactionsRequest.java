package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

public class NotesReactionsRequest extends TokenRequest {

    public static NotesReactionsRequestBuilder builder() {
        return new NotesReactionsRequestBuilder();
    }

    private String noteId;
    private String type;
    private Long limit;
    private Long offset;
    private String sinceId;
    private String untilId;

    // region
    public String getNoteId() {
        return noteId;
    }

    public String getType() {
        return type;
    }

    public Long getLimit() {
        return limit;
    }

    public Long getOffset() {
        return offset;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public static final class NotesReactionsRequestBuilder
            implements PagingBuilder<NotesReactionsRequestBuilder> {

        private String noteId;
        private String type;
        private Long limit;
        private Long offset;
        private String sinceId;
        private String untilId;

        private NotesReactionsRequestBuilder() {
        }

        public NotesReactionsRequestBuilder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public NotesReactionsRequestBuilder type(String type) {
            this.type = type;
            return this;
        }

        public NotesReactionsRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesReactionsRequestBuilder offset(Long offset) {
            this.offset = offset;
            return this;
        }

        public NotesReactionsRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public NotesReactionsRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public NotesReactionsRequest build() {
            NotesReactionsRequest request = new NotesReactionsRequest();
            request.noteId = this.noteId;
            request.type = this.type;
            request.limit = this.limit;
            request.offset = this.offset;
            request.sinceId = this.sinceId;
            request.untilId = this.untilId;
            return request;
        }
    }

    // endregion
}
