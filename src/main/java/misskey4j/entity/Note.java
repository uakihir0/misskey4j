package misskey4j.entity;

import java.util.List;

/**
 * 投稿オブジェクト
 *
 *  // TODO
 *  "poll": { },
 *  "geo": { }
 */
public class Note {

    private String id;
    private String createdAt;

    private String text;
    private String cw;

    private String userId;
    private User user;

    private String replyId;
    private Note reply;

    private String renoteId;
    private Note renote;

    private Boolean viaMobile;
    private Boolean isHidden;

    private String visibility;
    private List<String> visibleUserIds;

    private List<String> mentions;
    private List<String> tags;

    private List<String> fileIds;
    private List<File> files;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCw() {
        return cw;
    }

    public void setCw(String cw) {
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

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }

    public Note getReply() {
        return reply;
    }

    public void setReply(Note reply) {
        this.reply = reply;
    }

    public String getRenoteId() {
        return renoteId;
    }

    public void setRenoteId(String renoteId) {
        this.renoteId = renoteId;
    }

    public Note getRenote() {
        return renote;
    }

    public void setRenote(Note renote) {
        this.renote = renote;
    }

    public Boolean getViaMobile() {
        return viaMobile;
    }

    public void setViaMobile(Boolean viaMobile) {
        this.viaMobile = viaMobile;
    }

    public Boolean getHidden() {
        return isHidden;
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

    public List<String> getMentions() {
        return mentions;
    }

    public void setMentions(List<String> mentions) {
        this.mentions = mentions;
    }

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
    // endregion
}