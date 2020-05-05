package misskey4j.stream.callback;

import misskey4j.entity.User;

public interface FollowedCallback extends EventCallback {
    void onFollowed(User user);
}
