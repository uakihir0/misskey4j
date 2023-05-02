package misskey4j.api.request;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import misskey4j.entity.contant.Scope;

public class CreateAppRequest {

    public static CreateAppRequestBuilder builder() {
        return new CreateAppRequestBuilder();
    }

    private String name;
    private String description;
    private List<String> permission;
    private String callbackUrl;

    // region
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getPermission() {
        return permission;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public static final class CreateAppRequestBuilder {
        private String name;
        private String description;
        private List<String> permission;
        private String callbackUrl;

        private CreateAppRequestBuilder() {
        }

        public CreateAppRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CreateAppRequestBuilder description(String description) {
            this.description = description;
            return this;
        }

        public CreateAppRequestBuilder permission(List<String> permission) {
            this.permission = permission;
            return this;
        }

        public CreateAppRequestBuilder permission(Scope[] permission) {
            this.permission = Stream.of(permission)
                    .map(Scope::code)
                    .collect(Collectors.toList());
            return this;
        }

        public CreateAppRequestBuilder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        public CreateAppRequest build() {
            CreateAppRequest createAppRequest = new CreateAppRequest();
            createAppRequest.permission = this.permission;
            createAppRequest.callbackUrl = this.callbackUrl;
            createAppRequest.name = this.name;
            createAppRequest.description = this.description;
            return createAppRequest;
        }
    }
    // endregion
}
