package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.HashtagsResource;
import misskey4j.api.request.hashtags.HashtagsTrendRequest;
import misskey4j.api.response.hashtags.HashtagsTrendResponse;
import misskey4j.entity.share.Response;

public class HashtagsResourceImpl extends AbstractResourceImpl implements HashtagsResource {

    public HashtagsResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<HashtagsTrendResponse[]> trend(
            HashtagsTrendRequest request) {
        return post(HashtagsTrendResponse[].class,
                MisskeyAPI.HashtagsTrend.code(), request);
    }
}
