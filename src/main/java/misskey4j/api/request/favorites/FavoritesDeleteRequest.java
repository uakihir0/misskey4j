package misskey4j.api.request.favorites;

import misskey4j.api.model.TokenRequest;

public class FavoritesDeleteRequest extends TokenRequest {

    public static FavoritesDeleteRequestBuilder builder() {
        return new FavoritesDeleteRequestBuilder();
    }

    // region
    private String noteId;

    public String getNoteId() {
        return noteId;
    }

    public static final class FavoritesDeleteRequestBuilder {
        private String noteId;

        private FavoritesDeleteRequestBuilder() {
        }

        public FavoritesDeleteRequestBuilder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public FavoritesDeleteRequest build() {
            FavoritesDeleteRequest favoritesDeleteRequest = new FavoritesDeleteRequest();
            favoritesDeleteRequest.noteId = this.noteId;
            return favoritesDeleteRequest;
        }
    }
    // endregion
}
