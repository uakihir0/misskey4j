package misskey4j.apis;

import misskey4j.AbstractTest;
import misskey4j.Misskey;
import misskey4j.MisskeyFactory;
import misskey4j.api.request.notes.NotesTimelineRequest;
import misskey4j.api.response.notes.NotesTimelineResponse;
import misskey4j.entity.Note;
import misskey4j.entity.share.Response;
import org.junit.Test;

public class NotesTest extends AbstractTest {

    @Test
    public void testTimeline() {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);

        Response<NotesTimelineResponse[]> notes =
                misskey.notes().timeline(NotesTimelineRequest.builder()
                        .limit(100L)
                        .build());

        for (Note note : notes.get()) {
            print(note);
        }
    }

    public static void print(Note note) {
        System.out.println("// ------------------------------ //");

        if (note.getRenote() != null) {
            System.out.println("!!Renote!!");
            System.out.println("User: " + note.getRenote().getUser().getName());
            System.out.println("Text: " + note.getRenote().getText());

        } else {
            System.out.println("User: " + note.getUser().getName());
            System.out.println("Text: " + note.getText());
        }
    }
}
