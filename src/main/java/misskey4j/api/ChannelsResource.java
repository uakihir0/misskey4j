package misskey4j.api;

import misskey4j.api.request.ChannelsFollowedRequest;
import misskey4j.api.request.ChannelsTimelineRequest;
import misskey4j.api.response.ChannelsFollowedResponse;
import misskey4j.api.response.ChannelsTimelineResponse;
import misskey4j.entity.share.Response;

public interface ChannelsResource {

    /**
     * フォローしているチャンネル一覧を取得します。
     *
     * @see "https://misskey.io/api-doc#tag/channels/operation/channels/followed"
     */
    Response<ChannelsFollowedResponse[]> followed(
            ChannelsFollowedRequest request);

    /**
     * 指定したチャンネルのタイムラインを取得します。
     *
     * @see "https://misskey.io/api-doc#tag/notes/operation/channels/timeline"
     */
    Response<ChannelsTimelineResponse[]> timeline(
            ChannelsTimelineRequest request);

}
