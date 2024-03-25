package facade.device.amplifier;

import facade.device.IOnOffDevice;
import facade.device.player.CdPlayer;
import facade.device.player.DvdPlayer;
import facade.device.tuner.Tuner;

/**
 * Modeled an amplifier that can have a tuner, a cd player and a dvd player plug in
 */
public class Amplifier implements IOnOffDevice {
    private AmplifierMode currentMode = AmplifierMode.STANDBY;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private int volume = 0;

    @Override
    public void on() {
        System.out.println("The amplifier is turning on!");
    }

    @Override
    public void off() {
        System.out.println("The amplifier is turning off!");
    }

    public AmplifierMode getCurrentMode() {
        return currentMode;
    }

    public void setCurrentMode(AmplifierMode currentMode) {
        this.currentMode = currentMode;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
        setCurrentMode(AmplifierMode.CD);
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        setCurrentMode(AmplifierMode.DVD);
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        setCurrentMode(AmplifierMode.TUNER);
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
