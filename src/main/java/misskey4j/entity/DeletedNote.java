package misskey4j.entity;

import javax.annotation.Nullable;

public class DeletedNote {

    @Nullable
    private String id;

    private String deletedAt;

    // region
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Nullable
    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(@Nullable String deletedAt) {
        this.deletedAt = deletedAt;
    }
    // endregion

}
