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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<CreateWebhooksResponse> create(
            CreateWebhooksRequest request) {
        return post(CreateWebhooksResponse.class,
                MisskeyAPI.IWebhooksCreate.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<DeleteWebhooksResponse> delete(
            DeleteWebhooksRequest request) {
        return post(DeleteWebhooksResponse.class,
                MisskeyAPI.IWebhooksDelete.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ShowWebhooksResponse[]> list(
            ListWebhooksRequest request) {
        return post(ShowWebhooksResponse[].class,
                MisskeyAPI.IWebhooksList.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ShowWebhooksResponse> show(
            ShowWebhooksRequest request) {
        return post(ShowWebhooksResponse.class,
                MisskeyAPI.IWebhooksShow.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UpdateWebhooksResponse> update(
            UpdateWebhooksRequest request) {
        return post(UpdateWebhooksResponse.class,
                MisskeyAPI.IWebhooksUpdate.code(), request);
    }

}
