package misskey4j.internal.api;

import org.jetbrains.annotations.NotNull;

import misskey4j.MisskeyAPI;
import misskey4j.api.ListsResource;
import misskey4j.api.request.UsersListsCreateRequest;
import misskey4j.api.request.UsersListsListRequest;
import misskey4j.api.request.UsersListsPullRequest;
import misskey4j.api.request.UsersListsPushRequest;
import misskey4j.api.request.UsersListsShowRequest;
import misskey4j.api.request.UsersListsUpdateRequest;
import misskey4j.api.response.UsersListsListResponse;
import misskey4j.api.response.UsersListsShowResponse;
import misskey4j.entity.List;
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
                MisskeyAPI.Lists.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UsersListsShowResponse> show(
            UsersListsShowRequest request) {
        return post(UsersListsShowResponse.class,
                MisskeyAPI.ListsShow.code(), request);
    }

    @Override
    public void push(@NotNull String listId, @NotNull String userId) {

        UsersListsPushRequest request = UsersListsPushRequest.builder()
                        .userId(userId)
                        .listId(listId)
                        .build();
        post(MisskeyAPI.ListsPush.code(), request);
    }

    @Override
    public void pull(@NotNull String listId, @NotNull String userId) {

        UsersListsPullRequest request = UsersListsPullRequest.builder()
                        .userId(userId)
                        .listId(listId)
                        .build();
        post(MisskeyAPI.ListsPull.code(), request);
    }

    @Override
    public Response<List> create(@NotNull String name) {

        UsersListsCreateRequest request = new UsersListsCreateRequest(name);
        return post(List.class, MisskeyAPI.ListsCreate.code(), request);
    }

    @Override
    public Response<List> update(@NotNull String listId, @NotNull String name) {

        UsersListsUpdateRequest request = new UsersListsUpdateRequest(listId, name);
        return post(List.class, MisskeyAPI.ListsUpdate.code(), request);
    }
}
