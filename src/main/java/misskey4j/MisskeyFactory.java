package misskey4j;

import misskey4j.internal.MisskeyImpl;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MisskeyFactory {

    private MisskeyFactory() {
    }

    public static Misskey getInstance(String uri) {
        return new MisskeyImpl(uri, null);
    }

    public static Misskey getInstance(String uri, String clientSecret, String userAccessToken) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] result = digest.digest((userAccessToken + clientSecret).getBytes());
            return new MisskeyImpl(uri, String.format("%040x", new BigInteger(1, result)));

        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
