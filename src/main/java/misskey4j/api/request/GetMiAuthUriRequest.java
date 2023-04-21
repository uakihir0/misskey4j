package misskey4j.api.request;

import misskey4j.entity.contant.Scope;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetMiAuthUriRequest {

    private String sessionId;
    private String name;
    private String iconUri;
    private String callbackUrl;
    private List<String> permission;

    // region
    public static GetMiAuthUriRequestBuilder builder() {
        return new GetMiAuthUriRequestBuilder();
    }

    public String getSessionId() {
        if (sessionId == null) {
            return UUID.randomUUID().toString();
        }
        return sessionId;
    }

    public String getName() {
        return name;
    }

    public String getIconUri() {
        return iconUri;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public List<String> getPermission() {
        return permission;
    }

    public static final class GetMiAuthUriRequestBuilder {
        private String sessionId;
        private String name;
        private String iconUri;
        private String callbackUrl;
        private List<String> permission;

        private GetMiAuthUriRequestBuilder() {
        }

        public GetMiAuthUriRequestBuilder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public GetMiAuthUriRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public GetMiAuthUriRequestBuilder iconUri(String iconUri) {
            this.iconUri = iconUri;
            return this;
        }


        public GetMiAuthUriRequestBuilder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        public GetMiAuthUriRequestBuilder permission(Scope[] permission) {
            this.permission = Stream.of(permission)
                    .map(Scope::code)
                    .collect(Collectors.toList());
            return this;
        }

        public GetMiAuthUriRequest build() {
            GetMiAuthUriRequest getMiAuthUriRequest = new GetMiAuthUriRequest();
            getMiAuthUriRequest.sessionId = this.sessionId;
            getMiAuthUriRequest.iconUri = this.iconUri;
            getMiAuthUriRequest.callbackUrl = this.callbackUrl;
            getMiAuthUriRequest.permission = this.permission;
            getMiAuthUriRequest.name = this.name;
            return getMiAuthUriRequest;
        }
    }
    // endregion
}
