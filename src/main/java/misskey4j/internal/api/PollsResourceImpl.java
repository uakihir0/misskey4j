package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.PollsResource;
import misskey4j.api.request.polls.PollsVoteRequest;
import misskey4j.entity.share.Response;

public class PollsResourceImpl extends AbstractResourceImpl implements PollsResource {

    public PollsResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> pollsVote(
            PollsVoteRequest request) {
        return post(MisskeyAPI.PollsVote.code(), request);
    }
}
