package misskey4j.stream.callback;

import misskey4j.entity.Note;

public interface MentionCallback extends EventCallback {
    void onMention(Note note);
}
