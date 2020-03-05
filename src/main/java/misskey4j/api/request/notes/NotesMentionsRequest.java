package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;

public class NotesMentionsRequest extends TokenRequest {

    public static NotesMentionsRequestBuilder builder() {
        return new NotesMentionsRequestBuilder();
    }

    private Boolean following;
    private Long limit;

    private String sinceId;
    private String untilId;
    private String visibility;

    // region
    public Boolean getFollowing() {
        return following;
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

    public String getVisibility() {
        return visibility;
    }

    public static final class NotesMentionsRequestBuilder {
        private Boolean following;
        private Long limit;
        private String sinceId;
        private String untilId;
        private String visibility;

        private NotesMentionsRequestBuilder() {
        }

        public NotesMentionsRequestBuilder following(Boolean following) {
            this.following = following;
            return this;
        }

        public NotesMentionsRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesMentionsRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public NotesMentionsRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public NotesMentionsRequestBuilder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public NotesMentionsRequest build() {
            NotesMentionsRequest notesMentionsRequest = new NotesMentionsRequest();
            notesMentionsRequest.limit = this.limit;
            notesMentionsRequest.following = this.following;
            notesMentionsRequest.untilId = this.untilId;
            notesMentionsRequest.visibility = this.visibility;
            notesMentionsRequest.sinceId = this.sinceId;
            return notesMentionsRequest;
        }
    }
    // endregion
}
