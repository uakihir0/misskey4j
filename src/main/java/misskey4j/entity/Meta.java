package misskey4j.entity;

import java.util.List;

public class Meta {

    private Long maxNoteTextLength;

    /**
     * available up to v12
     * use /emojis endpoint.
     */
    @Deprecated
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
