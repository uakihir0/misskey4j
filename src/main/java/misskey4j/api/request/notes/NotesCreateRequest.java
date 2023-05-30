package misskey4j.api.request.notes;

import misskey4j.api.model.PollRequest;
import misskey4j.api.model.TokenRequest;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class NotesCreateRequest extends TokenRequest {

    public static NotesCreateRequestBuilder builder() {
        return new NotesCreateRequestBuilder();
    }

    private String visibility;
    private List<String> visibleUserIds;

    private String text;
    private String cw;

    private Boolean viaMobile;
    private Boolean localOnly;
    private Boolean noExtractMentions;
    private Boolean noExtractHashtags;
    private Boolean noExtractEmojis;

    private List<String> fileIds;
    private String replyId;
    private String renoteId;

    @Nullable
    private String channelId;

    private PollRequest poll;

    // region
    public String getVisibility() {
        return visibility;
    }

    public List<String> getVisibleUserIds() {
        return visibleUserIds;
    }

    public String getText() {
        return text;
    }

    public String getCw() {
        return cw;
    }

    public Boolean getViaMobile() {
        return viaMobile;
    }

    public Boolean getLocalOnly() {
        return localOnly;
    }

    public Boolean getNoExtractMentions() {
        return noExtractMentions;
    }

    public Boolean getNoExtractHashtags() {
        return noExtractHashtags;
    }

    public Boolean getNoExtractEmojis() {
        return noExtractEmojis;
    }

    public List<String> getFileIds() {
        return fileIds;
    }

    public String getReplyId() {
        return replyId;
    }

    public String getRenoteId() {
        return renoteId;
    }

    @Nullable
    public String getChannelId() {
        return channelId;
    }

    public PollRequest getPoll() {
        return poll;
    }

    public static final class NotesCreateRequestBuilder {
        private String visibility;
        private List<String> visibleUserIds;
        private String text;
        private String cw;
        private Boolean viaMobile;
        private Boolean localOnly;
        private Boolean noExtractMentions;
        private Boolean noExtractHashtags;
        private Boolean noExtractEmojis;
        private List<String> fileIds;
        private String replyId;
        private String renoteId;
        @Nullable private String channelId;
        private PollRequest poll;

        private NotesCreateRequestBuilder() {
        }

        public NotesCreateRequestBuilder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public NotesCreateRequestBuilder visibleUserIds(List<String> visibleUserIds) {
            this.visibleUserIds = visibleUserIds;
            return this;
        }

        public NotesCreateRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public NotesCreateRequestBuilder cw(String cw) {
            this.cw = cw;
            return this;
        }

        public NotesCreateRequestBuilder viaMobile(Boolean viaMobile) {
            this.viaMobile = viaMobile;
            return this;
        }

        public NotesCreateRequestBuilder localOnly(Boolean localOnly) {
            this.localOnly = localOnly;
            return this;
        }

        public NotesCreateRequestBuilder noExtractMentions(Boolean noExtractMentions) {
            this.noExtractMentions = noExtractMentions;
            return this;
        }

        public NotesCreateRequestBuilder noExtractHashtags(Boolean noExtractHashtags) {
            this.noExtractHashtags = noExtractHashtags;
            return this;
        }

        public NotesCreateRequestBuilder noExtractEmojis(Boolean noExtractEmojis) {
            this.noExtractEmojis = noExtractEmojis;
            return this;
        }

        public NotesCreateRequestBuilder fileIds(List<String> fileIds) {
            this.fileIds = fileIds;
            return this;
        }

        public NotesCreateRequestBuilder replyId(String replyId) {
            this.replyId = replyId;
            return this;
        }

        public NotesCreateRequestBuilder renoteId(String renoteId) {
            this.renoteId = renoteId;
            return this;
        }

        public NotesCreateRequestBuilder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        public NotesCreateRequestBuilder poll(PollRequest poll) {
            this.poll = poll;
            return this;
        }

        public NotesCreateRequest build() {
            NotesCreateRequest notesCreateRequest = new NotesCreateRequest();
            notesCreateRequest.text = this.text;
            notesCreateRequest.noExtractMentions = this.noExtractMentions;
            notesCreateRequest.localOnly = this.localOnly;
            notesCreateRequest.fileIds = this.fileIds;
            notesCreateRequest.cw = this.cw;
            notesCreateRequest.renoteId = this.renoteId;
            notesCreateRequest.channelId = this.channelId;
            notesCreateRequest.noExtractHashtags = this.noExtractHashtags;
            notesCreateRequest.replyId = this.replyId;
            notesCreateRequest.visibleUserIds = this.visibleUserIds;
            notesCreateRequest.visibility = this.visibility;
            notesCreateRequest.noExtractEmojis = this.noExtractEmojis;
            notesCreateRequest.viaMobile = this.viaMobile;
            notesCreateRequest.poll = this.poll;
            return notesCreateRequest;
        }
    }
    // endregion
}
