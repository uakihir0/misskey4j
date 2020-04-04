package misskey4j.api.request.meta;

public class MetaRequest {

    public static MetaRequestBuilder builder() {
        return new MetaRequestBuilder();
    }

    private Boolean detail;

    // region
    public Boolean getDetail() {
        return detail;
    }

    public static final class MetaRequestBuilder {
        private Boolean detail;

        private MetaRequestBuilder() {
        }

        public MetaRequestBuilder detail(Boolean detail) {
            this.detail = detail;
            return this;
        }

        public MetaRequest build() {
            MetaRequest metaRequest = new MetaRequest();
            metaRequest.detail = this.detail;
            return metaRequest;
        }
    }
    // endregion
}
