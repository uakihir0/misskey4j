package misskey4j.api.response.federation;

public class FederationInstanceResponse {

    private String id;
    private String firstRetrievedAt;
    private String host;
    private Integer usersCount;
    private Integer notesCount;
    private Integer followingCount;
    private Integer followersCount;
    private Boolean isNotResponding;
    private Boolean isSuspended;
    private Boolean isBlocked;
    private String softwareName;
    private String softwareVersion;
    private Boolean openRegistrations;
    private String name;
    private String description;
    private String maintainerName;
    private String maintainerEmail;
    private String iconUrl;
    private String faviconUrl;
    private String themeColor;
    private String infoUpdatedAt;

    // region
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstRetrievedAt() {
        return firstRetrievedAt;
    }

    public void setFirstRetrievedAt(String firstRetrievedAt) {
        this.firstRetrievedAt = firstRetrievedAt;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(Integer usersCount) {
        this.usersCount = usersCount;
    }

    public Integer getNotesCount() {
        return notesCount;
    }

    public void setNotesCount(Integer notesCount) {
        this.notesCount = notesCount;
    }

    public Integer getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public Boolean getNotResponding() {
        return isNotResponding;
    }

    public void setNotResponding(Boolean notResponding) {
        isNotResponding = notResponding;
    }

    public Boolean getSuspended() {
        return isSuspended;
    }

    public void setSuspended(Boolean suspended) {
        isSuspended = suspended;
    }

    public Boolean getBlocked() {
        return isBlocked;
    }

    public void setBlocked(Boolean blocked) {
        isBlocked = blocked;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public Boolean getOpenRegistrations() {
        return openRegistrations;
    }

    public void setOpenRegistrations(Boolean openRegistrations) {
        this.openRegistrations = openRegistrations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaintainerName() {
        return maintainerName;
    }

    public void setMaintainerName(String maintainerName) {
        this.maintainerName = maintainerName;
    }

    public String getMaintainerEmail() {
        return maintainerEmail;
    }

    public void setMaintainerEmail(String maintainerEmail) {
        this.maintainerEmail = maintainerEmail;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getFaviconUrl() {
        return faviconUrl;
    }

    public void setFaviconUrl(String faviconUrl) {
        this.faviconUrl = faviconUrl;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }

    public String getInfoUpdatedAt() {
        return infoUpdatedAt;
    }

    public void setInfoUpdatedAt(String infoUpdatedAt) {
        this.infoUpdatedAt = infoUpdatedAt;
    }
    // endregion
}
