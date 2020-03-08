package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;

public class NotesTimelineRequest extends TokenRequest {

    public static NotesTimelineRequestBuilder builder() {
        return new NotesTimelineRequestBuilder();
    }

    private Long limit;

    private String sinceId;
    private String untilId;
    private Long sinceDate;
    private Long untilDate;

    private Boolean includeMyRenotes;
    private Boolean includeRenotedMyNotes;
    private Boolean includeLocalRenotes;
    private Boolean withFiles;

    // region
    public Long getLimit() {
        return limit;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public Long getSinceDate() {
        return sinceDate;
    }

    public Long getUntilDate() {
        return untilDate;
    }

    public Boolean getIncludeMyRenotes() {
        return includeMyRenotes;
    }

    public Boolean getIncludeRenotedMyNotes() {
        return includeRenotedMyNotes;
    }

    public Boolean getIncludeLocalRenotes() {
        return includeLocalRenotes;
    }

    public Boolean getWithFiles() {
        return withFiles;
    }

    public static final class NotesTimelineRequestBuilder {
        private Long limit;
        private String sinceId;
        private String untilId;
        private Long sinceDate;
        private Long untilDate;
        private Boolean includeMyRenotes;
        private Boolean includeRenotedMyNotes;
        private Boolean includeLocalRenotes;
        private Boolean withFiles;

        private NotesTimelineRequestBuilder() {
        }


        public NotesTimelineRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesTimelineRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public NotesTimelineRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public NotesTimelineRequestBuilder sinceDate(Long sinceDate) {
            this.sinceDate = sinceDate;
            return this;
        }

        public NotesTimelineRequestBuilder untilDate(Long untilDate) {
            this.untilDate = untilDate;
            return this;
        }

        public NotesTimelineRequestBuilder includeMyRenotes(Boolean includeMyRenotes) {
            this.includeMyRenotes = includeMyRenotes;
            return this;
        }

        public NotesTimelineRequestBuilder includeRenotedMyNotes(Boolean includeRenotedMyNotes) {
            this.includeRenotedMyNotes = includeRenotedMyNotes;
            return this;
        }

        public NotesTimelineRequestBuilder includeLocalRenotes(Boolean includeLocalRenotes) {
            this.includeLocalRenotes = includeLocalRenotes;
            return this;
        }

        public NotesTimelineRequestBuilder withFiles(Boolean withFiles) {
            this.withFiles = withFiles;
            return this;
        }

        public NotesTimelineRequest build() {
            NotesTimelineRequest notesTimelineRequest = new NotesTimelineRequest();
            notesTimelineRequest.includeLocalRenotes = this.includeLocalRenotes;
            notesTimelineRequest.untilId = this.untilId;
            notesTimelineRequest.limit = this.limit;
            notesTimelineRequest.untilDate = this.untilDate;
            notesTimelineRequest.sinceId = this.sinceId;
            notesTimelineRequest.includeRenotedMyNotes = this.includeRenotedMyNotes;
            notesTimelineRequest.includeMyRenotes = this.includeMyRenotes;
            notesTimelineRequest.sinceDate = this.sinceDate;
            notesTimelineRequest.withFiles = this.withFiles;
            return notesTimelineRequest;
        }
    }
    // endregion
}
