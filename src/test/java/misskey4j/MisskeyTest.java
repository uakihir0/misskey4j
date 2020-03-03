package misskey4j;

import misskey4j.api.request.CreateAppRequest;
import misskey4j.api.request.GenerateAuthSessionRequest;
import misskey4j.api.request.UserKeyAuthSessionRequest;
import misskey4j.api.request.i.IRequest;
import misskey4j.api.response.CreateAppResponse;
import misskey4j.api.response.GenerateAuthSessionResponse;
import misskey4j.api.response.UserKeyAuthSessionResponse;
import misskey4j.api.response.i.IResponse;
import misskey4j.entity.contant.Scope;
import misskey4j.entity.share.Response;
import org.junit.Test;

public class MisskeyTest extends AbstractTest {

    @Test
    public void testCreateApp() {
        Misskey misskey = MisskeyFactory.getInstance(HOST);

        Response<CreateAppResponse> response =
                misskey.app().createApp(
                        CreateAppRequest.builder()
                                .name("Misskey4J")
                                .description("Misskey4J Test")
                                .callbackUrl("http://localhost:8080/")
                                .permission(Scope.ALL)
                                .build());

        System.out.println("ID:" + response.get().getId());
        System.out.println("Secret:" + response.get().getSecret());
    }

    @Test
    public void testGenerateSession() {
        Misskey misskey = MisskeyFactory.getInstance(HOST);

        Response<GenerateAuthSessionResponse> response =
                misskey.auth().generateAuthSession(
                        GenerateAuthSessionRequest.builder()
                                .appSecret(CLIENT_SECRET)
                                .build());

        System.out.println("URL: " + response.get().getUrl());
    }

    @Test
    public void testUserKey() {
        Misskey misskey = MisskeyFactory.getInstance(HOST);

        Response<UserKeyAuthSessionResponse> response =
                misskey.auth().userKeyAuthSession(
                        UserKeyAuthSessionRequest.builder()
                                .token("VERIFY TOKEN")
                                .appSecret(CLIENT_SECRET)
                                .build());

        System.out.println("USER TOKEN: " + response.get().getAccessToken());
        System.out.println("NAME: " + response.get().getUser().getName());
    }

    @Test
    public void testGetI() {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);
        Response<IResponse> response = misskey.accounts().i(IRequest.builder().build());

        System.out.println("NAME: " + response.get().getName());
    }
}
