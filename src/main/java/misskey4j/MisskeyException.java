package misskey4j;

public class MisskeyException extends RuntimeException {

    private Error error;

    private int statusCode;

    public MisskeyException(Exception e) {
        super(e);
    }

    public MisskeyException(Error error, int statusCode) {
        this.statusCode = statusCode;
        this.error = error;
    }

    // region
    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    // endregion
}