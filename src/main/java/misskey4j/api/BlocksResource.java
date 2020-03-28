package misskey4j.api;

import misskey4j.api.request.blocks.BlocksCreateRequest;
import misskey4j.api.request.blocks.BlocksDeleteRequest;
import misskey4j.api.request.blocks.BlocksListRequest;
import misskey4j.api.response.blocks.BlocksListResponse;
import misskey4j.entity.share.Response;

public interface BlocksResource {

    /**
     * 指定したユーザーをブロックします。
     * https://misskey.io/api-doc#operation/blocking/create
     */
    Response<Void> create(BlocksCreateRequest request);

    /**
     * 指定したユーザーのブロックを解除します。
     * https://misskey.io/api-doc#operation/blocking/delete
     */
    Response<Void> delete(BlocksDeleteRequest request);

    /**
     * ブロックしているユーザー一覧を取得します。
     * https://misskey.io/api-doc#operation/blocking/list
     */
    Response<BlocksListResponse[]> list(BlocksListRequest request);
}
