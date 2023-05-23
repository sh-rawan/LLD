package TagManager.receiver;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import TagManager.data.Store;

public class PartialMatchDelete {
    public List<String> delete(Pattern pattern) {
        List<String> tags = new ArrayList<>();
        List<String> returnTags = new ArrayList<>();
        Store.getTags().forEach(tag -> tags.add(tag));
        for (String tag : tags) {
            if (pattern.matcher(tag).matches()) {
                Store.delete(tag);
                returnTags.add(tag);
            }
        }
        return returnTags;
    }
}
