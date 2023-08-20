package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.ApResource;
import misskey4j.api.request.ApShowRequest;
import misskey4j.api.response.ApShowResponse;
import misskey4j.entity.Note;
import misskey4j.entity.User;
import misskey4j.entity.share.Response;

public class ApResourceImpl extends AbstractResourceImpl implements ApResource {

    public ApResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ApShowResponse> show(ApShowRequest request) {

        // user または note に対応するためここでリクエストしてパースする
        final Response<ApShowResponse> response = post(ApShowResponse.class, MisskeyAPI.ApShow.code(), request);

        final ApShowResponse apShowResponse = response.get();
        if ("Note".equals(apShowResponse.type)) {
            // object -> Note
            apShowResponse.note = getGsonInstance().fromJson(apShowResponse.object, Note.class);
        } else if ("User".equals(apShowResponse.type)) {
            // object -> User
            apShowResponse.user = getGsonInstance().fromJson(apShowResponse.object, User.class);
        }

        return response;
    }
}
