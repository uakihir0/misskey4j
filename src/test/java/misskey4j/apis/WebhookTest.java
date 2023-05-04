package misskey4j.apis;

import com.google.gson.Gson;
import misskey4j.AbstractTest;
import misskey4j.Misskey;
import misskey4j.MisskeyFactory;
import misskey4j.api.request.webhooks.CreateWebhooksRequest;
import misskey4j.api.request.webhooks.DeleteWebhooksRequest;
import misskey4j.api.request.webhooks.ListWebhooksRequest;
import misskey4j.api.request.webhooks.ShowWebhooksRequest;
import misskey4j.api.request.webhooks.UpdateWebhooksRequest;
import misskey4j.api.response.webhooks.CreateWebhooksResponse;
import misskey4j.api.response.webhooks.DeleteWebhooksResponse;
import misskey4j.api.response.webhooks.ShowWebhooksResponse;
import misskey4j.api.response.webhooks.UpdateWebhooksResponse;
import misskey4j.entity.contant.WebhooksType;
import misskey4j.entity.share.Response;
import org.junit.Test;

public class WebhookTest extends AbstractTest {

    Gson gson = new Gson();

    public String createWebhook(Misskey misskey) {

        WebhooksType[] on = {WebhooksType.FOLLOW, WebhooksType.NOTE};
        CreateWebhooksRequest request = CreateWebhooksRequest.builder()
                .name("WebhookTest")
                .on(on)
                .secret("qazwsx")
                .url("https://socialhub.work/")
                .build();

        Response<CreateWebhooksResponse> response = misskey.webhook().create(request);
        System.out.println(gson.toJson(response.get()));
        return response.get().getId();
    }

    public void updateWebhook(Misskey misskey, String webhookId) {

        WebhooksType[] on = {WebhooksType.FOLLOW, WebhooksType.NOTE, WebhooksType.UNFOLLOW};
        UpdateWebhooksRequest request = UpdateWebhooksRequest.builder()
                .webhookId(webhookId)
                .name("WebhookTestRename")
                .secret("qazwsx")
                .url("https://socialhub.work/")
                .active(false)
                .on(on)
                .build();

        Response<UpdateWebhooksResponse> response = misskey.webhook().update(request);
        System.out.println(gson.toJson(response.get()));
    }

    public String showWebhook(Misskey misskey, String webhookId) {

        ShowWebhooksRequest request = ShowWebhooksRequest.builder()
                .webhookId(webhookId)
                .build();

        Response<ShowWebhooksResponse> response = misskey.webhook().show(request);
        System.out.println(gson.toJson(response.get()));
        return response.get().getId();
    }

    public void listWebhook(Misskey misskey) {

        ListWebhooksRequest request = ListWebhooksRequest.builder().build();
        Response<ShowWebhooksResponse[]> response = misskey.webhook().list(request);

        for (ShowWebhooksResponse showWebhooksResponse : response.get()) {
            System.out.println(gson.toJson(showWebhooksResponse));
        }
    }

    public void deleteWebhook(Misskey misskey, String webhookId) {

        DeleteWebhooksRequest deleteRequest = DeleteWebhooksRequest.builder()
                .webhookId(webhookId)
                .build();

        Response<DeleteWebhooksResponse> deleteWebhooksResponse = misskey.webhook().delete(deleteRequest);
        System.out.println(gson.toJson(deleteWebhooksResponse.get()));
    }

    @Test
    public void testWebhookScenario() {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);
        String webhookId = createWebhook(misskey);
        updateWebhook(misskey, webhookId);
        webhookId = showWebhook(misskey, webhookId);
        listWebhook(misskey);
        deleteWebhook(misskey, webhookId);
    }
}
