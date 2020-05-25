package misskey4j.entity;

import java.util.List;

/**
 * ユーザーオブジェクト
 */
public class User {

    private String id;
    private String username;

    private String name;
    private String url;
    private String avatarUrl;
    private Color avatarColor;
    private String bannerUrl;
    private Color bannerColor;

    private String host;
    private String description;

    private String birthday;
    private String createdAt;
    private String updatedAt;
    private String location;

    private Long followersCount;
    private Long followingCount;
    private Long notesCount;

    private List<String> pinnedNoteIds;
    private List<Note> pinnedNotes;

    private Boolean isBot;
    private Boolean isCat;
    private Boolean isAdmin;
    private Boolean isModerator;

    private Boolean isLocked;
    private Boolean hasUnreadSpecifiedNotes;
    private Boolean hasUnreadMentions;

    private List<Emoji> emojis;
    private List<Field> fields;

    // region
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Color getAvatarColor() {
        return avatarColor;
    }

    public void setAvatarColor(Color avatarColor) {
        this.avatarColor = avatarColor;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public Color getBannerColor() {
        return bannerColor;
    }

    public void setBannerColor(Color bannerColor) {
        this.bannerColor = bannerColor;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
    }

    public Long getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Long followingCount) {
        this.followingCount = followingCount;
    }

    public Long getNotesCount() {
        return notesCount;
    }

    public void setNotesCount(Long notesCount) {
        this.notesCount = notesCount;
    }

    public List<String> getPinnedNoteIds() {
        return pinnedNoteIds;
    }

    public void setPinnedNoteIds(List<String> pinnedNoteIds) {
        this.pinnedNoteIds = pinnedNoteIds;
    }

    public List<Note> getPinnedNotes() {
        return pinnedNotes;
    }

    public void setPinnedNotes(List<Note> pinnedNotes) {
        this.pinnedNotes = pinnedNotes;
    }

    public Boolean getBot() {
        return isBot;
    }

    public void setBot(Boolean bot) {
        isBot = bot;
    }

    public Boolean getCat() {
        return isCat;
    }

    public void setCat(Boolean cat) {
        isCat = cat;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Boolean getModerator() {
        return isModerator;
    }

    public void setModerator(Boolean moderator) {
        isModerator = moderator;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public Boolean getHasUnreadSpecifiedNotes() {
        return hasUnreadSpecifiedNotes;
    }

    public void setHasUnreadSpecifiedNotes(Boolean hasUnreadSpecifiedNotes) {
        this.hasUnreadSpecifiedNotes = hasUnreadSpecifiedNotes;
    }

    public Boolean getHasUnreadMentions() {
        return hasUnreadMentions;
    }

    public void setHasUnreadMentions(Boolean hasUnreadMentions) {
        this.hasUnreadMentions = hasUnreadMentions;
    }

    public List<Emoji> getEmojis() {
        return emojis;
    }

    public void setEmojis(List<Emoji> emojis) {
        this.emojis = emojis;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
    // endregion
}
