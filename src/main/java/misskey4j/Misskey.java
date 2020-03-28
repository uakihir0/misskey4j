package misskey4j;

import misskey4j.api.AccountsResource;
import misskey4j.api.AppResource;
import misskey4j.api.AuthResource;
import misskey4j.api.BlocksResource;
import misskey4j.api.FollowingResource;
import misskey4j.api.ListsResource;
import misskey4j.api.MessagesResource;
import misskey4j.api.MutesResource;
import misskey4j.api.NotesResource;
import misskey4j.api.PollsResource;
import misskey4j.api.ReactionsResource;
import misskey4j.api.UsersResource;

public interface Misskey {

    AppResource app();

    AuthResource auth();

    AccountsResource accounts();

    UsersResource users();

    ListsResource lists();

    NotesResource notes();

    ReactionsResource reactions();

    FollowingResource following();

    MutesResource mutes();

    BlocksResource blocks();

    PollsResource polls();

    MessagesResource messages();

    /**
     * Get host to access.
     * (ex, misskey.io)
     */
    String getHost();
}
