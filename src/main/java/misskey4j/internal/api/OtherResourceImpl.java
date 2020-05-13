package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.OtherResource;
import misskey4j.api.request.other.ServiceWorkerRegisterRequest;
import misskey4j.api.response.other.ServiceWorkerRegisterResponse;
import misskey4j.entity.share.Response;

public class OtherResourceImpl extends AbstractResourceImpl implements OtherResource {

    public OtherResourceImpl(String uri, String i) {
        super(uri, i);
    }

    @Override
    public Response<ServiceWorkerRegisterResponse> serviceWorkerRegister(
            ServiceWorkerRegisterRequest request) {
        return post(ServiceWorkerRegisterResponse.class,
                MisskeyAPI.ServiceWorkerRegister.code(), request);
    }
}
