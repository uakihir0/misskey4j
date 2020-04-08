package misskey4j.entity.collection;

import misskey4j.entity.Instance;

import java.util.List;

public class Instances {

    private String timestamp;
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
