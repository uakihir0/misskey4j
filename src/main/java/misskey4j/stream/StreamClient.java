package misskey4j.stream;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
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
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class StreamClient extends WebSocketClient {

    private static Logger logger = Logger.getLogger(StreamClient.class);

    private Map<String, List<EventCallback>> callbackMap = new HashMap<>();

    private OpenedCallback openedCallback;
    private ClosedCallback closedCallback;
    private ErrorCallback errorCallback;


    public StreamClient(URI serverURI) {
        super(serverURI);
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
        send(text);
    }

    @Override
    public void onOpen(ServerHandshake handshake) {
        logger.debug("Opened connection.");
        if (openedCallback != null) {
            openedCallback.onOpened();
        }
    }

    @Override
    public void onMessage(String message) {
        Gson gson = AbstractResourceImpl.getGsonInstance();
        Type genericType = new TypeToken<StreamResponse<Object>>() {
        }.getType();

        StreamResponse<Object> generic = gson.fromJson(message, genericType);
        if (generic.getType().equals("channel")) {

            if (generic.getBody().getType().equals("note")) {
                Type noteType = new TypeToken<StreamResponse<Note>>() {
                }.getType();

                StreamResponse<Note> note = gson.fromJson(message, noteType);
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

        logger.debug(message);
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        logger.debug("Connection closed by "
                + (remote ? "remote peer" : "us")
                + " Code: " + code + " Reason: " + reason);

        if (closedCallback != null) {
            closedCallback.onClosed(code, reason, remote);
        }
    }

    @Override
    public void onError(Exception e) {
        if (errorCallback != null) {
            errorCallback.onError(e);
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
