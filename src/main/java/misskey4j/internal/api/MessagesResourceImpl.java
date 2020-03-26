package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.MessagesResource;
import misskey4j.api.request.messages.MessagingHistoryRequest;
import misskey4j.api.request.messages.MessagingMessagesCreateRequest;
import misskey4j.api.request.messages.MessagingMessagesDeleteRequest;
import misskey4j.api.request.messages.MessagingMessagesRequest;
import misskey4j.api.response.messages.MessagingHistoryResponse;
import misskey4j.api.response.messages.MessagingMessagesResponse;
import misskey4j.entity.share.Response;

public class MessagesResourceImpl extends AbstractResourceImpl implements MessagesResource {

    public MessagesResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<MessagingHistoryResponse[]> history(
            MessagingHistoryRequest request) {
        return post(MessagingHistoryResponse[].class,
                MisskeyAPI.MessagesHistory.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<MessagingMessagesResponse[]> messages(
            MessagingMessagesRequest request) {
        return post(MessagingMessagesResponse[].class,
                MisskeyAPI.Messages.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> messagesCreate(
            MessagingMessagesCreateRequest request) {
        return post(MisskeyAPI.MessagesCreate.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> messagesDelete(
            MessagingMessagesDeleteRequest request) {
        return post(MisskeyAPI.MessagesDelete.code(), request);
    }
}
