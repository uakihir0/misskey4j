package misskey4j.api;

import misskey4j.api.request.mutes.MutesCreateRequest;
import misskey4j.api.request.mutes.MutesDeleteRequest;
import misskey4j.api.request.mutes.MutesListRequest;
import misskey4j.api.response.mutes.MutesListResponse;
import misskey4j.entity.share.Response;

public interface MutesResource {

    /**
     * ユーザーをミュートします。
     * https://misskey.io/api-doc#operation/mute/create
     */
    Response<Void> create(MutesCreateRequest request);

    /**
     * ユーザーのミュートを解除します。
     * https://misskey.io/api-doc#operation/mute/delete
     */
    Response<Void> delete(MutesDeleteRequest request);

    /**
     * ミュートしているユーザー一覧を取得します。
     * https://misskey.io/api-doc#operation/mute/list
     */
    Response<MutesListResponse[]> list(MutesListRequest request);
}
