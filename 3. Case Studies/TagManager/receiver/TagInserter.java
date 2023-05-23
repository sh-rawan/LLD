package TagManager.receiver;

import java.util.List;

import TagManager.data.Store;

public class TagInserter {
    public void Insert(String name) {
        Store.insert(name);
    }
}
