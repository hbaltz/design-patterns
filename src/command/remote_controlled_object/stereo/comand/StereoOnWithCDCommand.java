package command.remote_controlled_object.stereo.comand;

import command.ICommand;
import command.remote_controlled_object.stereo.Stereo;
import command.remote_controlled_object.stereo.StereoMode;

public class StereoOnWithCDCommand implements ICommand {
    private final Stereo stereo;
    private StereoMode previousMode;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        previousMode = stereo.getCurrentMode();

        stereo.on();
        stereo.setCd();
        stereo.setVolume(1);
    }

    @Override
    public void undo() {
        stereo.setVolume(0);
        stereo.off();

        switch (previousMode) {
            case STANDBY -> stereo.setStandBy();
            case CD -> stereo.setCd();
            case DVD -> stereo.setDvd();
            case RADIO -> stereo.setRadio();
        }
    }
}
