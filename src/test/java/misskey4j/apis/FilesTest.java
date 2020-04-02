package misskey4j.apis;

import misskey4j.AbstractTest;
import misskey4j.Misskey;
import misskey4j.MisskeyFactory;
import misskey4j.api.request.files.FilesCreateRequest;
import org.junit.Test;

import java.io.InputStream;

public class FilesTest extends AbstractTest {

    @Test
    public void testCreateFile() {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);
        InputStream stream = getClass().getResourceAsStream("/img/misskey4j.png");

        FilesCreateRequest build =
                FilesCreateRequest.builder()
                        .name("misskey4j.png")
                        .stream(stream)
                        .force(true)
                        .build();

        misskey.files().create(build);
    }
}
