package misskey4j.api;

import misskey4j.api.request.polls.PollsVoteRequest;
import misskey4j.entity.share.Response;

public interface PollsResource {

    /**
     * 指定した投稿のアンケートに投票します。
     * (注釈：複数回答が可能な投票については回答毎にこの API をコールする)
     * https://misskey.io/api-doc#operation/notes/polls/vote
     */
    Response<Void> pollsVote(
            PollsVoteRequest request);

}
