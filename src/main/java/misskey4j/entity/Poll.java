package misskey4j.entity;

import javax.annotation.Nullable;
import java.util.List;

public class Poll {

    private Boolean multiple;

    @Nullable
    private String expiresAt;
    private List<Choice> choices;

    // region
    public Boolean getMultiple() {
        return multiple != null ? multiple : false;
    }

    public void setMultiple(Boolean multiple) {
        this.multiple = multiple;
    }

    @Nullable
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(@Nullable String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
    // endregion
}
