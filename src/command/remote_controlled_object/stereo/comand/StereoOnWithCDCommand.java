package command.remote_controlled_object.stereo.comand;

import command.ICommand;
import command.remote_controlled_object.stereo.Stereo;

public class StereoOnWithCDCommand implements ICommand {
    private final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(1);
    }

    @Override
    public void undo() {
        stereo.setVolume(0);
        stereo.off();
        // Undo setCd ? : set to previous value -> need to save previous value
    }
}
