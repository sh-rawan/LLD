package TagManager.cmd;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import TagManager.receiver.PartialMatchDelete;
import TagManager.receiver.TagInserter;

public class PartialMatchDeleteCommand implements Command {
    private final Pattern regex;
    private final PartialMatchDelete partialMatchDelete;
    private final TagInserter tagInserter;
    private final List<String> deletedTags;

    public PartialMatchDeleteCommand(TagInserter tagInserter, Pattern regex,
            PartialMatchDelete partialMatchDelete) {
        this.regex = regex;
        this.partialMatchDelete = partialMatchDelete;
        this.tagInserter = tagInserter;
        this.deletedTags = new ArrayList<>();
    }

    @Override
    public void execute() {
        this.deletedTags.addAll(this.partialMatchDelete.delete(this.regex));
    }

    @Override
    public void undo() {
        for (String string : deletedTags) {
            tagInserter.Insert(string);
        }
    }
}
