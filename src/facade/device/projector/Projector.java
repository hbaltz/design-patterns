package facade.device.projector;

import facade.device.IOnOffDevice;
import facade.device.player.DvdPlayer;

/**
 * Modeled a projector that uses a dvd player
 */
public class Projector implements IOnOffDevice {
    private DvdPlayer dvdPlayer;

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void on() {
        System.out.println("The projector is turning on!");
    }

    @Override
    public void off() {
        System.out.println("The projector is turning off!");
    }

    public void tvMode() {
        System.out.println("The projector is set to tv mode");
    }

    public void wideScreenMode() {
        System.out.println("The projector is set to wide screen mode");
    }
}
