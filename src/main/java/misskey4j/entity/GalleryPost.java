package misskey4j.entity;

import java.util.List;

public class GalleryPost {
    private String id;
    private String createdAt;
    private String updatedAt;
    private String title;
    private String description;
    private String userId;
    private User user;
    private List<String> fileIds;
    private List<File> files;
    private List<String> tags;
    private Boolean isSensitive;
    private Boolean isLiked;
    private Integer likedCount;

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

    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }

    public List<String> getFileIds() {
        return fileIds;
    }

    public void setFileIds(final List<String> fileIds) {
        this.fileIds = fileIds;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(final List<File> files) {
        this.files = files;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(final List<String> tags) {
        this.tags = tags;
    }

    public Boolean getSensitive() {
        return isSensitive;
    }

    public void setSensitive(final Boolean sensitive) {
        isSensitive = sensitive;
    }

    public Boolean getLiked() {
        return isLiked;
    }

    public void setLiked(final Boolean liked) {
        isLiked = liked;
    }

    public Integer getLikedCount() {
        return likedCount;
    }

    public void setLikedCount(final Integer likedCount) {
        this.likedCount = likedCount;
    }

    // endregion

}
