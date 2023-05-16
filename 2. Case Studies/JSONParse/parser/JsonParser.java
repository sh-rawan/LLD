package JSONParse.parser;

import JSONParse.data.Json;

public interface JsonParser {
    Json parse(String jsonText);

    String toString(Json json);
}
