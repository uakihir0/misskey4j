package misskey4j.internal.api;

import misskey4j.api.ReactionsResource;
import misskey4j.api.request.reactions.ReactionsCreateRequest;
import misskey4j.api.request.reactions.ReactionsDeleteRequest;
import misskey4j.entity.share.Response;

public class ReactionsResourceImpl extends AbstractResourceImpl implements ReactionsResource {

    public ReactionsResourceImpl(String uri, String i) {
        super(uri, i);
    }

    @Override
    public Response<Void> create(
            ReactionsCreateRequest request) {
        return post("notes/reactions/create", request);
    }

    @Override
    public Response<Void> delete(
            ReactionsDeleteRequest request) {
        return post("notes/reactions/delete", request);
    }
}
