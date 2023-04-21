package misskey4j;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import org.junit.Before;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class AbstractTest {

    public static Integer INDEX = 0;
    public static String HOST = "https://misskey.io/api/";
    public static String CLIENT_ID;
    public static String CLIENT_SECRET;
    public static String USER_TOKEN;
    public static String OWNED_USER_TOKEN;

    /**
     * Read File
     */
    private String readFile(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder b = new StringBuilder();

            String line;
            String ls = System.getProperty("line.separator");
            while ((line = br.readLine()) != null) {
                b.append(line);
                b.append(ls);
            }

            b.deleteCharAt(b.length() - 1);
            br.close();

            return b.toString();

        } catch (Exception e) {
            return null;
        }
    }

    @Before
    public void before() {
        try {
            // Get account handle and password.
            String json = readFile("secrets.json");
            Secrets secrets = new Gson().fromJson(json, Secrets.class);

            if (secrets.params.size() > 0) {
                SecretParams params = secrets.params.get(INDEX);

                HOST = params.host;
                CLIENT_ID = params.clientId;
                CLIENT_SECRET = params.clientSecret;
                USER_TOKEN = params.userToken;
                OWNED_USER_TOKEN = params.ownedUserToken;
            }

        } catch (Exception e) {
            // e.printStackTrace();
        }
    }


    public static class Secrets {
        public List<SecretParams> params;
    }

    public static class SecretParams {
        public String host;
        @SerializedName("client_id")
        public String clientId;
        @SerializedName("client_secret")
        public String clientSecret;
        @SerializedName("user_token")
        public String userToken;
        @SerializedName("owned_user_token")
        public String ownedUserToken;
    }
}
