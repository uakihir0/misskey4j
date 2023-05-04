package misskey4j.api;

import misskey4j.api.request.federation.ShowInstanceRequest;
import misskey4j.api.response.federation.FederationInstanceResponse;
import misskey4j.entity.share.Response;

/**
 * Federation APIs.
 */
public interface FederationResource {

    Response<FederationInstanceResponse> showInstance(ShowInstanceRequest request);
}
