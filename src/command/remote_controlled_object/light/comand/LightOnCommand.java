package command.remote_controlled_object.light.comand;

import command.ICommand;
import command.remote_controlled_object.light.Light;

/**
 * The command to switch on the light
 */
public class LightOnCommand implements ICommand {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
