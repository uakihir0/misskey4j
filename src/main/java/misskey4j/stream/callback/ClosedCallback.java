package misskey4j.stream.callback;

public interface ClosedCallback {
    void onClosed(boolean remote);
}
