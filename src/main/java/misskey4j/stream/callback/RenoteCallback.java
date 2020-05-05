package misskey4j.stream.callback;

import misskey4j.entity.Note;

public interface RenoteCallback extends EventCallback {
    void onRenote(Note note);
}
