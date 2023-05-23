package TagManager.manager;

import java.util.List;
import java.util.Stack;

import TagManager.cmd.Command;

// Bad design

// public class TagManager {
//     public void insertTag(String tag) {
//     }

//     public void deleteTag(String name) {
//     }

//     public void deleteBasedOnRegex(String regex) {
//     }

//     public void updateTag(String oldTag, String newTag) {
//     }

//     public List<String> getTags() {
//         return null;
//     }
// }

public class TagManager {
    private final Stack<Command> command;

    public TagManager() {
        this.command = new Stack<>();
    }

    public void changeTags(Command command) {
        command.execute();
        this.command.push(command);
    }

    public void undoChanges() {
        this.command.peek().undo();
        this.command.pop();
    }
}