package misskey4j.entity.contant;

public enum WebhooksType {

    MENTION("mention"),
    UNFOLLOW("unfollow"),
    FOLLOW("follow"),
    FOLLOWED("followed"),
    NOTE("note"),
    REPLY("reply"),
    RENOTE("renote"),
    REACTION("reaction"),
    ;

    private final String code;

    WebhooksType(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }
}
