package misskey4j.entity;

public class Relation {

    private String id;

    private Boolean hasPendingFollowRequestFromYou;
    private Boolean hasPendingFollowRequestToYou;

    private Boolean isFollowing;
    private Boolean isFollowed;
    private Boolean isBlocking;
    private Boolean isBlocked;
    private Boolean isMuted;

    // region
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getHasPendingFollowRequestFromYou() {
        return hasPendingFollowRequestFromYou;
    }

    public void setHasPendingFollowRequestFromYou(Boolean hasPendingFollowRequestFromYou) {
        this.hasPendingFollowRequestFromYou = hasPendingFollowRequestFromYou;
    }

    public Boolean getHasPendingFollowRequestToYou() {
        return hasPendingFollowRequestToYou;
    }

    public void setHasPendingFollowRequestToYou(Boolean hasPendingFollowRequestToYou) {
        this.hasPendingFollowRequestToYou = hasPendingFollowRequestToYou;
    }

    public Boolean getFollowing() {
        return isFollowing;
    }

    public void setFollowing(Boolean following) {
        isFollowing = following;
    }

    public Boolean getFollowed() {
        return isFollowed;
    }

    public void setFollowed(Boolean followed) {
        isFollowed = followed;
    }

    public Boolean getBlocking() {
        return isBlocking;
    }

    public void setBlocking(Boolean blocking) {
        isBlocking = blocking;
    }

    public Boolean getBlocked() {
        return isBlocked;
    }

    public void setBlocked(Boolean blocked) {
        isBlocked = blocked;
    }

    public Boolean getMuted() {
        return isMuted;
    }

    public void setMuted(Boolean muted) {
        isMuted = muted;
    }
    // endregion

}