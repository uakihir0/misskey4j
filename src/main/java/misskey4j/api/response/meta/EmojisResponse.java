package misskey4j.api.response.meta;

import misskey4j.entity.Emoji;

import java.util.List;

public class EmojisResponse {

    private List<Emoji> emojis;
    
    public List<Emoji> getEmojis() {
        return emojis;
    }

    public void setEmojis(List<Emoji> emojis) {
        this.emojis = emojis;
    }
}
