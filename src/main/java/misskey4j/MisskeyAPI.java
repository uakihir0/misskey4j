package misskey4j;

public enum MisskeyAPI {

    // ------------------------------------------ //
    // Notes
    // ------------------------------------------ //

    NotesCreate("notes/create"),
    NotesDelete("notes/delete"),

    Notes("notes"),
    NotesShow("notes/show"),
    UsersNotes("users/notes"),
    NotesTimeline("notes/timeline"),
    NotesMentions("notes/mentions"),
    NotesLocalTimeline("notes/local-timeline"),
    NotesHybridTimeline("notes/hybrid-timeline"),
    NotesGlobalTimeline("notes/global-timeline"),
    NotesUserListTimeline("notes/user-list-timeline"),

    NotesConversation("notes/conversation"),
    NotesChildren("notes/children"),

    // ------------------------------------------ //
    // Users
    // ------------------------------------------ //

    UsersFollowers("users/followers"),
    UsersFollowing("users/following"),

    UsersShow("users/show"),
    UsersRelation("users/relation"),
    UsersSearch("users/search"),

    // ------------------------------------------ //
    // I
    // ------------------------------------------ //

    I("i"),
    IFavorites("i/favorites"),
    INotifications("i/notifications"),

    // ------------------------------------------ //
    // Auth
    // ------------------------------------------ //

    AuthSessionGenerate("auth/session/generate"),
    AuthSessionUserkey("auth/session/userkey"),

    // ------------------------------------------ //
    // App
    // ------------------------------------------ //

    AppCreate("app/create"),

    // ------------------------------------------ //
    // Lists
    // ------------------------------------------ //

    Lists("users/lists/list"),
    ListsShow("users/lists/show"),

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
    // Mute
    // ------------------------------------------ //

    MuteList("mute/list"),
    MuteCreate("mute/create"),
    MuteDelete("mute/delete"),

    // ------------------------------------------ //
    // Reactions
    // ------------------------------------------ //

    ReactionsCreate("notes/reactions/create"),
    ReactionsDelete("notes/reactions/delete"),

    ;

    private String code;

    MisskeyAPI(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }
}
