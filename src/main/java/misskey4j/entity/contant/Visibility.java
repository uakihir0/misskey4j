package misskey4j.entity.contant;

public enum Visibility {

    PUBLIC("public"),
    HONE("home"),
    FOLLOWERS("followers"),
    SPECIFIED("specified"),
    ;

    private String code;

    Visibility(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }
}
