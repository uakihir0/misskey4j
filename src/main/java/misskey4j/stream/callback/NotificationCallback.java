package misskey4j.stream.callback;

import misskey4j.entity.Notification;

public interface NotificationCallback extends EventCallback {
    void onNotification(Notification notification);
}
