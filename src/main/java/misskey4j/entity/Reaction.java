package misskey4j.entity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Reaction {

    @Nullable
    private String noteId;

    @Nonnull
    private String userId = "";

    @Nullable
    private String reaction;

    // TODO: emoji

    // region

    @Nullable
    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(@Nullable String id) {
        this.noteId = id;
    }

    @Nonnull
    public String getUserId() {
        return userId;
    }

    public void setUserId(@Nonnull String userId) {
        this.userId = userId;
    }

    @Nullable
    public String getReaction() {
        return reaction;
    }

    public void setReaction(@Nullable String reaction) {
        this.reaction = reaction;
    } // endregion
}
