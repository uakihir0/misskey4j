package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

public class NotesSearchRequest extends TokenRequest {

    public static NotesSearchRequestBuilder builder() {
        return new NotesSearchRequestBuilder();
    }

    private String query;
    private String sinceId;
    private String untilId;
    private Long limit;
    private String host;
    private String userId;

    // region
    public String getQuery() {
        return query;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public Long getLimit() {
        return limit;
    }

    public String getHost() {
        return host;
    }

    public String getUserId() {
        return userId;
    }

    public static final class NotesSearchRequestBuilder
            implements PagingBuilder<NotesSearchRequestBuilder> {

        private String query;
        private String sinceId;
        private String untilId;
        private Long limit;
        private String host;
        private String userId;

        private NotesSearchRequestBuilder() {
        }

        public NotesSearchRequestBuilder query(String query) {
            this.query = query;
            return this;
        }

        public NotesSearchRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public NotesSearchRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public NotesSearchRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesSearchRequestBuilder host(String host) {
            this.host = host;
            return this;
        }

        public NotesSearchRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public NotesSearchRequest build() {
            NotesSearchRequest notesSearchRequest = new NotesSearchRequest();
            notesSearchRequest.sinceId = this.sinceId;
            notesSearchRequest.host = this.host;
            notesSearchRequest.limit = this.limit;
            notesSearchRequest.query = this.query;
            notesSearchRequest.userId = this.userId;
            notesSearchRequest.untilId = this.untilId;
            return notesSearchRequest;
        }
    }
    // endregion
}
