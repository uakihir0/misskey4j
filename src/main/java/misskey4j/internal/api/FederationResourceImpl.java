package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.FederationResource;
import misskey4j.api.request.federation.ShowInstanceRequest;
import misskey4j.api.response.federation.FederationInstanceResponse;
import misskey4j.entity.share.Response;

public class FederationResourceImpl extends AbstractResourceImpl implements FederationResource {

    public FederationResourceImpl(String uri) {
        super(uri, null);
    }

    @Override
    public Response<FederationInstanceResponse> showInstance(ShowInstanceRequest request) {
        return post(FederationInstanceResponse.class, MisskeyAPI.FederationShowInstance.code(), request);
    }
}
