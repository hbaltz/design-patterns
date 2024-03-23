package command.remote_controlled_object.light.comand;

import command.ICommand;
import command.remote_controlled_object.light.Light;

public class LightOffCommand implements ICommand {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
