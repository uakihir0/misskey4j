package misskey4j.stream;

import com.google.gson.Gson;
import misskey4j.internal.api.AbstractResourceImpl;
import misskey4j.stream.callback.EventCallback;
import misskey4j.stream.model.StreamRequest;
import net.socialhub.logger.Logger;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class StreamClient extends WebSocketClient {

    private static Logger logger = Logger.getLogger(StreamClient.class);

    private Map<String, List<EventCallback>> callbackMap = new HashMap<>();

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
        this.addCallback(id, callbacks);

        request.getBody().setChannel(type);
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
    }

    @Override
    public void onMessage(String message) {
        logger.debug(message);
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        logger.debug("Connection closed by "
                + (remote ? "remote peer" : "us")
                + " Code: " + code + " Reason: " + reason);
    }

    @Override
    public void onError(Exception e) {
        e.printStackTrace();
    }
}
