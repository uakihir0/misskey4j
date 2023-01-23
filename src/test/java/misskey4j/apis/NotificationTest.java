package misskey4j.apis;

import misskey4j.AbstractTest;
import misskey4j.Misskey;
import misskey4j.MisskeyFactory;
import misskey4j.api.request.i.INotificationsRequest;
import org.junit.Test;

public class NotificationTest extends AbstractTest {

    @Test
    public void testNotification() {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);

        misskey.accounts().iNotifications(INotificationsRequest.builder().build());
    }
}
