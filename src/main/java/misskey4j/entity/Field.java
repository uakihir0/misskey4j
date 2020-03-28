package misskey4j.entity;

public class Field {

    private String name;
    private String value;

    // region
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    // endregion
}
