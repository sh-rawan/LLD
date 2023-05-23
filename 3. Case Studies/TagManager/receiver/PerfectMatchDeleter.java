package TagManager.receiver;

import java.util.ArrayList;
import java.util.List;

import TagManager.data.Store;

public class PerfectMatchDeleter {
    public void delete(String name) {
        List<String> tags = new ArrayList<>();
        Store.getTags().forEach(tag -> tags.add(tag));
        for (String string : tags) {
            if (name.equals(string)) {
                Store.delete(name);
            }
        }
    }
}
