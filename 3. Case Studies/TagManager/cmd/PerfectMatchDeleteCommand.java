package TagManager.cmd;

import TagManager.receiver.PerfectMatchDeleter;

public class PerfectMatchDeleteCommand implements Command {
    private final String name;
    private final PerfectMatchDeleter perfectMatchDelete;

    public PerfectMatchDeleteCommand(String name, PerfectMatchDeleter perfectMatchDelete) {
        this.name = name;
        this.perfectMatchDelete = perfectMatchDelete;
    }

    @Override
    public void execute() {
        this.perfectMatchDelete.delete(this.name);
    }

    @Override
    public void undo() {
    }
}
