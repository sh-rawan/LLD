package JSONParse.tokenizer;

import java.util.List;

import JSONParse.data.KeyValuePair;

public interface Tokenizer {
    List<KeyValuePair> tokenize(String text);
}
