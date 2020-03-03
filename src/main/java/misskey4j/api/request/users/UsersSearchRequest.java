package misskey4j.api.request.users;

public class UsersSearchRequest {

    public static UsersSearchRequestBuilder builder() {
        return new UsersSearchRequestBuilder();
    }

    private String query;

    private Long offset;
    private Long limit;

    private Boolean localOnly;
    private Boolean detail;

    // region
    public String getQuery() {
        return query;
    }

    public Long getOffset() {
        return offset;
    }

    public Long getLimit() {
        return limit;
    }

    public Boolean getLocalOnly() {
        return localOnly;
    }

    public Boolean getDetail() {
        return detail;
    }

    public static final class UsersSearchRequestBuilder {
        private String query;
        private Long offset;
        private Long limit;
        private Boolean localOnly;
        private Boolean detail;

        private UsersSearchRequestBuilder() {
        }

        public UsersSearchRequestBuilder query(String query) {
            this.query = query;
            return this;
        }

        public UsersSearchRequestBuilder offset(Long offset) {
            this.offset = offset;
            return this;
        }

        public UsersSearchRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public UsersSearchRequestBuilder localOnly(Boolean localOnly) {
            this.localOnly = localOnly;
            return this;
        }

        public UsersSearchRequestBuilder detail(Boolean detail) {
            this.detail = detail;
            return this;
        }

        public UsersSearchRequest build() {
            UsersSearchRequest usersSearchRequest = new UsersSearchRequest();
            usersSearchRequest.offset = this.offset;
            usersSearchRequest.limit = this.limit;
            usersSearchRequest.query = this.query;
            usersSearchRequest.localOnly = this.localOnly;
            usersSearchRequest.detail = this.detail;
            return usersSearchRequest;
        }
    }

    // endregion
}
