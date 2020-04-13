package misskey4j.stream;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.neovisionaries.ws.client.ThreadType;
import com.neovisionaries.ws.client.WebSocket;
import com.neovisionaries.ws.client.WebSocketAdapter;
import com.neovisionaries.ws.client.WebSocketException;
import com.neovisionaries.ws.client.WebSocketFactory;
import com.neovisionaries.ws.client.WebSocketFrame;
import misskey4j.entity.Note;
import misskey4j.internal.api.AbstractResourceImpl;
import misskey4j.stream.callback.ClosedCallback;
import misskey4j.stream.callback.ErrorCallback;
import misskey4j.stream.callback.EventCallback;
import misskey4j.stream.callback.NoteCallback;
import misskey4j.stream.callback.OpenedCallback;
import misskey4j.stream.model.StreamRequest;
import misskey4j.stream.model.StreamResponse;
import net.socialhub.logger.Logger;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class StreamClient extends WebSocketAdapter {

    private static Logger logger = Logger.getLogger(StreamClient.class);

    private Map<String, List<EventCallback>> callbackMap = new HashMap<>();
    private OpenedCallback openedCallback;
    private ClosedCallback closedCallback;
    private ErrorCallback errorCallback;

    private WebSocket webSocket;
    private boolean isReading = false;
    private boolean isWriting = false;

    public StreamClient(String uri) {

        try {
            WebSocketFactory factory = new WebSocketFactory();
            factory.setServerName(new URI(uri).getHost());
            factory.setVerifyHostname(false);

            webSocket = factory.createSocket(uri);
            webSocket.setPingInterval(5000);
            webSocket.addListener(this);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void connect() {
        webSocket.connectAsynchronously();
    }

    public void connectBlocking() {
        try {
            webSocket.connect();
        } catch (WebSocketException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        webSocket.sendClose();
    }

    public boolean isOpen() {
        return webSocket.isOpen();
    }

    /**
     * Add callback event handler
     */
    public void addCallback(String id, List<EventCallback> callbacks) {
        callbackMap.put(id, callbacks);
    }

    /**
     * Subscribe
     */
    public <T> void subscribe(String type, T params, List<EventCallback> callbacks) {
        StreamRequest<T> request = new StreamRequest<>();

        String id = UUID.randomUUID().toString();
        addCallback(id, callbacks);

        request.getBody().setChannel(type);
        request.getBody().setParams(params);
        request.getBody().setId(id);
        request.setType("connect");

        Gson gson = AbstractResourceImpl.getGsonInstance();
        String text = gson.toJson(request);

        logger.debug("Send: " + text);
        webSocket.sendText(text);
    }

    @Override
    public void onConnected(WebSocket websocket, Map<String, List<String>> headers) throws Exception {
        logger.debug("Opened connection.");
        //if (openedCallback != null) {
        //    openedCallback.onOpened();
        //}
    }

    @Override
    public void onThreadStarted(WebSocket websocket, ThreadType threadType, Thread thread) throws Exception {
        String message = "Start: " + threadType.name();
        logger.debug(message);

        if (threadType == ThreadType.READING_THREAD) {
            isReading = true;
        }
        if (threadType == ThreadType.WRITING_THREAD) {
            isWriting = true;
        }
        if (isReading && isWriting) {
            logger.debug("Thread ready.");
            if (openedCallback != null) {
                openedCallback.onOpened();
            }
        }
    }

    @Override
    public void onTextMessage(WebSocket websocket, String text) throws Exception {
        Gson gson = AbstractResourceImpl.getGsonInstance();
        Type genericType = new TypeToken<StreamResponse<Object>>() {
        }.getType();

        StreamResponse<Object> generic = gson.fromJson(text, genericType);
        if (generic.getType().equals("channel")) {

            if (generic.getBody().getType().equals("note")) {
                Type noteType = new TypeToken<StreamResponse<Note>>() {
                }.getType();

                StreamResponse<Note> note = gson.fromJson(text, noteType);
                List<EventCallback> events = callbackMap.get(generic.getBody().getId());

                if (events != null && events.size() > 0) {
                    for (EventCallback event : events) {
                        if (event instanceof NoteCallback) {
                            Note body = note.getBody().getBody();
                            ((NoteCallback) event).onNoteUpdate(body);
                        }
                    }
                }
            }
        }

        logger.debug(text);
    }

    @Override
    public void onDisconnected(
            WebSocket websocket,
            WebSocketFrame serverCloseFrame,
            WebSocketFrame clientCloseFrame,
            boolean closedByServer) throws Exception {

        logger.debug("Connection closed by "
                + (closedByServer ? "remote peer" : "us"));

        if (closedCallback != null) {
            closedCallback.onClosed(closedByServer);
        }
    }

    @Override
    public void onError(WebSocket websocket, WebSocketException cause) throws Exception {
        if (cause != null) {
            logger.debug("Exception: " + cause.getClass().getName()
                    + " message: " + cause.getMessage());
        }

        if (errorCallback != null) {
            errorCallback.onError(cause);
        }
    }

    // region
    public void setOpenedCallback(OpenedCallback openedCallback) {
        this.openedCallback = openedCallback;
    }

    public void setClosedCallback(ClosedCallback closedCallback) {
        this.closedCallback = closedCallback;
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }
    // endregion
}
