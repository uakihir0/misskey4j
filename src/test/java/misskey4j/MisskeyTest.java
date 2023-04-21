package misskey4j;

import misskey4j.api.request.CreateAppRequest;
import misskey4j.api.request.GenerateAuthSessionRequest;
import misskey4j.api.request.GetMiAuthUriRequest;
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
    public void testGetMiAuthUri() {
        Misskey misskey = MisskeyFactory.getInstance(HOST);

        Response<String> response =
                misskey.auth().getMiAuthUri(
                        GetMiAuthUriRequest.builder()
                                .name("Misskey4J")
                                .callbackUrl("https://socialhub.work/")
                                .permission(Scope.ALL)
                                .build());

        System.out.println("URL:" + response.get());
    }

    @Test
    public void testCreateApp() {
        Misskey misskey = MisskeyFactory.getInstance(HOST);

        Response<CreateAppResponse> response =
                misskey.app().createApp(
                        CreateAppRequest.builder()
                                .name("Misskey4J")
                                .description("Misskey4J Test")
                                .callbackUrl("https://socialhub.work/")
                                .permission(Scope.ALL)
                                .build());

        System.out.println("ID:" + response.get().getId());
        System.out.println("Secret:" + response.get().getSecret());
    }

    @Test
    public void testGenerateSession() {
        Misskey misskey = MisskeyFactory.getInstance(HOST);

        Response<CreateAppResponse> response1 =
                misskey.app().createApp(
                        CreateAppRequest.builder()
                                .name("Misskey4J")
                                .description("Misskey4J Test")
                                .callbackUrl("https://socialhub.work/")
                                .permission(Scope.ALL)
                                .build());

        Response<GenerateAuthSessionResponse> response2 =
                misskey.auth().sessionGenerate(
                        GenerateAuthSessionRequest.builder()
                                .appSecret(response1.get().getSecret())
                                .build());

        System.out.println("URL: " + response2.get().getUrl());
    }

    @Test
    public void testUserKey() {
        Misskey misskey = MisskeyFactory.getInstance(HOST);

        Response<UserKeyAuthSessionResponse> response =
                misskey.auth().sessionUserKey(
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

    @Test
    public void testGetIFromWebUIAccessToken() {
        Misskey misskey = MisskeyFactory.getInstanceWithOwnedAccessToken(HOST, OWNED_USER_TOKEN);
        Response<IResponse> response = misskey.accounts().i(IRequest.builder().build());

        System.out.println("NAME: " + response.get().getName());
    }

    @Test
    public void testGetHost() {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);
        System.out.println("NAME: " + misskey.getHost());
    }
}
