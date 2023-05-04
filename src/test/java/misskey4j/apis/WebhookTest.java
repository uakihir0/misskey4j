package misskey4j.apis;

import org.junit.Test;

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

public class WebhookTest extends AbstractTest {
	Gson gson = new Gson();
	Misskey misskey;

	public String testCreate() {
		WebhooksType[] on = { WebhooksType.FOLLOW, WebhooksType.NOTE };
		CreateWebhooksRequest request1 = CreateWebhooksRequest.builder()
				.name("WehookTEst")
				.on(on)
				.secret("qazwsx")
				.url("https://socialhub.work/")
				.build();
		Response<CreateWebhooksResponse> response = misskey.webhook().create(request1);

		System.out.println(gson.toJson(response.get()));
		return response.get().getId();
	}

	public void testUpdate(String webhookid) {
		WebhooksType[] on = { WebhooksType.FOLLOW, WebhooksType.NOTE, WebhooksType.UNFOLLOW };
		UpdateWebhooksRequest request = UpdateWebhooksRequest.builder()
				.webhookId(webhookid)
				.name("WehookTEstRename")
				.secret("qazwsxRename")
				.url("https://socialhub.workRname/")
				.active(false)
				.on(on)
				.build();
		Response<UpdateWebhooksResponse> response = misskey.webhook().update(request);

		System.out.println(gson.toJson(response.get()));
	}

	public String testShow(String webhookid) {
		ShowWebhooksRequest request = ShowWebhooksRequest.builder()
				.webhookId(webhookid)
				.build();
		Response<ShowWebhooksResponse> response = misskey.webhook().show(request);

		System.out.println(gson.toJson(response.get()));
		return response.get().getId();
	}

	public void testList() {

		ListWebhooksRequest request1 = ListWebhooksRequest.builder()
				.build();
		Response<ShowWebhooksResponse[]> response = misskey.webhook().list(request1);

		for (ShowWebhooksResponse showWebhooksResponse : response.get()) {
			System.out.println(gson.toJson(showWebhooksResponse));
		}
	}

	public void testDelete(String webhookid) {
		DeleteWebhooksRequest deleteRequest = DeleteWebhooksRequest.builder()
				.webhookId(webhookid)
				.build();

		Response<DeleteWebhooksResponse> deleteWebhooksResponse = misskey.webhook().delete(deleteRequest);
		System.out.println(gson.toJson(deleteWebhooksResponse.get()));

	}

	@Test
	public void test() {
		misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);
		String webhookid = testCreate();
		testUpdate(webhookid);
		webhookid = testShow(webhookid);
		testList();
		testDelete(webhookid);
	}
}
