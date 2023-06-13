package misskey4j.entity;

import misskey4j.util.BlurHashDecoder;

import javax.annotation.Nullable;
import java.util.List;

/**
 * ユーザーオブジェクト
 */
public class User {

    private String id;
    private String username;

    @Nullable
    private String name;

    @Nullable
    private String url;
    private String avatarUrl;
    private String avatarBlurhash;
    private Color avatarColor;

    @Nullable
    private String bannerUrl;
    private Color bannerColor;

    @Nullable
    private String host;

    @Nullable
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

    @Nullable
    private Instance instance;

    private Emojis emojis;

    @Nullable
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

    @Nullable
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    public String getUrl() {
        return url;
    }

    public void setUrl(@Nullable String url) {
        this.url = url;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Color getAvatarColor() {
        if (avatarColor == null && avatarBlurhash != null) {
            BlurHashDecoder decoder = BlurHashDecoder.getInstance();
            int[][][] ary = decoder.decode(avatarBlurhash, 1, 1, 1, false);

            Color color = new Color();
            color.setR(ary[0][0][0]);
            color.setG(ary[0][0][1]);
            color.setB(ary[0][0][2]);
            return color;
        }
        return avatarColor;
    }

    public void setAvatarColor(Color avatarColor) {
        this.avatarColor = avatarColor;
    }

    @Nullable
    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(@Nullable String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public Color getBannerColor() {
        return bannerColor;
    }

    public void setBannerColor(Color bannerColor) {
        this.bannerColor = bannerColor;
    }

    @Nullable
    public String getHost() {
        return host;
    }

    public void setHost(@Nullable String host) {
        this.host = host;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
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
        if (emojis == null) return null;
        return emojis.getList();
    }

    public void setEmojis(List<Emoji> emojis) {
        this.emojis = new Emojis();
        this.emojis.setList(emojis);
    }

    @Nullable
    public List<Field> getFields() {
        return fields;
    }

    public void setFields(@Nullable List<Field> fields) {
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

    @Nullable
    public Instance getInstance() {
        return instance;
    }

    public void setInstance(@Nullable Instance instance) {
        this.instance = instance;
    }

    // endregion
}
