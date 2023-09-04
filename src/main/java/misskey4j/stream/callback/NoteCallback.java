package misskey4j.stream.callback;

import misskey4j.entity.DeletedNote;
import misskey4j.entity.Reaction;

public interface NoteCallback extends EventCallback {

    void onReacted(Reaction reaction);

    void onUnreacted(Reaction reaction);

    void onNoteDeleted(DeletedNote note);
}
