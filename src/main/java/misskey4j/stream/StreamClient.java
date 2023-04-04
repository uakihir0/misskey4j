package misskey4j.stream;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import misskey4j.entity.Note;
import misskey4j.entity.Notification;
import misskey4j.entity.User;
import misskey4j.internal.api.AbstractResourceImpl;
import misskey4j.stream.callback.ClosedCallback;
import misskey4j.stream.callback.ErrorCallback;
import misskey4j.stream.callback.EventCallback;
import misskey4j.stream.callback.FollowedCallback;
import misskey4j.stream.callback.MentionCallback;
import misskey4j.stream.callback.NoteCallback;
import misskey4j.stream.callback.NotificationCallback;
import misskey4j.stream.callback.OpenedCallback;
import misskey4j.stream.callback.RenoteCallback;
import misskey4j.stream.callback.ReplayCallback;
import misskey4j.stream.client.WebSocketClient;
import misskey4j.stream.client.WebSocketListener;
import misskey4j.stream.model.StreamRequest;
import misskey4j.stream.model.StreamResponse;
import net.socialhub.logger.Logger;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class StreamClient implements WebSocketListener {

    private static Logger logger = Logger.getLogger(StreamClient.class);

    private Map<String, List<EventCallback>> callbackMap = new HashMap<>();
    private OpenedCallback openedCallback;
    private ClosedCallback closedCallback;
    private ErrorCallback errorCallback;

    private WebSocketClient client;
    private boolean isOpen = false;
    private Timer timer = new Timer(false);

    public StreamClient(String uri, Logger.LogLevel logLevel) {
        logger.setLogLevel(logLevel);
        logger.debug("Uri: " + uri);

        try {
            client = new WebSocketClient(new URI(uri), this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void connect() {
        client.connect();
    }

    public void close() {
        client.disconnect();
        this.isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
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
        client.send(text);
    }

    @Override
    public void onConnect() {
        logger.debug("Opened connection.");
        this.isOpen = true;

        if (openedCallback != null) {
            openedCallback.onOpened();
        }

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (!isOpen) {
                    timer.cancel();
                    return;
                }
                client.sendPing();
            }
        };

        timer.schedule(task, 10, 10000);
    }

    @Override
    public void onMessage(String message) {
        Gson gson = AbstractResourceImpl.getGsonInstance();
        Type genericType = new TypeToken<StreamResponse<Object>>() {
        }.getType();

        StreamResponse<Object> generic = gson.fromJson(message, genericType);
        if (generic.getType().equals("channel")) {

            // NOTE
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

            // REPLY
            if (generic.getBody().getType().equals("reply")) {
                Type noteType = new TypeToken<StreamResponse<Note>>() {
                }.getType();

                StreamResponse<Note> note = gson.fromJson(message, noteType);
                List<EventCallback> events = callbackMap.get(generic.getBody().getId());

                if (events != null && events.size() > 0) {
                    for (EventCallback event : events) {
                        if (event instanceof ReplayCallback) {
                            Note body = note.getBody().getBody();
                            ((ReplayCallback) event).onReply(body);
                        }
                    }
                }
            }

            // MENTION
            if (generic.getBody().getType().equals("mention")) {
                Type noteType = new TypeToken<StreamResponse<Note>>() {
                }.getType();

                StreamResponse<Note> note = gson.fromJson(message, noteType);
                List<EventCallback> events = callbackMap.get(generic.getBody().getId());

                if (events != null && events.size() > 0) {
                    for (EventCallback event : events) {
                        if (event instanceof MentionCallback) {
                            Note body = note.getBody().getBody();
                            ((MentionCallback) event).onMention(body);
                        }
                    }
                }
            }

            // RENOTE
            if (generic.getBody().getType().equals("renote")) {
                Type noteType = new TypeToken<StreamResponse<Note>>() {
                }.getType();

                StreamResponse<Note> note = gson.fromJson(message, noteType);
                List<EventCallback> events = callbackMap.get(generic.getBody().getId());

                if (events != null && events.size() > 0) {
                    for (EventCallback event : events) {
                        if (event instanceof RenoteCallback) {
                            Note body = note.getBody().getBody();
                            ((RenoteCallback) event).onRenote(body);
                        }
                    }
                }
            }

            // FOLLOWED
            if (generic.getBody().getType().equals("followed")) {
                Type userType = new TypeToken<StreamResponse<User>>() {
                }.getType();

                StreamResponse<User> user = gson.fromJson(message, userType);
                List<EventCallback> events = callbackMap.get(generic.getBody().getId());

                if (events != null && events.size() > 0) {
                    for (EventCallback event : events) {
                        if (event instanceof FollowedCallback) {
                            User body = user.getBody().getBody();
                            ((FollowedCallback) event).onFollowed(body);
                        }
                    }
                }
            }

            // Notification
            if (generic.getBody().getType().equals("notification")) {
                Type notificationType = new TypeToken<StreamResponse<Notification>>() {
                }.getType();

                StreamResponse<Notification> notification = gson.fromJson(message, notificationType);
                List<EventCallback> events = callbackMap.get(generic.getBody().getId());

                if (events != null && events.size() > 0) {
                    for (EventCallback event : events) {
                        if (event instanceof NotificationCallback) {
                            Notification body = notification.getBody().getBody();
                            ((NotificationCallback) event).onNotification(body);
                        }
                    }
                }
            }
        }

        logger.debug(message);
    }

    @Override
    public void onDisconnect(int code, String reason) {
        logger.debug("Connection closed, code: " + code + " reason: " + reason);
        this.isOpen = false;

        if (closedCallback != null) {
            closedCallback.onClosed(false);
        }
    }

    @Override
    public void onError(Exception cause) {
        if (cause != null) {
            logger.debug("Exception: " + cause.getClass().getName()
                    + " message: " + cause.getMessage());
            logger.debug("Trace: ", cause);
        }

        if (errorCallback != null) {
            errorCallback.onError(cause);
        }
    }

    @Override
    public void onMessage(byte[] data) {
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
