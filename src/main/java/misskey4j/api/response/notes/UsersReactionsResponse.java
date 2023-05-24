package misskey4j.api.response.notes;

import misskey4j.entity.Note;
import misskey4j.entity.User;

public class UsersReactionsResponse {

    private String id;

    private String createdAt;

    private User user;

    private String type;

    private Note note;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    // endregion
}
