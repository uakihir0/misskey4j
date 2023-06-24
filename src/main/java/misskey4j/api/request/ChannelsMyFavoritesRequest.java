package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class ChannelsMyFavoritesRequest extends TokenRequest {

    public static ChannelsMyFavoritesBuilder builder() {
        return new ChannelsMyFavoritesBuilder();
    }

    // region
    public static final class ChannelsMyFavoritesBuilder {

        private ChannelsMyFavoritesBuilder() {
        }

        public ChannelsMyFavoritesRequest build() {
            return new ChannelsMyFavoritesRequest();
        }
    }
    // endregion
}
