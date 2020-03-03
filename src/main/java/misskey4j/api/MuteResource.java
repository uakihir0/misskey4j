package misskey4j.api;

import misskey4j.api.request.mute.MuteCreateRequest;
import misskey4j.api.request.mute.MuteDeleteRequest;
import misskey4j.api.request.mute.MuteListRequest;
import misskey4j.api.response.mute.MuteListResponse;
import misskey4j.entity.share.Response;

public interface MuteResource {

    /**
     * ユーザーをミュートします。
     * https://misskey.io/api-doc#operation/mute/create
     */
    Response<Void> create(MuteCreateRequest request);

    /**
     * ユーザーのミュートを解除します。
     * https://misskey.io/api-doc#operation/mute/delete
     */
    Response<Void> delete(MuteDeleteRequest request);

    /**
     * ミュートしているユーザー一覧を取得します。
     * https://misskey.io/api-doc#operation/mute/list
     */
    Response<MuteListResponse[]> list(MuteListRequest request);
}
