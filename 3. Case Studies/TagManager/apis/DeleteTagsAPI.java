package TagManager.apis;

import java.util.regex.Pattern;

import TagManager.cmd.Command;
import TagManager.cmd.CommandFactory;
import TagManager.data.MatchType;
import TagManager.manager.TagManager;
import TagManager.receiver.PartialMatchDelete;
import TagManager.receiver.PerfectMatchDeleter;
import TagManager.receiver.TagInserter;

public class DeleteTagsAPI {
    TagManager tagManager;

    public void deleteTags(String name, MatchType matchType) {
        Command command = null;
        if (matchType.equals(MatchType.PERFECT)) {
            command = CommandFactory.getPerfectMatchDeleteCmd(name, new PerfectMatchDeleter());
        } else if (matchType.equals(MatchType.PARTIAL)) {
            command = CommandFactory.getPartialMatchDeleteCmd(new TagInserter(), Pattern.compile(name),
                    new PartialMatchDelete());
        } else {
            throw new IllegalArgumentException("Invalid match type");
        }
        tagManager = new TagManager();
        tagManager.changeTags(command);
    }

    public void undoChanges() {
        tagManager.undoChanges();
    }
}
