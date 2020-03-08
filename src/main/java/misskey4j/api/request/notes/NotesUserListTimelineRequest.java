package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;

public class NotesUserListTimelineRequest extends TokenRequest {

    public static NotesUserListTimelineRequestBuilder builder() {
        return new NotesUserListTimelineRequestBuilder();
    }

    private String listId;

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
    public String getListId() {
        return listId;
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

    public static final class NotesUserListTimelineRequestBuilder {
        private String listId;
        private Long limit;
        private String sinceId;
        private String untilId;
        private Long sinceDate;
        private Long untilDate;
        private Boolean includeMyRenotes;
        private Boolean includeRenotedMyNotes;
        private Boolean includeLocalRenotes;
        private Boolean withFiles;

        private NotesUserListTimelineRequestBuilder() {
        }

        public NotesUserListTimelineRequestBuilder listId(String listId) {
            this.listId = listId;
            return this;
        }

        public NotesUserListTimelineRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesUserListTimelineRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public NotesUserListTimelineRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public NotesUserListTimelineRequestBuilder sinceDate(Long sinceDate) {
            this.sinceDate = sinceDate;
            return this;
        }

        public NotesUserListTimelineRequestBuilder untilDate(Long untilDate) {
            this.untilDate = untilDate;
            return this;
        }

        public NotesUserListTimelineRequestBuilder includeMyRenotes(Boolean includeMyRenotes) {
            this.includeMyRenotes = includeMyRenotes;
            return this;
        }

        public NotesUserListTimelineRequestBuilder includeRenotedMyNotes(Boolean includeRenotedMyNotes) {
            this.includeRenotedMyNotes = includeRenotedMyNotes;
            return this;
        }

        public NotesUserListTimelineRequestBuilder includeLocalRenotes(Boolean includeLocalRenotes) {
            this.includeLocalRenotes = includeLocalRenotes;
            return this;
        }

        public NotesUserListTimelineRequestBuilder withFiles(Boolean withFiles) {
            this.withFiles = withFiles;
            return this;
        }

        public NotesUserListTimelineRequest build() {
            NotesUserListTimelineRequest notesUserListTimelineRequest = new NotesUserListTimelineRequest();
            notesUserListTimelineRequest.sinceId = this.sinceId;
            notesUserListTimelineRequest.includeLocalRenotes = this.includeLocalRenotes;
            notesUserListTimelineRequest.untilId = this.untilId;
            notesUserListTimelineRequest.sinceDate = this.sinceDate;
            notesUserListTimelineRequest.listId = this.listId;
            notesUserListTimelineRequest.includeRenotedMyNotes = this.includeRenotedMyNotes;
            notesUserListTimelineRequest.limit = this.limit;
            notesUserListTimelineRequest.includeMyRenotes = this.includeMyRenotes;
            notesUserListTimelineRequest.untilDate = this.untilDate;
            notesUserListTimelineRequest.withFiles = this.withFiles;
            return notesUserListTimelineRequest;
        }
    }
    // endregion
}