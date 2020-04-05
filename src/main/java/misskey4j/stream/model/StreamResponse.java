package misskey4j.stream.model;

public class StreamResponse<T> {

    private String type;
    private Body<T> body;

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

        private String id;
        private String type;
        private T body;

        // region
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public T getBody() {
            return body;
        }

        public void setBody(T body) {
            this.body = body;
        }
        // endregion
    }
}
