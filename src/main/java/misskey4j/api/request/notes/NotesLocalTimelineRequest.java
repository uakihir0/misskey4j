package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;

import java.util.List;

public class NotesLocalTimelineRequest extends TokenRequest {

    public static NotesLocalTimelineRequestBuilder builder() {
        return new NotesLocalTimelineRequestBuilder();
    }

    private Boolean withFiles;
    private List<String> fileType;

    private Boolean excludeNsfw;
    private Long limit;

    private String sinceId;
    private String untilId;
    private Long sinceDate;
    private Long untilDate;

    // region
    public Boolean getWithFiles() {
        return withFiles;
    }

    public List<String> getFileType() {
        return fileType;
    }

    public Boolean getExcludeNsfw() {
        return excludeNsfw;
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

    public static final class NotesLocalTimelineRequestBuilder {
        private Boolean withFiles;
        private List<String> fileType;
        private Boolean excludeNsfw;
        private Long limit;
        private String sinceId;
        private String untilId;
        private Long sinceDate;
        private Long untilDate;

        private NotesLocalTimelineRequestBuilder() {
        }

        public NotesLocalTimelineRequestBuilder withFiles(Boolean withFiles) {
            this.withFiles = withFiles;
            return this;
        }

        public NotesLocalTimelineRequestBuilder fileType(List<String> fileType) {
            this.fileType = fileType;
            return this;
        }

        public NotesLocalTimelineRequestBuilder excludeNsfw(Boolean excludeNsfw) {
            this.excludeNsfw = excludeNsfw;
            return this;
        }

        public NotesLocalTimelineRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesLocalTimelineRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public NotesLocalTimelineRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public NotesLocalTimelineRequestBuilder sinceDate(Long sinceDate) {
            this.sinceDate = sinceDate;
            return this;
        }

        public NotesLocalTimelineRequestBuilder untilDate(Long untilDate) {
            this.untilDate = untilDate;
            return this;
        }

        public NotesLocalTimelineRequest build() {
            NotesLocalTimelineRequest notesLocalTimelineRequest = new NotesLocalTimelineRequest();
            notesLocalTimelineRequest.sinceId = this.sinceId;
            notesLocalTimelineRequest.untilId = this.untilId;
            notesLocalTimelineRequest.fileType = this.fileType;
            notesLocalTimelineRequest.withFiles = this.withFiles;
            notesLocalTimelineRequest.sinceDate = this.sinceDate;
            notesLocalTimelineRequest.untilDate = this.untilDate;
            notesLocalTimelineRequest.excludeNsfw = this.excludeNsfw;
            notesLocalTimelineRequest.limit = this.limit;
            return notesLocalTimelineRequest;
        }
    }

    // endregion
}
