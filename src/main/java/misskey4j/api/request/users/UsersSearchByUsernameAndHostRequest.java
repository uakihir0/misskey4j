package misskey4j.api.request.users;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class UsersSearchByUsernameAndHostRequest {

    public static UsersSearchRequestBuilder builder() {
        return new UsersSearchRequestBuilder();
    }

    private Long limit;
    private Boolean detail;

    @Nonnull
    private final String username;

    @Nullable
    private String host;

    UsersSearchByUsernameAndHostRequest(@Nonnull String username) {
        this.username = username;
    }

    // region
    public Long getLimit() {
        return limit;
    }

    public Boolean getDetail() {
        return detail;
    }

    @Nonnull
    public String getUsername() {
        return username;
    }

    @Nullable
    public String getHost() {
        return host;
    }

    public static final class UsersSearchRequestBuilder {
        private Long limit;
        private Boolean detail;
        private String username;
        private String host;

        private UsersSearchRequestBuilder() {
        }

        public UsersSearchRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public UsersSearchRequestBuilder detail(Boolean detail) {
            this.detail = detail;
            return this;
        }

        public UsersSearchRequestBuilder username(@Nonnull String username) {
            this.username = username;
            return this;
        }

        public UsersSearchRequestBuilder host(@Nullable String host) {
            this.host = host;
            return this;
        }

        public UsersSearchByUsernameAndHostRequest build() {
            UsersSearchByUsernameAndHostRequest request = new UsersSearchByUsernameAndHostRequest(username);
            request.limit = this.limit;
            request.detail = this.detail;
            request.host = this.host;
            return request;
        }
    }

    // endregion
}
