package misskey4j;

public enum MisskeyAPI {

    // Notes
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

    PollsVote("notes/polls/vote"),

    ;

    private String code;

    MisskeyAPI(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }
}
