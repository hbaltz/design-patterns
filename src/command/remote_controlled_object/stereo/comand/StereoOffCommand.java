package command.remote_controlled_object.stereo.comand;

import command.ICommand;
import command.remote_controlled_object.stereo.Stereo;
import command.remote_controlled_object.stereo.StereoMode;

public class StereoOffCommand implements ICommand {
    private final Stereo stereo;
    private StereoMode previousMode;
    private int previousVolume;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        previousMode = stereo.getCurrentMode();
        previousVolume = stereo.getVolume();
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();

        switch (previousMode) {
            case STANDBY -> stereo.setStandBy();
            case CD -> stereo.setCd();
            case DVD -> stereo.setDvd();
            case RADIO -> stereo.setRadio();
        }

        stereo.setVolume(previousVolume);
    }
}
