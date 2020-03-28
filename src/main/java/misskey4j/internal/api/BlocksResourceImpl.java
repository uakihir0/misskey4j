package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.BlocksResource;
import misskey4j.api.request.blocks.BlocksCreateRequest;
import misskey4j.api.request.blocks.BlocksDeleteRequest;
import misskey4j.api.request.blocks.BlocksListRequest;
import misskey4j.api.response.blocks.BlocksListResponse;
import misskey4j.entity.share.Response;

public class BlocksResourceImpl extends AbstractResourceImpl implements BlocksResource {

    public BlocksResourceImpl(String uri, String i) {
        super(uri, i);
    }

    @Override
    public Response<Void> create(
            BlocksCreateRequest request) {
        return post(MisskeyAPI.BlocksCreate.code(), request);
    }

    @Override
    public Response<Void> delete(
            BlocksDeleteRequest request) {
        return post(MisskeyAPI.BlocksDelete.code(), request);
    }

    @Override
    public Response<BlocksListResponse[]> list(
            BlocksListRequest request) {
        return post(BlocksListResponse[].class,
                MisskeyAPI.BlocksList.code(), request);
    }
}
