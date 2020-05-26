package misskey4j.entity;

public class Choice {

    private String text;
    private Long votes;
    private Boolean isVoted;

    // region
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getVotes() {
        return votes;
    }

    public void setVotes(Long votes) {
        this.votes = votes;
    }

    public Boolean getVoted() {
        return (isVoted != null) ? isVoted : false;
    }

    public void setVoted(Boolean voted) {
        isVoted = voted;
    }
    // endregion
}

