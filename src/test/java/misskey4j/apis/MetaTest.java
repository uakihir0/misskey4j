package misskey4j.apis;

import misskey4j.AbstractTest;
import misskey4j.Misskey;
import misskey4j.MisskeyFactory;
import misskey4j.api.request.meta.EmojisRequest;
import misskey4j.api.request.meta.MetaRequest;
import misskey4j.api.response.meta.EmojisResponse;
import misskey4j.entity.share.Response;
import org.junit.Test;

public class MetaTest extends AbstractTest {

    @Test
    public void testGetMeta() {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);
        misskey.meta().meta(MetaRequest.builder().detail(true).build());
    }

    @Test
    public void testGetEmojis() {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);
        Response<EmojisResponse> response = misskey.meta().emojis(EmojisRequest.builder().build());

        response.get().getEmojis().forEach(e -> {
            System.out.println(e.getName());
            System.out.println(e.getUrl());
        });
    }
}
