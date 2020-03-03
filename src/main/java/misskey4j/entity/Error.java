package misskey4j.entity;

public class Error {

    private ErrorDetail error;

    public ErrorDetail getError() {
        return error;
    }

    public void setError(ErrorDetail error) {
        this.error = error;
    }

    public static class ErrorDetail {

        private String message;
        private String code;
        private String id;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
