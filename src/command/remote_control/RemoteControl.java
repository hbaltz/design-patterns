package command.remote_control;

import command.ICommand;
import command.no_command.NoCommand;

/**
 * Modeled a remote control with 7 couple of on off button
 */
public class RemoteControl {
    private final ICommand[] onCommandList;
    private final ICommand[]  offCommandList;
    private ICommand undoCommand;

    public RemoteControl() {
        onCommandList = new ICommand[7];
        offCommandList = new ICommand[7];

        // We initialize each command with a noCommand command that does nothing
        ICommand noCommand = new NoCommand();
        for (int i = 0 ; i < 7 ; i++){
            onCommandList[i] = noCommand;
            offCommandList[i] = noCommand;
        }

        // Just like the other slots undo starts off with a NOCommand
        undoCommand = noCommand;
    }

    /**
     * @param slotNumber the slot number win each we want to set the on and off command
     * @param onCommand the on command we want to set in the slot number
     * @param offCommand the off command we want to set in the slot number
     */
    public void setCommand(int slotNumber, ICommand onCommand, ICommand offCommand)  {
        // We should also test the range of the slot number and throw an exception if the slot number is not int the range [0,6]
        // To keep the example simple we won't do it here
        onCommandList[slotNumber] = onCommand;
        offCommandList[slotNumber] = offCommand;
    }

    /**
     * @param slotNumber the slot number corresponding to the pressed on button
     */
    public void onButtonWasPushed(int slotNumber) {
        // We should also test the range of the slot number and throw an exception
        // We should create a exception class specific to this case to avoid duplicate code
        // To keep the example simple, we won't do it hera
        onCommandList[slotNumber].execute();
        undoCommand = onCommandList[slotNumber];
    }

    /**
     * @param slotNumber the slot number corresponding to the pressed off button
     */
    public void offButtonWasPushed(int slotNumber) {
        // Same command that on onButtonWasPushed
        offCommandList[slotNumber].execute();
        undoCommand = offCommandList[slotNumber];
    }

    /**
     * Undo the last action
     */
    public void onUndoButtonPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n--------Remote Control--------\n");
        for (int i = 0; i < 7; i++) {
            stringBuilder
                    .append("Slot ").append(i).append(": ")
                    .append("On: ").append(onCommandList[i].getClass().getName())
                    .append(", Off: ").append(offCommandList[i].getClass().getName())
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}
