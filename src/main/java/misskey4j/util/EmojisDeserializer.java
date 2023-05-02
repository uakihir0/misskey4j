package misskey4j.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import misskey4j.entity.Emoji;
import misskey4j.entity.Emojis;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Emojis オブジェクトは Misskey のバージョン依存で表現方法が異なる
 * v12~ Emoji の配列
 * v13~ Emojis は null 固定
 * v13.2.4~ Emojis はオブジェクト
 */
public class EmojisDeserializer implements JsonDeserializer<Emojis> {
    @Override
    public Emojis deserialize(JsonElement je, Type typeOfT, JsonDeserializationContext context) {

        if (je.isJsonArray()) {
            Iterator<JsonElement> iterator = je.getAsJsonArray().iterator();

            Emojis emojis = new Emojis();
            List<Emoji> list = new ArrayList<>();

            while (iterator.hasNext()) {
                JsonElement e = iterator.next();
                Emoji emoji = context.deserialize(e, new TypeToken<Emoji>() {
                }.getType());
                list.add(emoji);
            }

            emojis.setList(list);
            return emojis;

        } else if (je.isJsonObject()) {

            // Object の場合は name:url のペアが並ぶ
            Emojis emojis = new Emojis();

            List<Emoji> list = new ArrayList<>();

            for (Map.Entry<String, JsonElement> entry : je.getAsJsonObject().entrySet()) {
                String name = entry.getKey();
                String url = entry.getValue().getAsString();

                Emoji emoji = new Emoji();
                emoji.setName(name);
                emoji.setUrl(url);
                list.add(emoji);
            }

            emojis.setList(list);
            return emojis;

        } else if (je.isJsonNull()) {

            // 許容するが、内容は null
            Emojis emojis = new Emojis();
            emojis.setList(null);
            return emojis;

        } else {
            throw new RuntimeException("Unexpected JSON type: " + je.getClass());
        }
    }
}
