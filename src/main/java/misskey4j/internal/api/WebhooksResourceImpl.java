package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.WebhooksResource;
import misskey4j.api.request.webhooks.CreateWebhooksRequest;
import misskey4j.api.request.webhooks.DeleteWebhooksRequest;
import misskey4j.api.request.webhooks.ListWebhooksRequest;
import misskey4j.api.request.webhooks.ShowWebhooksRequest;
import misskey4j.api.request.webhooks.UpdateWebhooksRequest;
import misskey4j.api.response.webhooks.CreateWebhooksResponse;
import misskey4j.api.response.webhooks.DeleteWebhooksResponse;
import misskey4j.api.response.webhooks.ShowWebhooksResponse;
import misskey4j.api.response.webhooks.UpdateWebhooksResponse;
import misskey4j.entity.share.Response;

public class WebhooksResourceImpl extends AbstractResourceImpl implements WebhooksResource {

	public WebhooksResourceImpl(String uri, String i) {
		super(uri, i);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public Response<CreateWebhooksResponse> create(CreateWebhooksRequest request) {
		// TODO 自動生成されたメソッド・スタブ
		return post(CreateWebhooksResponse.class,
                MisskeyAPI.IWebhooksCreate.code(), request);
	}

	@Override
	public Response<DeleteWebhooksResponse> delete(DeleteWebhooksRequest request) {
		// TODO 自動生成されたメソッド・スタブ
		return post(DeleteWebhooksResponse.class,
                MisskeyAPI.IWebhooksDelete.code(), request);
	}

	@Override
	public Response<ShowWebhooksResponse[]> list(ListWebhooksRequest request) {
		// TODO 自動生成されたメソッド・スタブ
		return post(ShowWebhooksResponse[].class,
                MisskeyAPI.IWebhooksList.code(), request);
	}

	@Override
	public Response<ShowWebhooksResponse> show(ShowWebhooksRequest request) {
		// TODO 自動生成されたメソッド・スタブ
		return post(ShowWebhooksResponse.class,
                MisskeyAPI.IWebhooksShow.code(), request);
	}

	@Override
	public Response<UpdateWebhooksResponse> update(UpdateWebhooksRequest request) {
		// TODO 自動生成されたメソッド・スタブ
		return post(UpdateWebhooksResponse.class,
                MisskeyAPI.IWebhooksUpdate.code(), request);
	}

}
