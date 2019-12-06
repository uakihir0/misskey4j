package misskey4j.internal;

import misskey4j.api.NoteResource;
import misskey4j.api.request.UsersNotesRequest;
import misskey4j.api.response.UsersNotesResponse;
import misskey4j.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

public class NoteResourceImpl extends AbstractResourceImpl implements NoteResource {

    NoteResourceImpl(String uri, String i) {
        super(uri, i);
    }

    @Override
    public Response<UsersNotesResponse[]> usersNotes(
            UsersNotesRequest request) {

        return proceed(UsersNotesResponse[].class, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("users/notes")
                    .json(toJson(request))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }
}
