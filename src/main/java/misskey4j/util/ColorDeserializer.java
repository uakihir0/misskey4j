package misskey4j.util;


import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import misskey4j.entity.Color;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Color オブジェクトは Misskey のバージョン依存で表現方法が異なる
 * v11: [255, 255, 255] : 数値の配列
 * v12: rgb(255,255,255) :文字列
 */
public class ColorDeserializer implements JsonDeserializer<Color> {

    @Override
    public Color deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) {

        if (je.isJsonArray()) {
            Iterator<JsonElement> iterator = je.getAsJsonArray().iterator();

            Color color = new Color();
            if (iterator.hasNext()) {
                color.setR(iterator.next().getAsInt());
            }
            if (iterator.hasNext()) {
                color.setG(iterator.next().getAsInt());
            }
            if (iterator.hasNext()) {
                color.setB(iterator.next().getAsInt());
            }
            return color;

        } else if (je.isJsonPrimitive()) {
            if (je.getAsJsonPrimitive().isString()) {

                Pattern p = Pattern.compile("rgb\\(([0-9]+),([0-9]+),([0-9]+)\\)");
                Matcher m = p.matcher(je.getAsString());
                Color color = new Color();

                if (m.find()) {
                    color.setR(Integer.parseInt(m.group(1)));
                    color.setG(Integer.parseInt(m.group(2)));
                    color.setB(Integer.parseInt(m.group(3)));
                    return color;
                }
            }

            return null;

        } else if (je.isJsonNull()) {

            // Null は許容
            return null;

        } else {
            throw new RuntimeException("Unexpected JSON type: " + je.getClass());
        }
    }
}