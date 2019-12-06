package misskey4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class MisskeyUtil {

    public static Date toDate(String date) {
        try {
            SimpleDateFormat format = new SimpleDateFormat();
            return format.parse(date);

        } catch (ParseException pe) {
            throw new IllegalStateException(pe);
        }
    }
}
