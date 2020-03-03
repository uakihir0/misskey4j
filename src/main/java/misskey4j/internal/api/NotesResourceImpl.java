package misskey4j.internal.api;

import misskey4j.api.NotesResource;
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

public class NotesResourceImpl extends AbstractResourceImpl implements NotesResource {

    public NotesResourceImpl(String uri, String i) {
        super(uri, i);
    }

    @Override
    public Response<UsersNotesResponse[]> users(
            UsersNotesRequest request) {
        return post(UsersNotesResponse[].class,
                "users/notes", request);
    }

    @Override
    public Response<NotesResponse[]> notes(
            NotesRequest request) {
        return post(NotesResponse[].class,
                "notes", request);
    }

    @Override
    public Response<NotesChildrenResponse[]> children(
            NotesChildrenRequest request) {
        return post(NotesChildrenResponse[].class,
                "notes/children", request);
    }

    @Override
    public Response<NotesConversationResponse[]> conversation(
            NotesConversationRequest request) {
        return post(NotesConversationResponse[].class,
                "notes/conversation", request);
    }

    @Override
    public Response<NotesCreateResponse> create(
            NotesCreateRequest request) {
        return post(NotesCreateResponse.class,
                "notes/create", request);
    }

    @Override
    public Response<Void> delete(
            NotesDeleteRequest request) {
        return post("notes/delete", request);
    }
}
