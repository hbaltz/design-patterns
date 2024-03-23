package command.macro_command;

import command.ICommand;

/**
 * A macro command containing a bunch of commands that will be executed at the same time
 */
public class MacroCommand implements ICommand {
    private final ICommand[] commandList;

    public MacroCommand(ICommand[] commandList) {
        this.commandList = commandList;
    }

    @Override
    public void execute() {
        for(ICommand command : commandList) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for(ICommand command : commandList) {
            command.undo();
        }
    }
}
