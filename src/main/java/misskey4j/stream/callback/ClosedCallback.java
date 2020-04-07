package misskey4j.stream.callback;

public interface ClosedCallback {
    void onClosed(int code, String reason, boolean remote);
}
