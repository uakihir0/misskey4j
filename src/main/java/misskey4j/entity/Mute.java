package misskey4j.entity;

public class Mute {

    private String id;
    private String createdAt;

    private String muteeId;
    private User mutee;

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

    public String getMuteeId() {
        return muteeId;
    }

    public void setMuteeId(String muteeId) {
        this.muteeId = muteeId;
    }

    public User getMutee() {
        return mutee;
    }

    public void setMutee(User mutee) {
        this.mutee = mutee;
    }
}
