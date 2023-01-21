package misskey4j.entity.collection;

import com.google.gson.annotations.SerializedName;
import misskey4j.entity.join.Instance;

import java.util.List;

public class Instances {

    @SerializedName("date")
    private String timestamp;
    @SerializedName("instancesInfos")
    private List<Instance> instances;

    // region
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<Instance> getInstances() {
        return instances;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }
    // endregion
}
