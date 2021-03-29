package misskey4j.apis;

import misskey4j.AbstractTest;
import misskey4j.Misskey;
import misskey4j.MisskeyFactory;
import misskey4j.api.request.notes.NotesCreateRequest;
import org.junit.Test;

public class RenoteText extends AbstractTest {

    @Test
    public void testRenote() {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);

        NotesCreateRequest.NotesCreateRequestBuilder builder =
                NotesCreateRequest.builder();

        builder.renoteId("").text("テスト");
        misskey.notes().create(builder.build());
    }
}
