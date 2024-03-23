package command.no_command;

import command.ICommand;

public class NoCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("I'm no command, I do nothing!");
    }

    @Override
    public void undo() {
        System.out.println("I'm no command, I do nothing!");
    }
}
