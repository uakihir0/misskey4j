package misskey4j.api;

import misskey4j.api.request.UsersNotesRequest;
import misskey4j.api.response.UsersNotesResponse;
import misskey4j.entity.share.Response;

public interface NoteResource {

    /**
     * 指定したユーザーのタイムラインを取得します。
     * https://misskey.io/api-doc#operation/users/notes
     */
    Response<UsersNotesResponse[]> usersNotes(
            UsersNotesRequest request);
}
