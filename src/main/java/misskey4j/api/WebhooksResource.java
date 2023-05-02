package misskey4j.api;

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

public interface WebhooksResource {

    /**
     * Webhookを作成します。
     * https://misskey.io/api-doc#tag/webhooks/operation/i/webhooks/create
     */
    Response<CreateWebhooksResponse> create(
    		CreateWebhooksRequest request);

    /**
     * Webhookを削除します。
     * https://misskey.io/api-doc#tag/webhooks/operation/i/webhooks/delete
     */
    Response<DeleteWebhooksResponse> delete(
    		DeleteWebhooksRequest request);

    /**
     * ログイン中のユーザーが設定しているWebhookの一覧を取得します。
     * https://misskey.io/api-doc#tag/webhooks/operation/i/webhooks/list
     */
    Response<ShowWebhooksResponse[]> list(
            ListWebhooksRequest request);

    /**
     * 与えられたidに対応するWebhookを取得します。
     * https://misskey.io/api-doc#tag/webhooks/operation/i/webhooks/show
     */
    Response<ShowWebhooksResponse> show(
    		ShowWebhooksRequest request);

    /**
     * Webhookの設定を更新します。
     * https://misskey.io/api-doc#tag/webhooks/operation/i/webhooks/update
     */
    Response<UpdateWebhooksResponse> update(
            UpdateWebhooksRequest request);
}
