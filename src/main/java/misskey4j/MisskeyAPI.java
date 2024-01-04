package misskey4j;

public enum MisskeyAPI {

    // ------------------------------------------ //
    // Meta
    // ------------------------------------------ //

    Meta("meta"),
    Emojis("emojis"),

    // ------------------------------------------ //
    // Federation
    // ------------------------------------------ //
    FederationShowInstance("federation/show-instance"),

    // ------------------------------------------ //
    // Notes
    // ------------------------------------------ //

    NotesCreate("notes/create"),
    NotesDelete("notes/delete"),
    NotesUnrenote("notes/unrenote"),
    NotesRenotes("notes/renotes"),

    Notes("notes"),
    NotesShow("notes/show"),
    UsersNotes("users/notes"),
    NotesSearch("notes/search"),
    NotesReactions("notes/reactions"),
    NotesTimeline("notes/timeline"),
    NotesMentions("notes/mentions"),
    NotesFeatured("notes/featured"),
    NotesLocalTimeline("notes/local-timeline"),
    NotesHybridTimeline("notes/hybrid-timeline"),
    NotesGlobalTimeline("notes/global-timeline"),
    NotesUserListTimeline("notes/user-list-timeline"),

    NotesConversation("notes/conversation"),
    NotesChildren("notes/children"),
    NotesReplies("notes/replies"),

    // ------------------------------------------ //
    // Users
    // ------------------------------------------ //

    UsersFollowers("users/followers"),
    UsersFollowing("users/following"),
    UsersRecommendation("users/recommendation"),

    UsersShow("users/show"),
    UsersReactions("users/reactions"),
    UsersRelation("users/relation"),
    UsersSearch("users/search"),
    UsersSearchByUsernameAndHost("users/search-by-username-and-host"),

    // ------------------------------------------ //
    // I
    // ------------------------------------------ //

    I("i"),
    IFavorites("i/favorites"),
    INotifications("i/notifications"),
    IWebhooksUpdate("i/webhooks/update"),

    // ------------------------------------------ //
    // Auth
    // ------------------------------------------ //

    AuthSessionGenerate("auth/session/generate"),
    AuthSessionUserkey("auth/session/userkey"),

    // ------------------------------------------ //
    // Ap
    // ------------------------------------------ //

    ApShow("ap/show"),

    // ------------------------------------------ //
    // App
    // ------------------------------------------ //

    AppCreate("app/create"),

    // ------------------------------------------ //
    // Lists
    // ------------------------------------------ //

    Lists("users/lists/list"),
    ListsShow("users/lists/show"),
    ListsPush("users/lists/push"),
    ListsPull("users/lists/pull"),
    ListsCreate("users/lists/create"),
    ListsUpdate("users/lists/update"),
    ListsDelete("users/lists/delete"),

    // ------------------------------------------ //
    // Channels
    // ------------------------------------------ //

    ChannelsOwned("channels/owned"),
    ChannelsMyFavorites("channels/my-favorites"),
//    ChannelsCreate("channels/create"),
//    ChannelsUnfollow("channels/unfollow"),
//    ChannelsUpdate("channels/update"),
//    ChannelsFavorite("channels/favorite"),
//    ChannelsUnfavorite("channels/unfavorite"),
    ChannelsFollowed("channels/followed"),
//    ChannelsFollow("channels/follow"),
    ChannelsTimeline("channels/timeline"),
    ChannelsShow("channels/show"),
//    ChannelsSearch("channels/search"),
//    ChannelsFeatured("channels/featured"),


    // ------------------------------------------ //
    // Following
    // ------------------------------------------ //

    FollowingCreate("following/create"),
    FollowingDelete("following/delete"),

    // ------------------------------------------ //
    // Polls
    // ------------------------------------------ //

    PollsVote("notes/polls/vote"),

    // ------------------------------------------ //
    // Messages
    // ------------------------------------------ //

    Messages("messaging/messages"),
    MessagesHistory("messaging/history"),
    MessagesCreate("messaging/messages/create"),
    MessagesDelete("messaging/messages/delete"),

    // ------------------------------------------ //
    // Mutes
    // ------------------------------------------ //

    MutesList("mute/list"),
    MutesCreate("mute/create"),
    MutesDelete("mute/delete"),

    // ------------------------------------------ //
    // Blocks
    // ------------------------------------------ //

    BlocksList("blocking/list"),
    BlocksCreate("blocking/create"),
    BlocksDelete("blocking/delete"),

    // ------------------------------------------ //
    // Favorites
    // ------------------------------------------ //

    FavoritesCreate("notes/favorites/create"),
    FavoritesDelete("notes/favorites/delete"),

    // ------------------------------------------ //
    // Reactions
    // ------------------------------------------ //

    ReactionsCreate("notes/reactions/create"),
    ReactionsDelete("notes/reactions/delete"),

    // ------------------------------------------ //
    // Files
    // ------------------------------------------ //

    FilesCreate("drive/files/create"),

    // ------------------------------------------ //
    // Hashtags
    // ------------------------------------------ //

    HashtagsTrend("hashtags/trend"),

    // ------------------------------------------ //
    // Webhooks
    // ------------------------------------------ //

    IWebhooksShow("i/webhooks/show"),
    IWebhooksList("i/webhooks/list"),
    IWebhooksDelete("i/webhooks/delete"),
    IWebhooksCreate("i/webhooks/create"),

    // ------------------------------------------ //
    // Gallery
    // ------------------------------------------ //
    IGalleryPosts("i/gallery/posts"),
    GalleryPosts("gallery/posts"),
    UserGalleryPosts("users/gallery/posts"),
    ShowGalleryPost("gallery/posts/show"),
    CreateGalleryPost("gallery/posts/create"),
    DeleteGalleryPost("gallery/posts/delete"),
    UpdateGalleryPost("gallery/posts/update"),
    LikeGalleryPost("gallery/posts/like"),
    UnlikeGalleryPost("gallery/posts/unlike"),

    // ------------------------------------------ //
    // Other
    // ------------------------------------------ //

    ServiceWorkerRegister("sw/register"),
    ;

    private final String code;

    MisskeyAPI(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }
}
