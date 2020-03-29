package misskey4j.api.request.notes;

import misskey4j.api.request.protocol.FullPagingBuilder;

import java.util.List;

public class UsersNotesRequest {

    public static UsersNotesRequestBuilder builder() {
        return new UsersNotesRequestBuilder();
    }

    private String userId;

    private Long limit;
    private String sinceId;
    private String untilId;
    private Long sinceDate;
    private Long untilDate;

    private Boolean includeReplies;
    private Boolean includeMyRenotes;
    private Boolean excludeNsfw;
    private Boolean withFiles;

    private List<String> fileType;

    // region
    public String getUserId() {
        return userId;
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

    public Boolean getIncludeReplies() {
        return includeReplies;
    }

    public Boolean getIncludeMyRenotes() {
        return includeMyRenotes;
    }

    public Boolean getExcludeNsfw() {
        return excludeNsfw;
    }

    public Boolean getWithFiles() {
        return withFiles;
    }

    public List<String> getFileType() {
        return fileType;
    }

    public static final class UsersNotesRequestBuilder
            implements FullPagingBuilder<UsersNotesRequestBuilder> {

        private String userId;
        private Long limit;
        private String sinceId;
        private String untilId;
        private Long sinceDate;
        private Long untilDate;
        private Boolean includeReplies;
        private Boolean includeMyRenotes;
        private Boolean excludeNsfw;
        private Boolean withFiles;
        private List<String> fileType;

        private UsersNotesRequestBuilder() {
        }

        public UsersNotesRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UsersNotesRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public UsersNotesRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public UsersNotesRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public UsersNotesRequestBuilder sinceDate(Long sinceDate) {
            this.sinceDate = sinceDate;
            return this;
        }

        public UsersNotesRequestBuilder untilDate(Long untilDate) {
            this.untilDate = untilDate;
            return this;
        }

        public UsersNotesRequestBuilder includeReplies(Boolean includeReplies) {
            this.includeReplies = includeReplies;
            return this;
        }

        public UsersNotesRequestBuilder includeMyRenotes(Boolean includeMyRenotes) {
            this.includeMyRenotes = includeMyRenotes;
            return this;
        }

        public UsersNotesRequestBuilder excludeNsfw(Boolean excludeNsfw) {
            this.excludeNsfw = excludeNsfw;
            return this;
        }

        public UsersNotesRequestBuilder withFiles(Boolean withFiles) {
            this.withFiles = withFiles;
            return this;
        }

        public UsersNotesRequestBuilder fileType(List<String> fileType) {
            this.fileType = fileType;
            return this;
        }

        public UsersNotesRequest build() {
            UsersNotesRequest usersNotesRequest = new UsersNotesRequest();
            usersNotesRequest.userId = this.userId;
            usersNotesRequest.sinceId = this.sinceId;
            usersNotesRequest.limit = this.limit;
            usersNotesRequest.untilDate = this.untilDate;
            usersNotesRequest.includeMyRenotes = this.includeMyRenotes;
            usersNotesRequest.sinceDate = this.sinceDate;
            usersNotesRequest.excludeNsfw = this.excludeNsfw;
            usersNotesRequest.fileType = this.fileType;
            usersNotesRequest.untilId = this.untilId;
            usersNotesRequest.includeReplies = this.includeReplies;
            usersNotesRequest.withFiles = this.withFiles;
            return usersNotesRequest;
        }
    }
    // endregion
}
