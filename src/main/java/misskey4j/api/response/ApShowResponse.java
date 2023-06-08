package misskey4j.api.response;

import com.google.gson.JsonElement;

import misskey4j.entity.Note;
import misskey4j.entity.User;

public class ApShowResponse {

    public String type;

    public JsonElement object;

    public Note note;

    public User user;
}
