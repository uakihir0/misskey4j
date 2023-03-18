package misskey4j;

import misskey4j.internal.MisskeyImpl;
import misskey4j.search.SearchInstances;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MisskeyFactory {

    private MisskeyFactory() {
    }

    public static Misskey getInstance(String uri) {
        return new MisskeyImpl(absorbUrlExpression(uri), null);
    }

    /**
     * Used for user access by specifying the application.
     * アプリケーションを発行して、第三者の AccessToken を使用する場合に用います。
     */
    public static Misskey getInstance(String uri, String clientSecret, String userAccessToken) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] result = digest.digest((userAccessToken + clientSecret).getBytes());

            return new MisskeyImpl(
                    absorbUrlExpression(uri),
                    String.format("%040x", new BigInteger(1, result)));

        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Create an instance using the AccessToken obtained from the Web UI.
     * Web UI で発行した自身の AccessToken を使用する場合に用います。
     */
    public static Misskey getInstanceByAccessTokenFromWeb(String uri, String ownedAccessToken) {
        return new MisskeyImpl(absorbUrlExpression(uri), ownedAccessToken);
    }

    public static SearchInstances getSearchInstances() {
        return new SearchInstances("https://instanceapp.misskey.page/instances.json");
    }

    private static String absorbUrlExpression(String url) {
        String result = url;

        // ホスト名だけで指定してきた場合
        if (!result.startsWith("https://")) {
            result = "https://" + result;
        }

        // API ディレクトリが抜けていた場合
        if (!result.endsWith("/api/")) {
            result = result + "/api/";
        }
        if (!result.endsWith("api/")) {
            result = result + "api/";
        }
        return result;
    }
}
