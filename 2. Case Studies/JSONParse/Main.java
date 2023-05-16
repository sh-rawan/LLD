package JSONParse;

import JSONParse.data.Json;
import JSONParse.parser.JsonParser;
import JSONParse.parser.NaiveJsonParser;
import JSONParse.tokenizer.NaiveTokenizer;

public class Main {
    public static void main(String[] args) {
        JsonParser parser = new NaiveJsonParser(new NaiveTokenizer());
        String jsonText = "{\"report-card\" : \"{ \"sem-1\" : \"{ \"cgpa\" : \"6.8\" } \" } \" }";
        Json json = parser.parse(jsonText);
        System.out.println(parser.toString(json.get("report-card").get("sem-1").get("cgpa")));
    }
}
