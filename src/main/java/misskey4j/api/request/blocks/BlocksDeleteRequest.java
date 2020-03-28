package misskey4j.api.request.blocks;

import misskey4j.api.model.TokenRequest;

public class BlocksDeleteRequest extends TokenRequest {

    public static BlocksDeleteRequestBuilder builder() {
        return new BlocksDeleteRequestBuilder();
    }

    private String userId;

    // region
    public String getUserId() {
        return userId;
    }

    public static final class BlocksDeleteRequestBuilder {
        private String userId;

        private BlocksDeleteRequestBuilder() {
        }


        public BlocksDeleteRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public BlocksDeleteRequest build() {
            BlocksDeleteRequest blocksDeleteRequest = new BlocksDeleteRequest();
            blocksDeleteRequest.userId = this.userId;
            return blocksDeleteRequest;
        }
    }
    // endregion
}
