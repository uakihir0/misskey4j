package misskey4j.entity;

import java.util.List;

public class Meta {

    private String maintainerName;
    private String maintainerEmail;
    private String version;
    private String name;
    private String uri;
    private String description;
    private List<String> langs;
    private String tosUrl;
    private String repositoryUrl;
    private String feedbackUrl;
    private String defaultDarkTheme;
    private String defaultLightTheme;
    private Boolean disableRegistration;
    private Boolean cacheRemoteFiles;
    private Boolean emailRequiredForSignup;
    private Boolean enableHcaptcha;
    private String hcaptchaSiteKey;
    private Boolean enableRecaptcha;
    private String recaptchaSiteKey;
    private Boolean enableTurnstile;
    private String turnstileSiteKey;
    private String swPublickey;
    private String mascotImageUrl;
    private String bannerUrl;
    private String errorImageUrl;
    private String iconUrl;
    private Long maxNoteTextLength;

    /**
     * available up to v12
     * use /emojis endpoint.
     */
    @Deprecated
    private List<Emoji> emojis;

    private Boolean requireSetup;
    private Boolean enableEmail;
    private Boolean enableServiceWorker;
    private Boolean translatorAvailable;
    private String proxyAccountName;
    private String mediaProxy;
    private MetaFeatures features;

    // region

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
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

    public String getTosUrl() {
        return tosUrl;
    }

    public void setTosUrl(String tosUrl) {
        this.tosUrl = tosUrl;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public String getFeedbackUrl() {
        return feedbackUrl;
    }

    public void setFeedbackUrl(String feedbackUrl) {
        this.feedbackUrl = feedbackUrl;
    }

    public String getDefaultDarkTheme() {
        return defaultDarkTheme;
    }

    public void setDefaultDarkTheme(String defaultDarkTheme) {
        this.defaultDarkTheme = defaultDarkTheme;
    }

    public String getDefaultLightTheme() {
        return defaultLightTheme;
    }

    public void setDefaultLightTheme(String defaultLightTheme) {
        this.defaultLightTheme = defaultLightTheme;
    }

    public Boolean getDisableRegistration() {
        return disableRegistration;
    }

    public void setDisableRegistration(Boolean disableRegistration) {
        this.disableRegistration = disableRegistration;
    }

    public Boolean getCacheRemoteFiles() {
        return cacheRemoteFiles;
    }

    public void setCacheRemoteFiles(Boolean cacheRemoteFiles) {
        this.cacheRemoteFiles = cacheRemoteFiles;
    }

    public Boolean getEmailRequiredForSignup() {
        return emailRequiredForSignup;
    }

    public void setEmailRequiredForSignup(Boolean emailRequiredForSignup) {
        this.emailRequiredForSignup = emailRequiredForSignup;
    }

    public Boolean getEnableHcaptcha() {
        return enableHcaptcha;
    }

    public void setEnableHcaptcha(Boolean enableHcaptcha) {
        this.enableHcaptcha = enableHcaptcha;
    }

    public String getHcaptchaSiteKey() {
        return hcaptchaSiteKey;
    }

    public void setHcaptchaSiteKey(String hcaptchaSiteKey) {
        this.hcaptchaSiteKey = hcaptchaSiteKey;
    }

    public Boolean getEnableRecaptcha() {
        return enableRecaptcha;
    }

    public void setEnableRecaptcha(Boolean enableRecaptcha) {
        this.enableRecaptcha = enableRecaptcha;
    }

    public String getRecaptchaSiteKey() {
        return recaptchaSiteKey;
    }

    public void setRecaptchaSiteKey(String recaptchaSiteKey) {
        this.recaptchaSiteKey = recaptchaSiteKey;
    }

    public Boolean getEnableTurnstile() {
        return enableTurnstile;
    }

    public void setEnableTurnstile(Boolean enableTurnstile) {
        this.enableTurnstile = enableTurnstile;
    }

    public String getTurnstileSiteKey() {
        return turnstileSiteKey;
    }

    public void setTurnstileSiteKey(String turnstileSiteKey) {
        this.turnstileSiteKey = turnstileSiteKey;
    }

    public String getSwPublickey() {
        return swPublickey;
    }

    public void setSwPublickey(String swPublickey) {
        this.swPublickey = swPublickey;
    }

    public String getMascotImageUrl() {
        return mascotImageUrl;
    }

    public void setMascotImageUrl(String mascotImageUrl) {
        this.mascotImageUrl = mascotImageUrl;
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

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Boolean getRequireSetup() {
        return requireSetup;
    }

    public void setRequireSetup(Boolean requireSetup) {
        this.requireSetup = requireSetup;
    }

    public Boolean getEnableEmail() {
        return enableEmail;
    }

    public void setEnableEmail(Boolean enableEmail) {
        this.enableEmail = enableEmail;
    }

    public Boolean getEnableServiceWorker() {
        return enableServiceWorker;
    }

    public void setEnableServiceWorker(Boolean enableServiceWorker) {
        this.enableServiceWorker = enableServiceWorker;
    }

    public Boolean getTranslatorAvailable() {
        return translatorAvailable;
    }

    public void setTranslatorAvailable(Boolean translatorAvailable) {
        this.translatorAvailable = translatorAvailable;
    }

    public String getProxyAccountName() {
        return proxyAccountName;
    }

    public void setProxyAccountName(String proxyAccountName) {
        this.proxyAccountName = proxyAccountName;
    }

    public String getMediaProxy() {
        return mediaProxy;
    }

    public void setMediaProxy(String mediaProxy) {
        this.mediaProxy = mediaProxy;
    }

    public MetaFeatures getFeatures() {
        return features;
    }

    public void setFeatures(MetaFeatures features) {
        this.features = features;
    }

    public Long getMaxNoteTextLength() {
        return maxNoteTextLength;
    }

    public void setMaxNoteTextLength(Long maxNoteTextLength) {
        this.maxNoteTextLength = maxNoteTextLength;
    }

    public List<Emoji> getEmojis() {
        return emojis;
    }

    public void setEmojis(List<Emoji> emojis) {
        this.emojis = emojis;
    }

    // endregion

}
