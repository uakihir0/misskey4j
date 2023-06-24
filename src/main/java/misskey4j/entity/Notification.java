package misskey4j.entity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Notification {

    @Nonnull
    private String id = "";

    @Nonnull
    private String createdAt = "";

    @Nonnull
    private String type = "";

    @Nullable
    private User user;

    @Nullable
    private String userId;

    @Nullable
    private Note note;

    @Nullable
    private String reaction;

    @Nullable
    private Long choice;

    // TODO parse invitation object

    @Nullable
    private String body;

    @Nullable
    private String header;

    @Nullable
    private String icon;

    @Nullable
    private String achievement;


    // region
    @Nonnull
    public String getId() {
        return id;
    }

    public void setId(@Nonnull String id) {
        this.id = id;
    }

    @Nonnull
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(@Nonnull String createdAt) {
        this.createdAt = createdAt;
    }

    @Nonnull
    public String getType() {
        return type;
    }

    public void setType(@Nonnull String type) {
        this.type = type;
    }

    @Nullable
    public User getUser() {
        return user;
    }

    public void setUser(@Nullable User user) {
        this.user = user;
    }

    @Nullable
    public String getUserId() {
        return userId;
    }

    public void setUserId(@Nullable String userId) {
        this.userId = userId;
    }

    @Nullable
    public Note getNote() {
        return note;
    }

    public void setNote(@Nullable Note note) {
        this.note = note;
    }

    @Nullable
    public String getReaction() {
        return reaction;
    }

    public void setReaction(@Nullable String reaction) {
        this.reaction = reaction;
    }

    @Nullable
    public Long getChoice() {
        return choice;
    }

    public void setChoice(@Nullable Long choice) {
        this.choice = choice;
    }

    @Nullable
    public String getBody() {
        return body;
    }

    public void setBody(@Nullable String body) {
        this.body = body;
    }

    @Nullable
    public String getHeader() {
        return header;
    }

    public void setHeader(@Nullable String header) {
        this.header = header;
    }

    @Nullable
    public String getIcon() {
        return icon;
    }

    public void setIcon(@Nullable String icon) {
        this.icon = icon;
    }

    @Nullable
    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(@Nullable String achievement) {
        this.achievement = achievement;
    }
    // endregion
}
