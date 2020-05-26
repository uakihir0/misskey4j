package misskey4j.entity;

import java.util.List;

/**
 * Join Misskey のインスタンスリストのオブジェクト
 * (https://join.misskey.page/instances.json)
 */
public class Instance {

    private String url;
    private String description;
    private List<String> langs;

    private Boolean isAlive;
    private Boolean notSuspended;

    private InstanceMeta meta;
    private InstanceStats stats;

    // region
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getLangs() {
        return langs;
    }

    public void setLangs(List<String> langs) {
        this.langs = langs;
    }

    public Boolean getAlive() {
        return isAlive != null ? isAlive : false;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public Boolean getNotSuspended() {
        return notSuspended != null ? notSuspended : false;
    }

    public void setNotSuspended(Boolean notSuspended) {
        this.notSuspended = notSuspended;
    }

    public InstanceMeta getMeta() {
        return meta;
    }

    public void setMeta(InstanceMeta meta) {
        this.meta = meta;
    }

    public InstanceStats getStats() {
        return stats;
    }

    public void setStats(InstanceStats stats) {
        this.stats = stats;
    }
    // endregion

    public static class InstanceMeta {

        private String version;
        private String uri;

        private String iconUrl;
        private String bannerUrl;
        private String errorImageUrl;

        private Long maxNoteTextLength;

        // region
        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public String getIconUrl() {
            return iconUrl;
        }

        public void setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
        }

        public String getBannerUrl() {
            return bannerUrl;
        }

        public void setBannerUrl(String bannerUrl) {
            this.bannerUrl = bannerUrl;
        }

        public String getErrorImageUrl() {
            return errorImageUrl;
        }

        public void setErrorImageUrl(String errorImageUrl) {
            this.errorImageUrl = errorImageUrl;
        }

        public Long getMaxNoteTextLength() {
            return maxNoteTextLength;
        }

        public void setMaxNoteTextLength(Long maxNoteTextLength) {
            this.maxNoteTextLength = maxNoteTextLength;
        }
        // endregion
    }

    public static class InstanceStats {

        private Long notesCount;
        private Long originalNotesCount;
        private Long usersCount;
        private Long originalUsersCount;
        private Long instances;

        // region
        public Long getNotesCount() {
            return notesCount;
        }

        public void setNotesCount(Long notesCount) {
            this.notesCount = notesCount;
        }

        public Long getOriginalNotesCount() {
            return originalNotesCount;
        }

        public void setOriginalNotesCount(Long originalNotesCount) {
            this.originalNotesCount = originalNotesCount;
        }

        public Long getUsersCount() {
            return usersCount;
        }

        public void setUsersCount(Long usersCount) {
            this.usersCount = usersCount;
        }

        public Long getOriginalUsersCount() {
            return originalUsersCount;
        }

        public void setOriginalUsersCount(Long originalUsersCount) {
            this.originalUsersCount = originalUsersCount;
        }

        public Long getInstances() {
            return instances;
        }

        public void setInstances(Long instances) {
            this.instances = instances;
        }
        // endregion
    }
}


