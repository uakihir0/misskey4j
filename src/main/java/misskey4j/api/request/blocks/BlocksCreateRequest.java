package misskey4j.api.request.blocks;

import misskey4j.api.model.TokenRequest;

public class BlocksCreateRequest extends TokenRequest {

    public static BlocksCreateRequestBuilder builder() {
        return new BlocksCreateRequestBuilder();
    }

    private String userId;

    // region
    public String getUserId() {
        return userId;
    }

    public static final class BlocksCreateRequestBuilder {
        private String userId;

        private BlocksCreateRequestBuilder() {
        }

        public BlocksCreateRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public BlocksCreateRequest build() {
            BlocksCreateRequest blocksCreateRequest = new BlocksCreateRequest();
            blocksCreateRequest.userId = this.userId;
            return blocksCreateRequest;
        }
    }
    // endregion
}
