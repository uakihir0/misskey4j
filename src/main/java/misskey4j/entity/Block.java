package misskey4j.entity;

public class Block {

    private String id;
    private String createdAt;
    private String blockeeId;
    private User blockee;

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

    public String getBlockeeId() {
        return blockeeId;
    }

    public void setBlockeeId(String blockeeId) {
        this.blockeeId = blockeeId;
    }

    public User getBlockee() {
        return blockee;
    }

    public void setBlockee(User blockee) {
        this.blockee = blockee;
    }
    // endregion
}

