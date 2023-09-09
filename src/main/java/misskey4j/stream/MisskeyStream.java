package misskey4j.stream;

import java.util.Collections;

import javax.annotation.CheckReturnValue;

import misskey4j.Misskey;
import misskey4j.stream.callback.ClosedCallback;
import misskey4j.stream.callback.ErrorCallback;
import misskey4j.stream.callback.EventCallback;
import misskey4j.stream.callback.NoteCallback;
import misskey4j.stream.callback.OpenedCallback;
import misskey4j.stream.callback.TimelineCallback;

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
     * Close
     */
    public void close() {
        client.close();
    }

    /**
     * Notifications
     */
    public void main(EventCallback callback) {
        client.connect("main", null, Collections.singletonList(callback));
    }

    /**
     * HomeTimeLine Events
     */
    public void homeTimeLine(TimelineCallback callback) {
        client.connect("homeTimeline", null, Collections.singletonList(callback));
    }

    /**
     * LocalTimeline Events
     */
    public void localTimeline(TimelineCallback callback) {
        client.connect("localTimeline", null, Collections.singletonList(callback));
    }

    /**
     * HybridTimeline Events
     */
    public void hybridTimeline(TimelineCallback callback) {
        client.connect("hybridTimeline", null, Collections.singletonList(callback));
    }

    /**
     * GlobalTimeline Events
     */
    public void globalTimeline(TimelineCallback callback) {
        client.connect("globalTimeline", null, Collections.singletonList(callback));
    }

    /**
     * Listen note Events
     */
    public void note(String noteId, NoteCallback callback) {
        client.subscribeToNote(noteId, null, Collections.singletonList(callback));
    }

    @CheckReturnValue
    public Unsubscribe unsubscribe() {
        return new Unsubscribe(client);
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

    public class Unsubscribe {

        private StreamClient client;

        public Unsubscribe(StreamClient client) {
            this.client = client;
        }

        /**
         * Notifications
         */
        public void main() {
            client.disconnect("main");
        }

        /**
         * HomeTimeLine Events
         */
        public void homeTimeLine() {
            client.disconnect("homeTimeline");
        }

        /**
         * LocalTimeline Events
         */
        public void localTimeline() {
            client.disconnect("localTimeline");
        }

        /**
         * HybridTimeline Events
         */
        public void hybridTimeline() {
            client.disconnect("hybridTimeline");
        }

        /**
         * GlobalTimeline Events
         */
        public void globalTimeline() {
            client.disconnect("globalTimeline");
        }

        /**
         * Stop listening to note Events
         */
        public void note(String noteId) {
            client.unsubscribe(noteId);
        }
    }
}
