package misskey4j.internal;

import misskey4j.api.ListResource;
import misskey4j.api.request.ListUsersListsRequest;
import misskey4j.api.request.ShowUsersListsRequest;
import misskey4j.api.response.ListUsersListsResponse;
import misskey4j.api.response.ShowUsersListsResponse;
import misskey4j.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

public class ListResourceImpl extends AbstractResourceImpl implements ListResource {

    ListResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ListUsersListsResponse[]> listUsersLists(
            ListUsersListsRequest request) {

        return proceed(ListUsersListsResponse[].class, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("users/lists/list")
                    .json(toJson(auth(request)))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ShowUsersListsResponse> showUsersLists(
            ShowUsersListsRequest request) {

        return proceed(ShowUsersListsResponse.class, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("users/lists/show")
                    .json(toJson(auth(request)))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }
}
