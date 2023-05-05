package misskey4j.entity;

import org.jetbrains.annotations.Nullable;

public class Instance {

    @Nullable
    private String name;

    private String softwareName;
    private String softwareVersion;
    private String iconUrl;
    private String faviconUrl;

    @Nullable
    private Color themeColor;

    @Nullable
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
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

    @Nullable
    public Color getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(@Nullable Color themeColor) {
        this.themeColor = themeColor;
    }
}

