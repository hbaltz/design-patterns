package command.remote_controlled_object.garage_door.command;

import command.ICommand;
import command.remote_controlled_object.garage_door.GarageDoor;

public class GarageDoorCloseCommand implements ICommand {
    private final GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
