package misskey4j.api.request.other;

import misskey4j.api.model.TokenRequest;

public class ServiceWorkerRegisterRequest extends TokenRequest {

    public static ServiceWorkerRegisterRequestBuilder builder() {
        return new ServiceWorkerRegisterRequestBuilder();
    }

    private String endpoint;
    private String auth;
    private String publickey;

    // region
    public String getEndpoint() {
        return endpoint;
    }

    public String getAuth() {
        return auth;
    }

    public String getPublickey() {
        return publickey;
    }

    public static final class ServiceWorkerRegisterRequestBuilder {
        private String endpoint;
        private String auth;
        private String publickey;

        private ServiceWorkerRegisterRequestBuilder() {
        }


        public ServiceWorkerRegisterRequestBuilder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public ServiceWorkerRegisterRequestBuilder auth(String auth) {
            this.auth = auth;
            return this;
        }

        public ServiceWorkerRegisterRequestBuilder publickey(String publickey) {
            this.publickey = publickey;
            return this;
        }

        public ServiceWorkerRegisterRequest build() {
            ServiceWorkerRegisterRequest serviceWorkerRegisterRequest = new ServiceWorkerRegisterRequest();
            serviceWorkerRegisterRequest.publickey = this.publickey;
            serviceWorkerRegisterRequest.endpoint = this.endpoint;
            serviceWorkerRegisterRequest.auth = this.auth;
            return serviceWorkerRegisterRequest;
        }
    }
    //endregion
}
