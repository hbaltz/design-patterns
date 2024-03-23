package command.remote_controlled_object.stereo;

/**
 * Modeled a remote controlled stereo
 */
public class Stereo {
    private final String location;
    private int volume = 0;
    private StereoMode currentMode = StereoMode.STANDBY;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("The stereo in "+ location + " has been switched on!");
    }

    public void off() {
        System.out.println("The stereo in  "+ location + " has been switched off!");
    }

    public void setVolume(int newVolume) {
        if (newVolume <= 0) {
            volume = 0;
        } else {
            volume = Math.min(newVolume, 10);
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setCd() {
        currentMode = StereoMode.CD;
        System.out.println("The stereo in "+ location + " switch to cd mode!");
    }

    public void setDvd() {
        currentMode = StereoMode.DVD;
        System.out.println("The stereo in "+ location + " switch to dvd mode!");
    }

    public void setRadio() {
        currentMode = StereoMode.RADIO;
        System.out.println("The stereo in "+ location + " switch to radio mode!");
    }

    public void setStandBy() {
        currentMode = StereoMode.STANDBY;
        System.out.println("The stereo in "+ location + " switch to stand by mode!");
    }

    public StereoMode getCurrentMode() {
        return currentMode;
    }
}
