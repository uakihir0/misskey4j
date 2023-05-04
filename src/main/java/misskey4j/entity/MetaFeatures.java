package misskey4j.entity;

public class MetaFeatures {

    private Boolean registration;
    private Boolean localTimeLine;
    private Boolean globalTimeLine;
    private Boolean elasticsearch;
    private Boolean hcaptcha;
    private Boolean recaptcha;
    private Boolean objectStorage;
    private Boolean serviceWorker;
    private Boolean miauth;

    // region

    public Boolean getRegistration() {
        return registration;
    }

    public void setRegistration(Boolean registration) {
        this.registration = registration;
    }

    public Boolean getLocalTimeLine() {
        return localTimeLine;
    }

    public void setLocalTimeLine(Boolean localTimeLine) {
        this.localTimeLine = localTimeLine;
    }

    public Boolean getGlobalTimeLine() {
        return globalTimeLine;
    }

    public void setGlobalTimeLine(Boolean globalTimeLine) {
        this.globalTimeLine = globalTimeLine;
    }

    public Boolean getElasticsearch() {
        return elasticsearch;
    }

    public void setElasticsearch(Boolean elasticsearch) {
        this.elasticsearch = elasticsearch;
    }

    public Boolean getHcaptcha() {
        return hcaptcha;
    }

    public void setHcaptcha(Boolean hcaptcha) {
        this.hcaptcha = hcaptcha;
    }

    public Boolean getRecaptcha() {
        return recaptcha;
    }

    public void setRecaptcha(Boolean recaptcha) {
        this.recaptcha = recaptcha;
    }

    public Boolean getObjectStorage() {
        return objectStorage;
    }

    public void setObjectStorage(Boolean objectStorage) {
        this.objectStorage = objectStorage;
    }

    public Boolean getServiceWorker() {
        return serviceWorker;
    }

    public void setServiceWorker(Boolean serviceWorker) {
        this.serviceWorker = serviceWorker;
    }

    public Boolean getMiauth() {
        return miauth;
    }

    public void setMiauth(Boolean miauth) {
        this.miauth = miauth;
    }

    // endregion
}
