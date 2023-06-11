package misskey4j.entity.share;

/**
 * response wrapper for misskey api.
 */
public class Response<T> {

    private T object;

    private RateLimit limit;

    // TODO Should only be enabled in specific conditions
    public String json;

    public T get() {
        return object;
    }

    public void set(T object) {
        this.object = object;
    }

    public RateLimit getRateLimit() {
        return limit;
    }

    public void setRateLimit(RateLimit limit) {
        this.limit = limit;
    }
}
