package misskey4j.entity;

public class List {

    private String id;
    private String createdAt;
    private String name;
    private java.util.List<String> userIds;

    // region
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
    }
    // endregion
}
