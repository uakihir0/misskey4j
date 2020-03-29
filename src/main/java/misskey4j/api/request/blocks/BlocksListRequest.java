package misskey4j.api.request.blocks;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

public class BlocksListRequest extends TokenRequest {

    public static BlocksListRequestBuilder builder() {
        return new BlocksListRequestBuilder();
    }

    private Long limit;
    private String sinceId;
    private String untilId;

    // region
    public Long getLimit() {
        return limit;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public static final class BlocksListRequestBuilder
            implements PagingBuilder<BlocksListRequestBuilder> {

        private Long limit;
        private String sinceId;
        private String untilId;

        private BlocksListRequestBuilder() {
        }


        public BlocksListRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public BlocksListRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public BlocksListRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public BlocksListRequest build() {
            BlocksListRequest blocksListRequest = new BlocksListRequest();
            blocksListRequest.sinceId = this.sinceId;
            blocksListRequest.limit = this.limit;
            blocksListRequest.untilId = this.untilId;
            return blocksListRequest;
        }
    }
    // endregion
}
