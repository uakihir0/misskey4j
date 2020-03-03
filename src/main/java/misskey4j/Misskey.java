package misskey4j;

import misskey4j.api.AccountsResource;
import misskey4j.api.AppResource;
import misskey4j.api.AuthResource;
import misskey4j.api.FollowingResource;
import misskey4j.api.ListsResource;
import misskey4j.api.MuteResource;
import misskey4j.api.NotesResource;
import misskey4j.api.UsersResource;

public interface Misskey {

    AppResource app();

    AuthResource auth();

    AccountsResource accounts();

    UsersResource users();

    ListsResource lists();

    NotesResource notes();

    FollowingResource following();

    MuteResource mute();
}
