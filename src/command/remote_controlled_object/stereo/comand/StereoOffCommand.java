package command.remote_controlled_object.stereo.comand;

import command.ICommand;
import command.remote_controlled_object.stereo.Stereo;

public class StereoOffCommand implements ICommand {
    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        // FIXME: we should set previous mode and previous volume here
    }
}
