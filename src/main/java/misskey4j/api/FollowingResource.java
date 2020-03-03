package misskey4j.api;

import misskey4j.api.request.following.FollowingCreateRequest;
import misskey4j.api.request.following.FollowingDeleteRequest;
import misskey4j.entity.share.Response;

public interface FollowingResource {

    /**
     * 指定したユーザーをフォローします。
     * https://misskey.io/api-doc#operation/following/create
     */
    Response<Void> create(FollowingCreateRequest request);

    /**
     * 指定したユーザーのフォローを解除します。
     * https://misskey.io/api-doc#operation/following/delete
     */
    Response<Void> delete(FollowingDeleteRequest request);
}
