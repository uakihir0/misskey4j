package misskey4j.internal.api;

import misskey4j.api.FollowingResource;
import misskey4j.api.request.following.FollowingCreateRequest;
import misskey4j.api.request.following.FollowingDeleteRequest;
import misskey4j.entity.share.Response;

public class FollowingResourceImpl extends AbstractResourceImpl implements FollowingResource {

    public FollowingResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> create(
            FollowingCreateRequest request) {
        return post("following/create", request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> delete(
            FollowingDeleteRequest request) {
        return post("following/delete", request);
    }
}
