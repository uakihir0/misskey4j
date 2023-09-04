package misskey4j.stream.callback;

import misskey4j.entity.Note;

public interface TimelineCallback extends EventCallback {
    void onNoteUpdate(Note note);
}
