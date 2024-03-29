package command.remote_controlled_object.ceiling_fan.command;

import command.ICommand;
import command.remote_controlled_object.ceiling_fan.CeilingFan;
import command.remote_controlled_object.ceiling_fan.CeilingFanSpeed;

public class CeilingFanOffCommand implements ICommand {
    private final CeilingFan ceilingFan;
    private CeilingFanSpeed previousSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        switch (previousSpeed) {
            case OFF -> ceilingFan.off();
            case LOW -> ceilingFan.low();
            case MEDIUM -> ceilingFan.medium();
            case HIGH -> ceilingFan.high();
        }
    }
}
