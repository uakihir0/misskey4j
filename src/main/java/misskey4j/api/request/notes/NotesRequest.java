package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;

public class NotesRequest extends TokenRequest {

    public static NotesRequestBuilder builder() {
        return new NotesRequestBuilder();
    }

    private Boolean local;
    private Boolean reply;
    private Boolean renote;
    private Boolean withFiles;
    private Boolean poll;

    private Long limit;
    private String sinceId;
    private String untilId;

    // region
    public Boolean getLocal() {
        return local;
    }

    public Boolean getReply() {
        return reply;
    }

    public Boolean getRenote() {
        return renote;
    }

    public Boolean getWithFiles() {
        return withFiles;
    }

    public Boolean getPoll() {
        return poll;
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

    public static final class NotesRequestBuilder {
        private Boolean local;
        private Boolean reply;
        private Boolean renote;
        private Boolean withFiles;
        private Boolean poll;
        private Long limit;
        private String sinceId;
        private String untilId;

        private NotesRequestBuilder() {
        }

        public NotesRequestBuilder local(Boolean local) {
            this.local = local;
            return this;
        }

        public NotesRequestBuilder reply(Boolean reply) {
            this.reply = reply;
            return this;
        }

        public NotesRequestBuilder renote(Boolean renote) {
            this.renote = renote;
            return this;
        }

        public NotesRequestBuilder withFiles(Boolean withFiles) {
            this.withFiles = withFiles;
            return this;
        }

        public NotesRequestBuilder poll(Boolean poll) {
            this.poll = poll;
            return this;
        }

        public NotesRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public NotesRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public NotesRequest build() {
            NotesRequest notesRequest = new NotesRequest();
            notesRequest.untilId = this.untilId;
            notesRequest.limit = this.limit;
            notesRequest.sinceId = this.sinceId;
            notesRequest.local = this.local;
            notesRequest.reply = this.reply;
            notesRequest.renote = this.renote;
            notesRequest.withFiles = this.withFiles;
            notesRequest.poll = this.poll;
            return notesRequest;
        }
    }

    // endregion
}


