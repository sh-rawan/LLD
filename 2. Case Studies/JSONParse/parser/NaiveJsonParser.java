package JSONParse.parser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import JSONParse.data.Json;
import JSONParse.data.KeyValuePair;
import JSONParse.tokenizer.Tokenizer;

public class NaiveJsonParser implements JsonParser {

    private final Tokenizer tokenizer;

    public NaiveJsonParser(Tokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    @Override
    public Json parse(String jsonText) {
        if (jsonText == null)
            throw new RuntimeException("Invalid json text");
        if (!jsonText.contains("{")) {
            jsonText = jsonText.trim().replaceAll("\"", "");
            Map<String, Json> keyToValues = new HashMap<>();
            keyToValues.put(jsonText, null);
            return new Json(keyToValues);
        }
        List<KeyValuePair> keyValuePairs = this.tokenizer.tokenize(jsonText);
        Map<String, Json> keyToValues = new HashMap<>();
        for (KeyValuePair keyValuePair : keyValuePairs) {
            keyToValues.put(keyValuePair.getKey(), parse(keyValuePair.getValue()));
        }
        return new Json(keyToValues);
    }

    @Override
    public String toString(Json json) {
        String jsonText = "{";
        List<String> keys = json.getAllKeys();
        for (String key : keys) {
            jsonText += "\"" + key + "\"";
            jsonText += ":" + toString(json.get(key)) + ",";
        }
        if (jsonText.endsWith(",")) {
            jsonText = jsonText.substring(0, jsonText.length() - 1);
        }
        jsonText += "}";
        return jsonText;
    }
}
