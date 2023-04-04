package misskey4j;

import misskey4j.api.AccountsResource;
import misskey4j.api.AppResource;
import misskey4j.api.AuthResource;
import misskey4j.api.BlocksResource;
import misskey4j.api.FavoritesResource;
import misskey4j.api.FilesResource;
import misskey4j.api.FollowingResource;
import misskey4j.api.HashtagsResource;
import misskey4j.api.ListsResource;
import misskey4j.api.MessagesResource;
import misskey4j.api.MetaResource;
import misskey4j.api.MutesResource;
import misskey4j.api.NotesResource;
import misskey4j.api.OtherResource;
import misskey4j.api.PollsResource;
import misskey4j.api.ReactionsResource;
import misskey4j.api.UsersResource;
import misskey4j.stream.MisskeyStream;
import net.socialhub.logger.Logger;

public interface Misskey {

    MetaResource meta();

    AppResource app();

    AuthResource auth();

    AccountsResource accounts();

    UsersResource users();

    ListsResource lists();

    NotesResource notes();

    ReactionsResource reactions();

    FavoritesResource favorites();

    FollowingResource following();

    MutesResource mutes();

    BlocksResource blocks();

    PollsResource polls();

    MessagesResource messages();

    FilesResource files();

    HashtagsResource hashtags();

    OtherResource other();

    Logger.LogLevel logLevel();

    void setLogLevel(String logLevel);

    /**
     * Get host to access.
     * (ex, misskey.io)
     */
    String getHost();

    /**
     * Get authenticate token.
     * (called "i")
     */
    String getAuthToken();

    /**
     * Stream Objects.
     */
    MisskeyStream stream();
}
