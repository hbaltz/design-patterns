package command.remote_controlled_object.ceiling_fan.command;

import command.ICommand;
import command.remote_controlled_object.ceiling_fan.CeilingFan;

public class CeilingFanOffCommand implements ICommand {
    private final CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        // FIXME: we should use previous value here
        ceilingFan.low();
    }
}
