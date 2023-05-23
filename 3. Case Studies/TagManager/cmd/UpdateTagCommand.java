package TagManager.cmd;

public class UpdateTagCommand implements Command {
    private final String name;

    UpdateTagCommand(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
