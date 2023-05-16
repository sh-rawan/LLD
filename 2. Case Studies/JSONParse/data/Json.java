package JSONParse.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Json {
    private final Map<String, Json> keyToValues;

    public Json(Map<String, Json> keyToValues) {
        this.keyToValues = keyToValues;
    }

    public Json get(String key) {
        return this.keyToValues.get(key);
    }

    public List<String> getAllKeys() {
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, Json> jsonEntry : keyToValues.entrySet()) {
            keys.add(jsonEntry.getKey());
        }
        return keys;
    }
}
