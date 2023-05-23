package TagManager;

import TagManager.apis.DeleteTagsAPI;
import TagManager.data.MatchType;

public class Main {
    public static void main(String[] args) {
        DeleteTagsAPI deleteTagsAPI = new DeleteTagsAPI();
        deleteTagsAPI.deleteTags("math.*", MatchType.PARTIAL);
        deleteTagsAPI.undoChanges();
    }
}
