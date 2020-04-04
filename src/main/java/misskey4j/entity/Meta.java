package misskey4j.entity;

import java.util.List;

public class Meta {

    private Long maxNoteTextLength;
    private List<Emoji> emojis;

    // region
    public Long getMaxNoteTextLength() {
        return maxNoteTextLength;
    }

    public void setMaxNoteTextLength(Long maxNoteTextLength) {
        this.maxNoteTextLength = maxNoteTextLength;
    }

    public List<Emoji> getEmojis() {
        return emojis;
    }

    public void setEmojis(List<Emoji> emojis) {
        this.emojis = emojis;
    }
    // endregion
}
