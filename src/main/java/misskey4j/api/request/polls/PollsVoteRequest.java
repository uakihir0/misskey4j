package misskey4j.api.request.polls;

import misskey4j.api.model.TokenRequest;

public class PollsVoteRequest extends TokenRequest {

    public static PollsVoteRequestBuilder builder() {
        return new PollsVoteRequestBuilder();
    }

    private String noteId;
    private Integer choice;

    // region
    public String getNoteId() {
        return noteId;
    }

    public Integer getChoice() {
        return choice;
    }

    public static final class PollsVoteRequestBuilder {
        private String noteId;
        private Integer choice;

        private PollsVoteRequestBuilder() {
        }

        public PollsVoteRequestBuilder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public PollsVoteRequestBuilder choice(Integer choice) {
            this.choice = choice;
            return this;
        }

        public PollsVoteRequest build() {
            PollsVoteRequest pollsVoteRequest = new PollsVoteRequest();
            pollsVoteRequest.noteId = this.noteId;
            pollsVoteRequest.choice = this.choice;
            return pollsVoteRequest;
        }
    }
    // endregion
}
