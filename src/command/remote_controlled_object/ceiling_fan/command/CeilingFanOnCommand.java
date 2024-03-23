package command.remote_controlled_object.ceiling_fan.command;

import command.ICommand;
import command.remote_controlled_object.ceiling_fan.CeilingFan;

public class CeilingFanOnCommand implements ICommand {
    private final CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.low();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
