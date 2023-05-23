package TagManager.cmd;

import java.util.regex.Pattern;

import TagManager.receiver.PartialMatchDelete;
import TagManager.receiver.PerfectMatchDeleter;
import TagManager.receiver.TagInserter;

public class CommandFactory {
    private CommandFactory() {
    }

    public static Command getPartialMatchDeleteCmd(TagInserter tagInserter, Pattern pattern,
            PartialMatchDelete partialMatchDelete) {
        return new PartialMatchDeleteCommand(tagInserter, pattern, partialMatchDelete);
    }

    public static Command getPerfectMatchDeleteCmd(String name, PerfectMatchDeleter perfectMatchDelete) {
        return new PerfectMatchDeleteCommand(name, perfectMatchDelete);
    }
}
