package misskey4j.entity;

public class Relation {

    private String id;

    private Boolean hasPendingFollowRequestFromYou;
    private Boolean hasPendingFollowRequestToYou;

    private Boolean isFollowing;
    private Boolean isFollowed;
    private Boolean isBlocking;
    private Boolean isBlocked;

    @Override
    public String toString() {
        return "Relation{" +
                "id='" + id + '\'' +
                ", hasPendingFollowRequestFromYou=" + hasPendingFollowRequestFromYou +
                ", hasPendingFollowRequestToYou=" + hasPendingFollowRequestToYou +
                ", isFollowing=" + isFollowing +
                ", isFollowed=" + isFollowed +
                ", isBlocking=" + isBlocking +
                ", isBlocked=" + isBlocked +
                ", isMuted=" + isMuted +
                '}';
    }

    private Boolean isMuted;

    // region
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getHasPendingFollowRequestFromYou() {
        return hasPendingFollowRequestFromYou != null ? hasPendingFollowRequestFromYou : false;
    }

    public void setHasPendingFollowRequestFromYou(Boolean hasPendingFollowRequestFromYou) {
        this.hasPendingFollowRequestFromYou = hasPendingFollowRequestFromYou;
    }

    public Boolean getHasPendingFollowRequestToYou() {
        return hasPendingFollowRequestToYou != null ? hasPendingFollowRequestToYou : false;
    }

    public void setHasPendingFollowRequestToYou(Boolean hasPendingFollowRequestToYou) {
        this.hasPendingFollowRequestToYou = hasPendingFollowRequestToYou;
    }

    public Boolean getFollowing() {
        return isFollowing != null ? isFollowing : false;
    }

    public void setFollowing(Boolean following) {
        isFollowing = following;
    }

    public Boolean getFollowed() {
        return isFollowed != null ? isFollowed : false;
    }

    public void setFollowed(Boolean followed) {
        isFollowed = followed;
    }

    public Boolean getBlocking() {
        return isBlocking != null ? isBlocking : false;
    }

    public void setBlocking(Boolean blocking) {
        isBlocking = blocking;
    }

    public Boolean getBlocked() {
        return isBlocked != null ? isBlocked : false;
    }

    public void setBlocked(Boolean blocked) {
        isBlocked = blocked;
    }

    public Boolean getMuted() {
        return isMuted != null ? isMuted : false;
    }

    public void setMuted(Boolean muted) {
        isMuted = muted;
    }
    // endregion

}