package JSONParse.tokenizer;

import java.util.List;

import JSONParse.data.KeyValuePair;

public class NaiveTokenizer implements Tokenizer {
    public List<KeyValuePair> tokenize(String text) {
        text = preProcess(text);

        return null;
    }

    private String preProcess(String text) {
        try {
            text = text.trim().substring(1, text.length() - 1).trim();
        } catch (Exception e) {
            throw new RuntimeException("Invalid text");
        }
        return text;
    }
}
