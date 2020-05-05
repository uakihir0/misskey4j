package misskey4j.stream.callback;

import misskey4j.entity.Note;

public interface ReplayCallback extends EventCallback {
    void onReply(Note note);
}
