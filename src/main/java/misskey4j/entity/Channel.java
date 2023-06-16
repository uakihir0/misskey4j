package misskey4j.entity;

import java.util.List;

import javax.annotation.Nullable;

public class Channel {

    private String id;

    private String createdAt;

    @Nullable
    private String lastNotedAt;

    private String name;

    @Nullable
    private String description;

    @Nullable
    private String bannerUrl;

    private boolean isArchived;

    private int notesCount;

    private int usersCount;

    private boolean isFollowing;

    private boolean isFavorited;

    @Nullable
    private String userId;

    private java.util.List<String> pinnedNoteIds;

    private String color;

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
    public String getLastNotedAt() {
        return lastNotedAt;
    }

    public void setLastNotedAt(@Nullable String lastNotedAt) {
        this.lastNotedAt = lastNotedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    @Nullable
    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(@Nullable String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public boolean isArchived() {
        return isArchived;
    }

    public void setArchived(boolean archived) {
        isArchived = archived;
    }

    public int getNotesCount() {
        return notesCount;
    }

    public void setNotesCount(int notesCount) {
        this.notesCount = notesCount;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

    public boolean isFollowing() {
        return isFollowing;
    }

    public void setFollowing(boolean following) {
        isFollowing = following;
    }

    public boolean isFavorited() {
        return isFavorited;
    }

    public void setFavorited(boolean favorited) {
        isFavorited = favorited;
    }

    @Nullable
    public String getUserId() {
        return userId;
    }

    public void setUserId(@Nullable String userId) {
        this.userId = userId;
    }

    public List<String> getPinnedNoteIds() {
        return pinnedNoteIds;
    }

    public void setPinnedNoteIds(List<String> pinnedNoteIds) {
        this.pinnedNoteIds = pinnedNoteIds;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // endregion
}
