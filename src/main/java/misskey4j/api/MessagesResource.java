package misskey4j.api;

import misskey4j.api.request.messages.MessagingHistoryRequest;
import misskey4j.api.request.messages.MessagingMessagesCreateRequest;
import misskey4j.api.request.messages.MessagingMessagesDeleteRequest;
import misskey4j.api.request.messages.MessagingMessagesRequest;
import misskey4j.api.response.messages.MessagingHistoryResponse;
import misskey4j.api.response.messages.MessagingMessagesResponse;
import misskey4j.entity.share.Response;

public interface MessagesResource {

    /**
     * トークの履歴を取得します。
     * https://misskey.io/api-doc#operation/messaging/history
     */
    Response<MessagingHistoryResponse[]> history(
            MessagingHistoryRequest request);

    /**
     * トークメッセージ一覧を取得します。
     * https://misskey.io/api-doc#operation/messaging/messages
     */
    Response<MessagingMessagesResponse[]> messages(
            MessagingMessagesRequest request);

    /**
     * トークメッセージを送信します。
     * https://misskey.io/api-doc#operation/messaging/messages/create
     */
    Response<Void> messagesCreate(
            MessagingMessagesCreateRequest request);

    /**
     * 指定したトークメッセージを削除します。
     * https://misskey.io/api-doc#operation/messaging/messages/delete
     */
    Response<Void> messagesDelete(
            MessagingMessagesDeleteRequest request);

}
