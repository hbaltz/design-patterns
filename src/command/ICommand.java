package command;

/**
 * Modeled a command used by our remote controller
 */
public interface ICommand {
    /**
     * Tha action that will be executed by the command
     */
    public void execute();

    /**
     * Tha action that will be executed to undo the action in execute
     */
    public void undo();
}
