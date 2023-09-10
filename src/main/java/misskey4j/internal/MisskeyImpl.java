package misskey4j.internal;

import java.net.URL;

import misskey4j.Misskey;
import misskey4j.api.AccountsResource;
import misskey4j.api.ApResource;
import misskey4j.api.AppResource;
import misskey4j.api.AuthResource;
import misskey4j.api.BlocksResource;
import misskey4j.api.ChannelsResource;
import misskey4j.api.FavoritesResource;
import misskey4j.api.FederationResource;
import misskey4j.api.FilesResource;
import misskey4j.api.FollowingResource;
import misskey4j.api.GalleriesResource;
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
import misskey4j.api.WebhooksResource;
import misskey4j.internal.api.AccountsResourceImpl;
import misskey4j.internal.api.ApResourceImpl;
import misskey4j.internal.api.AppResourceImpl;
import misskey4j.internal.api.AuthResourceImpl;
import misskey4j.internal.api.BlocksResourceImpl;
import misskey4j.internal.api.ChannelsResourceImpl;
import misskey4j.internal.api.FavoritesResourceImpl;
import misskey4j.internal.api.FederationResourceImpl;
import misskey4j.internal.api.FilesResourceImpl;
import misskey4j.internal.api.FollowingResourceImpl;
import misskey4j.internal.api.GalleriesResourceImpl;
import misskey4j.internal.api.HashtagsResourceImpl;
import misskey4j.internal.api.ListsResourceImpl;
import misskey4j.internal.api.MessagesResourceImpl;
import misskey4j.internal.api.MetaResourceImpl;
import misskey4j.internal.api.MutesResourceImpl;
import misskey4j.internal.api.NotesResourceImpl;
import misskey4j.internal.api.OtherResourceImpl;
import misskey4j.internal.api.PollsResourceImpl;
import misskey4j.internal.api.ReactionsResourceImpl;
import misskey4j.internal.api.UsersResourceImpl;
import misskey4j.internal.api.WebhooksResourceImpl;
import misskey4j.stream.MisskeyStream;

public class MisskeyImpl implements Misskey {

    private final MetaResource meta;
    private final FederationResource federation;
    private final ApResource ap;
    private final AppResource app;
    private final AuthResource auth;
    private final AccountsResource accounts;
    private final UsersResource users;
    private final ListsResource lists;
    private final ChannelsResource channels;
    private final NotesResource notes;
    private final MutesResource mutes;
    private final BlocksResource blocks;
    private final ReactionsResource reactions;
    private final FavoritesResource favorites;
    private final FollowingResource following;
    private final PollsResource polls;
    private final MessagesResource messages;
    private final FilesResource files;
    private final HashtagsResource hashtags;
    private final WebhooksResource webhooks;
    private final GalleriesResource galleries;
    private final OtherResource other;

    private final String url;
    private final String i;

    public MisskeyImpl(String url, String i) {
        this.url = url;
        this.i = i;

        meta = new MetaResourceImpl(url);
        federation = new FederationResourceImpl(url);
        app = new AppResourceImpl(url);
        auth = new AuthResourceImpl(url);

        // Needs AccessToken
        ap = new ApResourceImpl(url, i);
        accounts = new AccountsResourceImpl(url, i);
        users = new UsersResourceImpl(url, i);
        lists = new ListsResourceImpl(url, i);
        channels = new ChannelsResourceImpl(url, i);
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
        webhooks = new WebhooksResourceImpl(url, i);
        galleries = new GalleriesResourceImpl(url, i);
        other = new OtherResourceImpl(url, i);
    }

    @Override
    public MetaResource meta() {
        return meta;
    }

    @Override
    public FederationResource federation() {
        return federation;
    }

    @Override
    public ApResource ap() {
        return ap;
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
    public ChannelsResource channels() {
        return channels;
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

    @Override
    public OtherResource other() {
        return other;
    }

    @Override
    public WebhooksResource webhook() {
        return webhooks;
    }

    @Override
    public GalleriesResource gallery() {
        return galleries;
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
