package misskey4j.api.request.notes;

import misskey4j.api.model.TokenRequest;

public class NotesFeaturedRequest extends TokenRequest {

    public static NotesFeaturedRequestBuilder builder() {
        return new NotesFeaturedRequestBuilder();
    }

    private Long limit;
    private Long offset;

    // region
    public Long getLimit() {
        return limit;
    }

    public Long getOffset() {
        return offset;
    }

    public static final class NotesFeaturedRequestBuilder {
        private Long limit;
        private Long offset;

        private NotesFeaturedRequestBuilder() {
        }


        public NotesFeaturedRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesFeaturedRequestBuilder offset(Long offset) {
            this.offset = offset;
            return this;
        }

        public NotesFeaturedRequest build() {
            NotesFeaturedRequest notesFeaturedRequest = new NotesFeaturedRequest();
            notesFeaturedRequest.offset = this.offset;
            notesFeaturedRequest.limit = this.limit;
            return notesFeaturedRequest;
        }
    }
    // endregion
}
