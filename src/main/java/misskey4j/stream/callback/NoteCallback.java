package misskey4j.stream.callback;

import misskey4j.entity.Note;

public interface NoteCallback extends EventCallback {
    void onNoteUpdate(Note note);
}
