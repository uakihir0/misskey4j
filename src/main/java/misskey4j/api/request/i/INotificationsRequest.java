package misskey4j.api.request.i;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

import java.util.List;

public class INotificationsRequest extends TokenRequest {

    public static INotificationsRequestBuilder builder() {
        return new INotificationsRequestBuilder();
    }

    private Long limit;
    private String sinceId;
    private String untilId;
    private Boolean following;
    private Boolean markAsRead;

    private List<String> includeTypes;
    private List<String> excludeTypes;

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

    public Boolean getFollowing() {
        return following;
    }

    public Boolean getMarkAsRead() {
        return markAsRead;
    }

    public List<String> getIncludeTypes() {
        return includeTypes;
    }

    public List<String> getExcludeTypes() {
        return excludeTypes;
    }

    public static final class INotificationsRequestBuilder
            implements PagingBuilder<INotificationsRequestBuilder> {

        private Long limit;
        private String sinceId;
        private String untilId;
        private Boolean following;
        private Boolean markAsRead;
        private List<String> includeTypes;
        private List<String> excludeTypes;

        private INotificationsRequestBuilder() {
        }

        public INotificationsRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public INotificationsRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public INotificationsRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public INotificationsRequestBuilder following(Boolean following) {
            this.following = following;
            return this;
        }

        public INotificationsRequestBuilder markAsRead(Boolean markAsRead) {
            this.markAsRead = markAsRead;
            return this;
        }

        public INotificationsRequestBuilder includeTypes(List<String> includeTypes) {
            this.includeTypes = includeTypes;
            return this;
        }

        public INotificationsRequestBuilder excludeTypes(List<String> excludeTypes) {
            this.excludeTypes = excludeTypes;
            return this;
        }

        public INotificationsRequest build() {
            INotificationsRequest iNotificationsRequest = new INotificationsRequest();
            iNotificationsRequest.limit = this.limit;
            iNotificationsRequest.following = this.following;
            iNotificationsRequest.sinceId = this.sinceId;
            iNotificationsRequest.untilId = this.untilId;
            iNotificationsRequest.includeTypes = this.includeTypes;
            iNotificationsRequest.excludeTypes = this.excludeTypes;
            iNotificationsRequest.markAsRead = this.markAsRead;
            return iNotificationsRequest;
        }
    }
    // endregion
}