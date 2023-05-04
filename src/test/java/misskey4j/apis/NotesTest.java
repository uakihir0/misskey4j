package misskey4j.apis;

import misskey4j.AbstractTest;
import misskey4j.Misskey;
import misskey4j.MisskeyFactory;
import misskey4j.api.request.i.IFavoritesRequest;
import misskey4j.api.request.notes.NotesTimelineRequest;
import misskey4j.api.response.i.IFavoritesResponse;
import misskey4j.api.response.notes.NotesTimelineResponse;
import misskey4j.entity.Color;
import misskey4j.entity.Instance;
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

    @Test
    public void testFavorites() {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);

        Response<IFavoritesResponse[]> favorites =
                misskey.accounts().iFavorites(IFavoritesRequest.builder()
                        .limit(100L)
                        .build());

        for (IFavoritesResponse favorite : favorites.get()) {
            print(favorite.getNote());
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

            if (note.getUser().getInstance() != null) {
                Instance instance = note.getUser().getInstance();
                System.out.println("Instance Name: " + instance.getName());
                System.out.println("Instance Color R: " + instance.getThemeColor().getR());
            }

            note.getFiles().forEach(e -> {
                System.out.println("File OriginalURL: " + e.getOriginalUrl());
                System.out.println("File URL: " + e.getUrl());
            });

            if (note.getEmojis() != null) {
                note.getEmojis().forEach(e -> {
                    System.out.println("Emoji Name: " + e.getName());
                    System.out.println("Emoji URL: " + e.getUrl());
                });
            }
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
