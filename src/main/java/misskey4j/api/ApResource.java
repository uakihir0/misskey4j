package misskey4j.api;

import misskey4j.api.request.ApShowRequest;
import misskey4j.api.response.ApShowResponse;
import misskey4j.entity.share.Response;

public interface ApResource {

    /**
     * 指定したuriのNoteまたはUserを取得します。

     * @see "https://misskey.io/api-doc#operation/ap/show"
     */
    Response<ApShowResponse> show(ApShowRequest request);

}
