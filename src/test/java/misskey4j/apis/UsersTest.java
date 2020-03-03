package misskey4j.apis;

import misskey4j.AbstractTest;
import misskey4j.Misskey;
import misskey4j.MisskeyFactory;
import misskey4j.api.request.i.IRequest;
import misskey4j.api.request.users.UsersFollowingsRequest;
import misskey4j.api.request.users.UsersRelationRequest;
import misskey4j.api.request.users.UsersSearchRequest;
import misskey4j.api.response.i.IResponse;
import misskey4j.api.response.users.UsersFollowingsResponse;
import misskey4j.api.response.users.UsersRelationResponse;
import misskey4j.api.response.users.UsersSearchResponse;
import misskey4j.entity.share.Response;
import org.junit.Test;

import java.util.Arrays;

public class UsersTest extends AbstractTest {

    @Test
    public void testUsersFollowings() {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);
        Response<IResponse> i = misskey.accounts().i(IRequest.builder().build());

        Response<UsersFollowingsResponse[]> followings =
                misskey.users().followings(UsersFollowingsRequest.builder()
                        .userId(i.get().getId())
                        .build());

        for (UsersFollowingsResponse following : followings.get()) {
            System.out.println(following.getFollowee().getId() + " : " + following.getFollowee().getName());
        }
    }

    @Test
    public void testUsersRelation() {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);

        Response<UsersRelationResponse[]> relations =
                misskey.users().relation(UsersRelationRequest.builder()
                        .userId(Arrays.asList("7rkrarq81i", "7rkrg1wo1a"))
                        .build());

        for (UsersRelationResponse relation : relations.get()) {
            System.out.println(relation.getId() + " : " + relation.getFollowing());
        }
    }

    @Test
    public void testUsersSearch() {
        Misskey misskey = MisskeyFactory.getInstance(HOST, CLIENT_SECRET, USER_TOKEN);
        Response<IResponse> i = misskey.accounts().i(IRequest.builder().build());

        Response<UsersSearchResponse[]> users =
                misskey.users().search(UsersSearchRequest.builder()
                        .query("Cat")
                        .build());

        for (UsersSearchResponse user : users.get()) {
            System.out.println(user.getUsername());
        }
    }
}
