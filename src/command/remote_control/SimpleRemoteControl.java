package command.remote_control;

import command.ICommand;

/**
 * Modeled a remote control with only on button
 */
public class SimpleRemoteControl {
    private ICommand slot;

    public SimpleRemoteControl() {}

    public void setCommand(ICommand command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
