package misskey4j.stream;

import misskey4j.Misskey;
import misskey4j.stream.callback.ClosedCallback;
import misskey4j.stream.callback.ErrorCallback;
import misskey4j.stream.callback.NoteCallback;
import misskey4j.stream.callback.OpenedCallback;

import java.util.Collections;

public class MisskeyStream {

    private Misskey misskey;
    private StreamClient client;

    public MisskeyStream(Misskey misskey) {
        this.misskey = misskey;

        try {
            String host = misskey.getHost();
            String i = misskey.getAuthToken();
            String url = "wss://" + host + "/streaming?i=" + i;
            client = new StreamClient(url);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Is connection opened?
     */
    public boolean isOpen() {
        return client.isOpen();
    }

    /**
     * Connect (nonblocking)
     */
    public void connect() {
        client.connect();
    }

    /**
     * Connect (blocking)
     */
    public void connectBlocking() {
        client.connectBlocking();
    }

    /**
     * Close
     */
    public void close() {
        client.close();
    }

    /**
     * HomeTimeLine Events
     */
    public void homeTimeLine(NoteCallback callback) {
        client.subscribe("homeTimeline", null, Collections.singletonList(callback));
    }

    /**
     * LocalTimeline Events
     */
    public void localTimeline(NoteCallback callback) {
        client.subscribe("localTimeline", null, Collections.singletonList(callback));
    }

    /**
     * HybridTimeline Events
     */
    public void hybridTimeline(NoteCallback callback) {
        client.subscribe("hybridTimeline", null, Collections.singletonList(callback));
    }

    /**
     * GlobalTimeline Events
     */
    public void globalTimeline(NoteCallback callback) {
        client.subscribe("globalTimeline", null, Collections.singletonList(callback));
    }

    public void setOpenedCallback(OpenedCallback openedCallback) {
        client.setOpenedCallback(openedCallback);
    }

    public void setClosedCallback(ClosedCallback closedCallback) {
        client.setClosedCallback(closedCallback);
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        client.setErrorCallback(errorCallback);
    }
}
