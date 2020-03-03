package misskey4j.api;

import misskey4j.api.request.notes.NotesChildrenRequest;
import misskey4j.api.request.notes.NotesConversationRequest;
import misskey4j.api.request.notes.NotesCreateRequest;
import misskey4j.api.request.notes.NotesDeleteRequest;
import misskey4j.api.request.notes.NotesRequest;
import misskey4j.api.request.notes.UsersNotesRequest;
import misskey4j.api.response.notes.NotesChildrenResponse;
import misskey4j.api.response.notes.NotesConversationResponse;
import misskey4j.api.response.notes.NotesCreateResponse;
import misskey4j.api.response.notes.NotesResponse;
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
}
