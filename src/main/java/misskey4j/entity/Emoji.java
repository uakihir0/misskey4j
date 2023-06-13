package misskey4j.entity;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.Collectors;

public class Emoji {

    /** up to v12 */
    @Deprecated
    private String id;
    /** up to v12 */
    @Deprecated
    private String host;
    private String name;
    private String url;
    private String category;

    @Nullable
    private List<String> aliases;

    // region
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Nullable
    public List<String> getAliases() {

        if (aliases == null) return null;

        // 空文字列が含まれるバグが存在するため対応
        return aliases.stream()
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toList());
    }

    public void setAliases(@Nullable List<String> aliases) {
        this.aliases = aliases;
    }
    // endregion
}

