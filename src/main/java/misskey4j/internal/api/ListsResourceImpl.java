package misskey4j.internal.api;

import misskey4j.api.ListsResource;
import misskey4j.api.request.UsersListsListRequest;
import misskey4j.api.request.UsersListsShowRequest;
import misskey4j.api.response.UsersListsListResponse;
import misskey4j.api.response.UsersListsShowResponse;
import misskey4j.entity.share.Response;

public class ListsResourceImpl extends AbstractResourceImpl implements ListsResource {

    public ListsResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UsersListsListResponse[]> list(
            UsersListsListRequest request) {
        return post(UsersListsListResponse[].class,
                "users/lists/list", request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UsersListsShowResponse> show(
            UsersListsShowRequest request) {
        return post(UsersListsShowResponse.class,
                "users/lists/show", request);
    }
}
