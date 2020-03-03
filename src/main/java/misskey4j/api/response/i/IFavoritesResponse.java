package misskey4j.api.response.i;

import misskey4j.entity.Note;

public class IFavoritesResponse {

    private String id;
    private String createdAt;

    private Note note;
    private String noteId;

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

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
    // endregion
}
