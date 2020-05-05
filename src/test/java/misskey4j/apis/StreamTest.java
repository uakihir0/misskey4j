package misskey4j.apis;

import misskey4j.AbstractTest;
import misskey4j.Misskey;
import misskey4j.MisskeyFactory;
import misskey4j.entity.Note;
import misskey4j.entity.Notification;
import misskey4j.entity.User;
import misskey4j.stream.MisskeyStream;
import misskey4j.stream.callback.FollowedCallback;
import misskey4j.stream.callback.MentionCallback;
import misskey4j.stream.callback.NotificationCallback;
import misskey4j.stream.callback.RenoteCallback;
import misskey4j.stream.callback.ReplayCallback;
import org.junit.Test;

public class StreamTest extends AbstractTest {

    @Test
    public void testMainStream() throws InterruptedException {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);
        MisskeyStream stream = misskey.stream();

        stream.setOpenedCallback(() ->
                stream.main(new Callback()));

        stream.connect();
        Thread.sleep(1000 * 1000L);
    }

    @Test
    public void testHomeTimeLineStream() throws InterruptedException {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);
        MisskeyStream stream = misskey.stream();

        stream.setOpenedCallback(() ->
                stream.homeTimeLine(NotesTest::print));

        stream.connect();
        Thread.sleep(100 * 1000L);
    }

    @Test
    public void testGlobalTimeLineStream() throws InterruptedException {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);
        MisskeyStream stream = misskey.stream();

        stream.setOpenedCallback(() ->
                stream.globalTimeline(NotesTest::print));

        stream.connect();
        Thread.sleep(100 * 1000L);
    }

    public static class Callback implements
            MentionCallback,
            ReplayCallback,
            RenoteCallback,
            FollowedCallback,
            NotificationCallback {

        @Override
        public void onNotification(Notification notification) {
            System.out.println("!!onNotification!!");
        }

        @Override
        public void onFollowed(User user) {
            System.out.println("!!onFollowed!!");
        }

        @Override
        public void onMention(Note note) {
            System.out.println("!!onMention!!");
        }

        @Override
        public void onReply(Note note) {
            System.out.println("!!onReply!!");
        }

        @Override
        public void onRenote(Note note) {
            System.out.println("!!onRenote!!");
        }
    }
}
