package misskey4j.apis;

import misskey4j.AbstractTest;
import misskey4j.Misskey;
import misskey4j.MisskeyFactory;
import misskey4j.api.request.notes.NotesTimelineRequest;
import misskey4j.api.request.reactions.ReactionsCreateRequest;
import misskey4j.api.response.notes.NotesTimelineResponse;
import misskey4j.entity.Color;
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
        if (note.getFeaturedId() != null) {
            System.out.println("!!!!!!!Featured!!!!!!!");
        }

        if (note.getRenote() != null) {
            System.out.println("!!Renote!!");
            System.out.println("User: " + note.getRenote().getUser().getName());
            System.out.println("Text: " + note.getRenote().getText());
            printColor(note.getRenote().getUser().getAvatarColor());

        } else {
            System.out.println("User: " + note.getUser().getName());
            System.out.println("Text: " + note.getText());
            printColor(note.getUser().getAvatarColor());
        }
    }

    private static void printColor(Color color) {
        if (color != null) {
            System.out.println(
                    "Color: " + color.getR()
                            + "," + color.getG()
                            + "," + color.getB());
        } else {
            System.out.println("Color: null");
        }
    }
}
