package misskey4j.internal.api;

import misskey4j.api.AccountsResource;
import misskey4j.api.request.i.IFavoritesRequest;
import misskey4j.api.request.i.INotificationsRequest;
import misskey4j.api.request.i.IRequest;
import misskey4j.api.response.i.IFavoritesResponse;
import misskey4j.api.response.i.INotificationsResponse;
import misskey4j.api.response.i.IResponse;
import misskey4j.entity.share.Response;

public class AccountsResourceImpl extends AbstractResourceImpl implements AccountsResource {

    public AccountsResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<IResponse> i(
            IRequest request) {
        return post(IResponse.class,
                "i", request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<IFavoritesResponse[]> iFavorites(
            IFavoritesRequest request) {
        return post(IFavoritesResponse[].class,
                "i/favorites", request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<INotificationsResponse[]> iNotifications(
            INotificationsRequest request) {
        return post(INotificationsResponse[].class,
                "i/notifications", request);
    }
}
