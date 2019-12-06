package misskey4j.internal;

import misskey4j.Misskey;
import misskey4j.api.AccountsResource;
import misskey4j.api.AppResource;
import misskey4j.api.AuthResource;
import misskey4j.api.ListResource;
import misskey4j.api.UserResource;
import misskey4j.api.request.CreateAppRequest;
import misskey4j.api.request.GenerateAuthSessionRequest;
import misskey4j.api.request.IFavoritesRequest;
import misskey4j.api.request.INotificationsRequest;
import misskey4j.api.request.IRequest;
import misskey4j.api.request.ListUsersListsRequest;
import misskey4j.api.request.ShowUsersListsRequest;
import misskey4j.api.request.UserKeyAuthSessionRequest;
import misskey4j.api.request.users.CreateFollowRequest;
import misskey4j.api.request.users.CreateMuteRequest;
import misskey4j.api.request.users.DeleteFollowRequest;
import misskey4j.api.request.users.DeleteMuteRequest;
import misskey4j.api.request.users.UsersFollowersRequest;
import misskey4j.api.request.users.UsersFollowingsRequest;
import misskey4j.api.response.CreateAppResponse;
import misskey4j.api.response.GenerateAuthSessionResponse;
import misskey4j.api.response.IFavoritesResponse;
import misskey4j.api.response.INotificationsResponse;
import misskey4j.api.response.IResponse;
import misskey4j.api.response.ListUsersListsResponse;
import misskey4j.api.response.ShowUsersListsResponse;
import misskey4j.api.response.UserKeyAuthSessionResponse;
import misskey4j.api.response.users.UsersFollowersResponse;
import misskey4j.api.response.users.UsersFollowingsResponse;
import misskey4j.entity.share.Response;

public class MisskeyImpl implements Misskey {

    private AppResource app;
    private AuthResource auth;
    private AccountsResource accounts;
    private UserResource user;
    private ListResource list;

    public MisskeyImpl(String url, String i) {

        app = new AppResourceImpl(url);
        auth = new AuthResourceImpl(url);

        // Needs AccessToken
        accounts = new AccountsResourceImpl(url, i);
        user = new UserResourceImpl(url, i);
        list = new ListResourceImpl(url, i);
    }

    @Override
    public AppResource app() {
        return app;
    }

    @Override
    public AuthResource auth() {
        return auth;
    }

    @Override
    public AccountsResource accounts() {
        return accounts;
    }

    @Override
    public UserResource user() {
        return user;
    }

    @Override
    public ListResource list() {
        return list;
    }

    // --------------------------------------------------------------------- //
    // ACCOUNT
    // --------------------------------------------------------------------- //
    @Override
    public Response<IResponse> i(
            IRequest request) {
        return accounts.i(request);
    }

    @Override
    public Response<IFavoritesResponse[]> iFavorites(
            IFavoritesRequest request) {
        return accounts.iFavorites(request);
    }

    @Override
    public Response<INotificationsResponse[]> iNotifications(
            INotificationsRequest request) {
        return accounts.iNotifications(request);
    }

    // --------------------------------------------------------------------- //
    // AUTH
    // --------------------------------------------------------------------- //
    @Override
    public Response<GenerateAuthSessionResponse> generateAuthSession(
            GenerateAuthSessionRequest request) {
        return auth.generateAuthSession(request);
    }

    @Override
    public Response<UserKeyAuthSessionResponse> userKeyAuthSession(
            UserKeyAuthSessionRequest request) {
        return auth.userKeyAuthSession(request);
    }

    // --------------------------------------------------------------------- //
    // APPLICATION
    // --------------------------------------------------------------------- //
    @Override
    public Response<CreateAppResponse> createApp(
            CreateAppRequest request) {
        return app.createApp(request);
    }

    // --------------------------------------------------------------------- //
    // USER
    // --------------------------------------------------------------------- //
    @Override
    public Response<Void> createFollow(
            CreateFollowRequest request) {
        return user.createFollow(request);
    }

    @Override
    public Response<Void> deleteFollow(
            DeleteFollowRequest request) {
        return user.deleteFollow(request);
    }

    @Override
    public Response<Void> createMute(
            CreateMuteRequest request) {
        return user.createMute(request);
    }

    @Override
    public Response<Void> deleteMute(
            DeleteMuteRequest request) {
        return user.deleteMute(request);
    }

    @Override
    public Response<UsersFollowersResponse[]> usersFollowers(
            UsersFollowersRequest request) {
        return user.usersFollowers(request);
    }

    @Override
    public Response<UsersFollowingsResponse[]> usersFollowings(
            UsersFollowingsRequest request) {
        return user.usersFollowings(request);
    }

    // --------------------------------------------------------------------- //
    // LIST
    // --------------------------------------------------------------------- //
    @Override
    public Response<ListUsersListsResponse[]> listUsersLists(
            ListUsersListsRequest request) {
        return list.listUsersLists(request);
    }

    @Override
    public Response<ShowUsersListsResponse> showUsersLists(
            ShowUsersListsRequest request) {
        return list.showUsersLists(request);
    }
}
