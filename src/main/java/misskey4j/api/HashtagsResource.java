package misskey4j.api;

import misskey4j.api.request.hashtags.HashtagsTrendRequest;
import misskey4j.api.response.hashtags.HashtagsTrendResponse;
import misskey4j.entity.share.Response;

public interface HashtagsResource {

    /**
     * ハッシュタグのトレンドを取得します。
     * https://misskey.io/api-doc#operation/hashtags/trend
     */
    Response<HashtagsTrendResponse[]> trend(
            HashtagsTrendRequest request);

}
