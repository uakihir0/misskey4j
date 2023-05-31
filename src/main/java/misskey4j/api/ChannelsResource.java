package misskey4j.api;

import misskey4j.api.request.ChannelsFollowedRequest;
import misskey4j.api.request.ChannelsMyFavoritesRequest;
import misskey4j.api.request.ChannelsOwnedRequest;
import misskey4j.api.request.ChannelsShowRequest;
import misskey4j.api.request.ChannelsTimelineRequest;
import misskey4j.api.response.ChannelsFollowedResponse;
import misskey4j.api.response.ChannelsMyFavoritesResponse;
import misskey4j.api.response.ChannelsOwnedResponse;
import misskey4j.api.response.ChannelsShowResponse;
import misskey4j.api.response.ChannelsTimelineResponse;
import misskey4j.entity.share.Response;

public interface ChannelsResource {

    /**
     * 管理しているチャンネル一覧を取得します。
     *
     * @see "https://misskey.io/api-doc#tag/channels/operation/channels/owned"
     */
    Response<ChannelsOwnedResponse[]> owned(ChannelsOwnedRequest request);

    /**
     * お気に入りのチャンネル一覧を取得します。
     *
     * @see "https://misskey.io/api-doc#tag/channels/operation/channels/my-favorites"
     */
    Response<ChannelsMyFavoritesResponse[]> myFavorites(ChannelsMyFavoritesRequest request);

    /**
     * フォローしているチャンネル一覧を取得します。
     *
     * @see "https://misskey.io/api-doc#tag/channels/operation/channels/followed"
     */
    Response<ChannelsFollowedResponse[]> followed(ChannelsFollowedRequest request);

    /**
     * 指定したチャンネルのタイムラインを取得します。
     *
     * @see "https://misskey.io/api-doc#tag/notes/operation/channels/timeline"
     */
    Response<ChannelsTimelineResponse[]> timeline(ChannelsTimelineRequest request);

    /**
     * 指定したチャンネルの情報を取得します。
     *
     * @see "https://misskey.io/api-doc#tag/notes/operation/channels/show"
     */
    Response<ChannelsShowResponse> show(ChannelsShowRequest request);
}
