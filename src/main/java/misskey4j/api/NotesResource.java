package misskey4j.api;

import misskey4j.api.request.notes.NoteUnrenoteRequest;
import misskey4j.api.request.notes.NotesChildrenRequest;
import misskey4j.api.request.notes.NotesConversationRequest;
import misskey4j.api.request.notes.NotesCreateRequest;
import misskey4j.api.request.notes.NotesDeleteRequest;
import misskey4j.api.request.notes.NotesFeaturedRequest;
import misskey4j.api.request.notes.NotesGlobalTimelineRequest;
import misskey4j.api.request.notes.NotesHybridTimelineRequest;
import misskey4j.api.request.notes.NotesLocalTimelineRequest;
import misskey4j.api.request.notes.NotesMentionsRequest;
import misskey4j.api.request.notes.NotesReactionsRequest;
import misskey4j.api.request.notes.NotesRequest;
import misskey4j.api.request.notes.NotesSearchRequest;
import misskey4j.api.request.notes.NotesShowRequest;
import misskey4j.api.request.notes.NotesTimelineRequest;
import misskey4j.api.request.notes.NotesUserListTimelineRequest;
import misskey4j.api.request.notes.UsersNotesRequest;
import misskey4j.api.response.notes.NotesChildrenResponse;
import misskey4j.api.response.notes.NotesConversationResponse;
import misskey4j.api.response.notes.NotesCreateResponse;
import misskey4j.api.response.notes.NotesFeaturedResponse;
import misskey4j.api.response.notes.NotesGlobalTimelineResponse;
import misskey4j.api.response.notes.NotesHybridTimelineResponse;
import misskey4j.api.response.notes.NotesLocalTimelineResponse;
import misskey4j.api.response.notes.NotesMentionsResponse;
import misskey4j.api.response.notes.NotesReactionsResponse;
import misskey4j.api.response.notes.NotesResponse;
import misskey4j.api.response.notes.NotesSearchResponse;
import misskey4j.api.response.notes.NotesShowResponse;
import misskey4j.api.response.notes.NotesTimelineResponse;
import misskey4j.api.response.notes.NotesUserListTimelineResponse;
import misskey4j.api.response.notes.UsersNotesResponse;
import misskey4j.entity.share.Response;

public interface NotesResource {

    /**
     * 指定したユーザーのタイムラインを取得します。
     * https://misskey.io/api-doc#operation/users/notes
     */
    Response<UsersNotesResponse[]> users(
            UsersNotesRequest request);

    /**
     * 投稿を取得します。
     * https://misskey.io/api-doc#operation/notes
     */
    Response<NotesResponse[]> notes(
            NotesRequest request);

    /**
     * 指定した投稿への返信/引用を取得します。
     * https://misskey.io/api-doc#operation/notes/children
     */
    Response<NotesChildrenResponse[]> children(
            NotesChildrenRequest request);

    /**
     * 指定した投稿の文脈を取得します。
     * https://misskey.io/api-doc#operation/notes/conversation
     */
    Response<NotesConversationResponse[]> conversation(
            NotesConversationRequest request);

    /**
     * 投稿します。
     * https://misskey.io/api-doc#operation/notes/create
     */
    Response<NotesCreateResponse> create(
            NotesCreateRequest request);

    /**
     * 指定した投稿を削除します。
     * https://misskey.io/api-doc#operation/notes/delete
     */
    Response<Void> delete(
            NotesDeleteRequest request);

    /**
     * 自分に言及している投稿の一覧を取得します。
     * https://misskey.io/api-doc#operation/notes/mentions
     */
    Response<NotesMentionsResponse[]> mentions(
            NotesMentionsRequest request);

    /**
     * Featured な投稿を取得します。
     * https://misskey.io/api-doc#operation/notes/featured
     */
    Response<NotesFeaturedResponse[]> featured(
            NotesFeaturedRequest request);

    /**
     * グローバルタイムラインを取得します。
     * https://misskey.io/api-doc#operation/notes/global-timeline
     */
    Response<NotesGlobalTimelineResponse[]> globalTimeline(
            NotesGlobalTimelineRequest request);

    /**
     * ソーシャルタイムラインを取得します。
     * https://misskey.io/api-doc#operation/notes/hybrid-timeline
     */
    Response<NotesHybridTimelineResponse[]> hybridTimeline(
            NotesHybridTimelineRequest request);

    /**
     * ローカルタイムラインを取得します。
     * https://misskey.io/api-doc#operation/notes/local-timeline
     */
    Response<NotesLocalTimelineResponse[]> localTimeline(
            NotesLocalTimelineRequest request);

    /**
     * ノートのリアクションを取得します。
     * https://misskey.io/api-doc#tag/notes/operation/notes/reactions
     */
    Response<NotesReactionsResponse[]> reactions(
            NotesReactionsRequest request);

    /**
     * タイムラインを取得します。
     * https://misskey.io/api-doc#operation/notes/timeline
     */
    Response<NotesTimelineResponse[]> timeline(
            NotesTimelineRequest request);

    /**
     * 指定した投稿を取得します。
     * https://misskey.io/api-doc#operation/notes/show
     */
    Response<NotesShowResponse> show(
            NotesShowRequest request);

    /**
     * 投稿を検索します。
     * https://misskey.io/api-doc#operation/notes/search
     */
    Response<NotesSearchResponse[]> search(
            NotesSearchRequest request);

    /**
     * 指定したユーザーリストのタイムラインを取得します。
     * https://misskey.io/api-doc#operation/notes/user-list-timeline
     */
    Response<NotesUserListTimelineResponse[]> userListTimeline(
            NotesUserListTimelineRequest request);

    /**
     * 指定した投稿のRenoteを解除します。
     * https://misskey.io/api-doc#operation/notes/unrenote
     */
    Response<Void> unrenote(
            NoteUnrenoteRequest request);


}
