package command.remote_controlled_object.garage_door.command;

import command.ICommand;
import command.remote_controlled_object.garage_door.GarageDoor;

public class GarageDoorOpenCommand implements ICommand {
    private final GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
