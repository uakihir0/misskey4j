package misskey4j.stream.model;

public class StreamRequest<T> {

    private String type;
    private Body<T> body = new Body<>();

    // region
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Body<T> getBody() {
        return body;
    }

    public void setBody(Body<T> body) {
        this.body = body;
    }
    // endregion

    public static class Body<T> {

        private String channel;
        private String id;
        private T params;

        // region
        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public T getParams() {
            return params;
        }

        public void setParams(T params) {
            this.params = params;
        }
        // endregion
    }
}

