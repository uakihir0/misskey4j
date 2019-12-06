package misskey4j.internal;

import misskey4j.api.AppResource;
import misskey4j.api.request.CreateAppRequest;
import misskey4j.api.response.CreateAppResponse;
import misskey4j.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

public class AppResourceImpl extends AbstractResourceImpl implements AppResource {

    AppResourceImpl(String uri) {
        super(uri, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<CreateAppResponse> createApp(
            CreateAppRequest request) {

        return proceed(CreateAppResponse.class, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path("app/create")
                    .json(toJson(request))
                    .request(HttpMediaType.APPLICATION_JSON)
                    .post();
        });
    }
}
