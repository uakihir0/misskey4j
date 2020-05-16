package misskey4j.entity.contant;

public enum NotificationType {

    FOLLOW("follow"),
    MENTION("mention"),
    REPLY("reply"),
    RENOTE("renote"),
    QUOTE("quote"),
    REACTION("reaction"),
    POLL_VOTE("pollVote"),
    RECEIVE_FOLLOW_REQUEST("receiveFollowRequest"),
    ;

    private String code;

    NotificationType(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }
}
