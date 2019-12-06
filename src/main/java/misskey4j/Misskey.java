package misskey4j;

import misskey4j.api.AccountsResource;
import misskey4j.api.AppResource;
import misskey4j.api.AuthResource;
import misskey4j.api.ListResource;
import misskey4j.api.UserResource;

public interface Misskey extends
        AppResource,
        AuthResource,
        AccountsResource,
        UserResource,
        ListResource {

    AppResource app();

    AuthResource auth();

    AccountsResource accounts();

    UserResource user();

    ListResource list();
}
