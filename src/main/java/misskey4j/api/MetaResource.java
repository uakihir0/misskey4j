package misskey4j.api;

import misskey4j.api.request.meta.EmojisRequest;
import misskey4j.api.request.meta.MetaRequest;
import misskey4j.api.response.meta.EmojisResponse;
import misskey4j.api.response.meta.MetaResponse;
import misskey4j.entity.share.Response;

public interface MetaResource {

    /**
     * インスタンス情報を取得します。
     * https://misskey.io/api-doc#operation/meta
     */
    Response<MetaResponse> meta(
            MetaRequest request);

    /**
     * (from v13)
     * 絵文字情報を取得します。
     */
    Response<EmojisResponse> emojis(
            EmojisRequest request);
}
