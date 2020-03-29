package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.FullPagingBuilder;

public class NotesHybridTimelineRequest extends TokenRequest {

    public static NotesHybridTimelineRequestBuilder builder() {
        return new NotesHybridTimelineRequestBuilder();
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

    public static final class NotesHybridTimelineRequestBuilder
            implements FullPagingBuilder<NotesHybridTimelineRequestBuilder> {
        
        private Long limit;
        private String sinceId;
        private String untilId;
        private Long sinceDate;
        private Long untilDate;
        private Boolean includeMyRenotes;
        private Boolean includeRenotedMyNotes;
        private Boolean includeLocalRenotes;
        private Boolean withFiles;

        private NotesHybridTimelineRequestBuilder() {
        }

        public NotesHybridTimelineRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesHybridTimelineRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public NotesHybridTimelineRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public NotesHybridTimelineRequestBuilder sinceDate(Long sinceDate) {
            this.sinceDate = sinceDate;
            return this;
        }

        public NotesHybridTimelineRequestBuilder untilDate(Long untilDate) {
            this.untilDate = untilDate;
            return this;
        }

        public NotesHybridTimelineRequestBuilder includeMyRenotes(Boolean includeMyRenotes) {
            this.includeMyRenotes = includeMyRenotes;
            return this;
        }

        public NotesHybridTimelineRequestBuilder includeRenotedMyNotes(Boolean includeRenotedMyNotes) {
            this.includeRenotedMyNotes = includeRenotedMyNotes;
            return this;
        }

        public NotesHybridTimelineRequestBuilder includeLocalRenotes(Boolean includeLocalRenotes) {
            this.includeLocalRenotes = includeLocalRenotes;
            return this;
        }

        public NotesHybridTimelineRequestBuilder withFiles(Boolean withFiles) {
            this.withFiles = withFiles;
            return this;
        }

        public NotesHybridTimelineRequest build() {
            NotesHybridTimelineRequest notesHybridTimelineRequest = new NotesHybridTimelineRequest();
            notesHybridTimelineRequest.limit = this.limit;
            notesHybridTimelineRequest.sinceId = this.sinceId;
            notesHybridTimelineRequest.includeMyRenotes = this.includeMyRenotes;
            notesHybridTimelineRequest.untilId = this.untilId;
            notesHybridTimelineRequest.untilDate = this.untilDate;
            notesHybridTimelineRequest.sinceDate = this.sinceDate;
            notesHybridTimelineRequest.includeLocalRenotes = this.includeLocalRenotes;
            notesHybridTimelineRequest.includeRenotedMyNotes = this.includeRenotedMyNotes;
            notesHybridTimelineRequest.withFiles = this.withFiles;
            return notesHybridTimelineRequest;
        }
    }
    // region
}
