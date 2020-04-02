package misskey4j.entity;

import java.util.List;

public class Trend {

    private String tag;
    private List<Long> chart;
    private Long usersCount;

    // region
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<Long> getChart() {
        return chart;
    }

    public void setChart(List<Long> chart) {
        this.chart = chart;
    }

    public Long getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(Long usersCount) {
        this.usersCount = usersCount;
    }
    // endregion
}
