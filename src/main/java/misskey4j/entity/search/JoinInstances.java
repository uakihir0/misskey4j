package misskey4j.entity.search;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JoinInstances {

    @SerializedName("date")
    private String timestamp;
    @SerializedName("instancesInfos")
    private List<JoinInstance> instances;

    // region
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<JoinInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<JoinInstance> instances) {
        this.instances = instances;
    }
    // endregion
}
