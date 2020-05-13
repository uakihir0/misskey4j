package misskey4j.api;

import misskey4j.api.request.other.ServiceWorkerRegisterRequest;
import misskey4j.api.response.other.ServiceWorkerRegisterResponse;
import misskey4j.entity.share.Response;

public interface OtherResource {

    /**
     * サービスワーカーの通知先を登録します
     * https://misskey.io/api-doc#operation/sw/register
     */
    Response<ServiceWorkerRegisterResponse> serviceWorkerRegister(
            ServiceWorkerRegisterRequest request);
}
