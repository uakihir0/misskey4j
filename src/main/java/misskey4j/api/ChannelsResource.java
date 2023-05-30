package misskey4j.api;

import misskey4j.api.request.ChannelsFollowedRequest;
import misskey4j.api.response.ChannelsFollowedResponse;
import misskey4j.entity.share.Response;

public interface ChannelsResource {

    /**
     * フォローしているチャンネル一覧を取得します。
     *
     * @see "https://misskey.io/api-doc#tag/channels/operation/channels/followed"
     */
    Response<ChannelsFollowedResponse[]> followed(
            ChannelsFollowedRequest request);

}
