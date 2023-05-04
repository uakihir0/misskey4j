package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.FullPagingBuilder;

public class NotesGlobalTimelineRequest extends TokenRequest {

    public static NotesGlobalTimelineRequestBuilder builder() {
        return new NotesGlobalTimelineRequestBuilder();
    }

    private Boolean withFiles;
    private Long limit;

    private String sinceId;
    private String untilId;

    private Long sinceDate;
    private Long untilDate;

    // region
    public Boolean getWithFiles() {
        return withFiles;
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

    public static final class NotesGlobalTimelineRequestBuilder
            implements FullPagingBuilder<NotesGlobalTimelineRequestBuilder> {

        private Boolean withFiles;
        private Long limit;
        private String sinceId;
        private String untilId;
        private Long sinceDate;
        private Long untilDate;

        private NotesGlobalTimelineRequestBuilder() {
        }

        public NotesGlobalTimelineRequestBuilder withFiles(Boolean withFiles) {
            this.withFiles = withFiles;
            return this;
        }

        public NotesGlobalTimelineRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesGlobalTimelineRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public NotesGlobalTimelineRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public NotesGlobalTimelineRequestBuilder sinceDate(Long sinceDate) {
            this.sinceDate = sinceDate;
            return this;
        }

        public NotesGlobalTimelineRequestBuilder untilDate(Long untilDate) {
            this.untilDate = untilDate;
            return this;
        }

        public NotesGlobalTimelineRequest build() {
            NotesGlobalTimelineRequest notesGlobalTimelineRequest = new NotesGlobalTimelineRequest();
            notesGlobalTimelineRequest.limit = this.limit;
            notesGlobalTimelineRequest.sinceDate = this.sinceDate;
            notesGlobalTimelineRequest.untilDate = this.untilDate;
            notesGlobalTimelineRequest.sinceId = this.sinceId;
            notesGlobalTimelineRequest.withFiles = this.withFiles;
            notesGlobalTimelineRequest.untilId = this.untilId;
            return notesGlobalTimelineRequest;
        }
    }

    // endregion
}
