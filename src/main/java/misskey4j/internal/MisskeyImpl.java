package misskey4j.internal;

import misskey4j.Misskey;
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
import misskey4j.api.PollsResource;
import misskey4j.api.ReactionsResource;
import misskey4j.api.UsersResource;
import misskey4j.internal.api.AccountsResourceImpl;
import misskey4j.internal.api.AppResourceImpl;
import misskey4j.internal.api.AuthResourceImpl;
import misskey4j.internal.api.BlocksResourceImpl;
import misskey4j.internal.api.FavoritesResourceImpl;
import misskey4j.internal.api.FilesResourceImpl;
import misskey4j.internal.api.FollowingResourceImpl;
import misskey4j.internal.api.HashtagsResourceImpl;
import misskey4j.internal.api.ListsResourceImpl;
import misskey4j.internal.api.MessagesResourceImpl;
import misskey4j.internal.api.MetaResourceImpl;
import misskey4j.internal.api.MutesResourceImpl;
import misskey4j.internal.api.NotesResourceImpl;
import misskey4j.internal.api.PollsResourceImpl;
import misskey4j.internal.api.ReactionsResourceImpl;
import misskey4j.internal.api.UsersResourceImpl;
import misskey4j.stream.MisskeyStream;

import java.net.URL;

public class MisskeyImpl implements Misskey {

    private MetaResource meta;
    private AppResource app;
    private AuthResource auth;
    private AccountsResource accounts;
    private UsersResource users;
    private ListsResource lists;
    private NotesResource notes;
    private MutesResource mutes;
    private BlocksResource blocks;
    private ReactionsResource reactions;
    private FavoritesResource favorites;
    private FollowingResource following;
    private PollsResource polls;
    private MessagesResource messages;
    private FilesResource files;
    private HashtagsResource hashtags;

    private String url;
    private String i;

    public MisskeyImpl(String url, String i) {
        this.url = url;
        this.i = i;

        meta = new MetaResourceImpl(url);
        app = new AppResourceImpl(url);
        auth = new AuthResourceImpl(url);

        // Needs AccessToken
        accounts = new AccountsResourceImpl(url, i);
        users = new UsersResourceImpl(url, i);
        lists = new ListsResourceImpl(url, i);
        notes = new NotesResourceImpl(url, i);

        reactions = new ReactionsResourceImpl(url, i);
        favorites = new FavoritesResourceImpl(url, i);
        following = new FollowingResourceImpl(url, i);
        mutes = new MutesResourceImpl(url, i);
        blocks = new BlocksResourceImpl(url, i);
        polls = new PollsResourceImpl(url, i);
        messages = new MessagesResourceImpl(url, i);
        files = new FilesResourceImpl(url, i);
        hashtags = new HashtagsResourceImpl(url, i);
    }

    @Override
    public MetaResource meta() {
        return meta;
    }

    @Override
    public AppResource app() {
        return app;
    }

    @Override
    public AuthResource auth() {
        return auth;
    }

    @Override
    public AccountsResource accounts() {
        return accounts;
    }

    @Override
    public UsersResource users() {
        return users;
    }

    @Override
    public ListsResource lists() {
        return lists;
    }

    @Override
    public NotesResource notes() {
        return notes;
    }

    @Override
    public ReactionsResource reactions() {
        return reactions;
    }

    @Override
    public FavoritesResource favorites() {
        return favorites;
    }

    @Override
    public FollowingResource following() {
        return following;
    }

    @Override
    public MutesResource mutes() {
        return mutes;
    }

    @Override
    public BlocksResource blocks() {
        return blocks;
    }

    @Override
    public PollsResource polls() {
        return polls;
    }

    @Override
    public MessagesResource messages() {
        return messages;
    }

    @Override
    public FilesResource files() {
        return files;
    }

    @Override
    public HashtagsResource hashtags() {
        return hashtags;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getHost() {
        try {
            return new URL(url).getHost();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAuthToken() {
        return i;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MisskeyStream stream() {
        return new MisskeyStream(this);
    }
}
