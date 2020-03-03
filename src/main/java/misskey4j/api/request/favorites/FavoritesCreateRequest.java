package misskey4j.api.request.favorites;

import misskey4j.api.model.TokenRequest;

public class FavoritesCreateRequest extends TokenRequest {

    public static FavoritesCreateRequestBuilder builder() {
        return new FavoritesCreateRequestBuilder();
    }

    private String noteId;

    // region
    public String getNoteId() {
        return noteId;
    }

    public static final class FavoritesCreateRequestBuilder {
        private String noteId;

        private FavoritesCreateRequestBuilder() {
        }

        public FavoritesCreateRequestBuilder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public FavoritesCreateRequest build() {
            FavoritesCreateRequest favoritesCreateRequest = new FavoritesCreateRequest();
            favoritesCreateRequest.noteId = this.noteId;
            return favoritesCreateRequest;
        }
    }
    // endregion
}
