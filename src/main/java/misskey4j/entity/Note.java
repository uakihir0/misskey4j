package misskey4j.entity;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

/**
 * 投稿オブジェクト
 * // TODO
 * "geo": { }
 */
public class Note {

    private String id;
    private String createdAt;

    @Nullable
    private String text;

    @Nullable
    private String cw;

    private String userId;
    private User user;

    @Nullable
    private String replyId;

    @Nullable
    private Note reply;

    @Nullable
    private String renoteId;

    @Nullable
    private Note renote;

    private Long renoteCount;
    private Long repliesCount;

    private Boolean viaMobile;
    private Boolean isHidden;

    private String visibility;
    private List<String> visibleUserIds;

    private Boolean localOnly;

    @Nullable
    private List<String> mentions;

    @Nullable
    private List<String> tags;

    private List<String> fileIds;
    private List<File> files;

    private Poll poll;

    @Nullable
    private Emojis emojis;

    @Nullable
    private Map<String, Long> reactions;

    @Nullable
    private Emojis reactionEmojis;

    private String myReaction;

    @Nullable
    private String url;

    @Nullable
    private String uri;

    @SerializedName("_featuredId_")
    private String featuredId;

    @SerializedName("_prId_")
    private String prId;

    // region
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Nullable
    public String getText() {
        return text;
    }

    public void setText(@Nullable String text) {
        this.text = text;
    }

    @Nullable
    public String getCw() {
        return cw;
    }

    public void setCw(@Nullable String cw) {
        this.cw = cw;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Nullable
    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(@Nullable String replyId) {
        this.replyId = replyId;
    }

    @Nullable
    public Note getReply() {
        return reply;
    }

    public void setReply(@Nullable Note reply) {
        this.reply = reply;
    }

    @Nullable
    public String getRenoteId() {
        return renoteId;
    }

    public void setRenoteId(@Nullable String renoteId) {
        this.renoteId = renoteId;
    }

    @Nullable
    public Note getRenote() {
        return renote;
    }

    public void setRenote(@Nullable Note renote) {
        this.renote = renote;
    }

    public Boolean getViaMobile() {
        return viaMobile != null ? viaMobile : false;
    }

    public void setViaMobile(Boolean viaMobile) {
        this.viaMobile = viaMobile;
    }

    public Boolean getHidden() {
        return isHidden != null ? isHidden : false;
    }

    public void setHidden(Boolean hidden) {
        isHidden = hidden;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public List<String> getVisibleUserIds() {
        return visibleUserIds;
    }

    public void setVisibleUserIds(List<String> visibleUserIds) {
        this.visibleUserIds = visibleUserIds;
    }

    public Boolean getLocalOnly() {
        return localOnly;
    }

    public void setLocalOnly(Boolean localOnly) {
        this.localOnly = localOnly;
    }

    @Nullable
    public List<String> getMentions() {
        return mentions;
    }

    public void setMentions(List<String> mentions) {
        this.mentions = mentions;
    }

    @Nullable
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getFileIds() {
        return fileIds;
    }

    public void setFileIds(List<String> fileIds) {
        this.fileIds = fileIds;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Long getRenoteCount() {
        return renoteCount;
    }

    public void setRenoteCount(Long renoteCount) {
        this.renoteCount = renoteCount;
    }

    public Long getRepliesCount() {
        return repliesCount;
    }

    public void setRepliesCount(Long repliesCount) {
        this.repliesCount = repliesCount;
    }

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    @Nullable
    public List<Emoji> getEmojis() {
        if (emojis == null) return null;
        return emojis.getList();
    }

    public void setEmojis(List<Emoji> emojis) {
        this.emojis = new Emojis();
        this.emojis.setList(emojis);
    }

    @Nullable
    public Map<String, Long> getReactions() {
        return reactions;
    }

    public void setReactions(@Nullable Map<String, Long> reactions) {
        this.reactions = reactions;
    }

    @Nullable
    public List<Emoji> getReactionEmojis() {
        if (reactionEmojis == null) return null;
        return reactionEmojis.getList();
    }

    public void setReactionEmojis(@Nullable List<Emoji> reactionEmojis) {
        this.reactionEmojis = new Emojis();
        this.reactionEmojis.setList(reactionEmojis);
    }

    public String getMyReaction() {
        return myReaction;
    }

    public void setMyReaction(String myReaction) {
        this.myReaction = myReaction;
    }

    @Nullable
    public String getUrl() {
        return url;
    }

    public void setUrl(@Nullable String url) {
        this.url = url;
    }

    @Nullable
    public String getUri() {
        return uri;
    }

    public void setUri(@Nullable String uri) {
        this.uri = uri;
    }

    public String getFeaturedId() {
        return featuredId;
    }

    public void setFeaturedId(String featuredId) {
        this.featuredId = featuredId;
    }

    public String getPrId() {
        return prId;
    }

    public void setPrId(String prId) {
        this.prId = prId;
    }
    // endregion
}