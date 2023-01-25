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
    private String avatarBlurhash;
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
    private String onlineStatus;
    private Instance instance;

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
        return isBot != null ? isBot : false;
    }

    public void setBot(Boolean bot) {
        isBot = bot;
    }

    public Boolean getCat() {
        return isCat != null ? isCat : false;
    }

    public void setCat(Boolean cat) {
        isCat = cat;
    }

    public Boolean getAdmin() {
        return isAdmin != null ? isAdmin : false;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Boolean getModerator() {
        return isModerator != null ? isModerator : false;
    }

    public void setModerator(Boolean moderator) {
        isModerator = moderator;
    }

    public Boolean getLocked() {
        return isLocked != null ? isLocked : false;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public Boolean getHasUnreadSpecifiedNotes() {
        return hasUnreadSpecifiedNotes != null ? hasUnreadSpecifiedNotes : false;
    }

    public void setHasUnreadSpecifiedNotes(Boolean hasUnreadSpecifiedNotes) {
        this.hasUnreadSpecifiedNotes = hasUnreadSpecifiedNotes;
    }

    public Boolean getHasUnreadMentions() {
        return hasUnreadMentions != null ? hasUnreadMentions : false;
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

    public String getAvatarBlurhash() {
        return avatarBlurhash;
    }

    public void setAvatarBlurhash(String avatarBlurhash) {
        this.avatarBlurhash = avatarBlurhash;
    }

    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public Instance getInstance() {
        return instance;
    }

    public void setInstance(Instance instance) {
        this.instance = instance;
    }

    // endregion
}
