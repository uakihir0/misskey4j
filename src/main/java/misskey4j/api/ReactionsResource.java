package misskey4j.api;

import misskey4j.api.request.reactions.ReactionsCreateRequest;
import misskey4j.api.request.reactions.ReactionsDeleteRequest;
import misskey4j.entity.share.Response;

public interface ReactionsResource {

    /**
     * 指定した投稿にリアクションします。
     * https://misskey.io/api-doc#operation/notes/reactions/create
     */
    Response<Void> create(
            ReactionsCreateRequest request);

    /**
     * 指定した投稿へのリアクションを取り消します。
     * https://misskey.io/api-doc#operation/notes/reactions/delete
     */
    Response<Void> delete(
            ReactionsDeleteRequest request);

}
