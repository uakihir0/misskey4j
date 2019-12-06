package misskey4j.internal;

import misskey4j.api.AccountsResource;
import misskey4j.api.request.IFavoritesRequest;
import misskey4j.api.request.INotificationsRequest;
import misskey4j.api.request.IRequest;
import misskey4j.api.response.IFavoritesResponse;
import misskey4j.api.response.INotificationsResponse;
import misskey4j.api.response.IResponse;
import misskey4j.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

final class AccountsResourceImpl extends AbstractResourceImpl implements AccountsResource {

    AccountsResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<IResponse> i(IRequest request) {
        return proceed(IResponse.class, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("i")
                    .json(toJson(auth(request)))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<IFavoritesResponse[]> iFavorites(
            IFavoritesRequest request) {

        return proceed(IFavoritesResponse[].class, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("i/favorites")
                    .json(toJson(auth(request)))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<INotificationsResponse[]> iNotifications(
            INotificationsRequest request) {

        return proceed(INotificationsResponse[].class, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("i/notifications")
                    .json(toJson(auth(request)))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }
}
