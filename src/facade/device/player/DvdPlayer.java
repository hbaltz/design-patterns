package facade.device.player;

import facade.device.IOnOffDevice;

/**
 * Modeled a dvd player
 */
public class DvdPlayer implements IOnOffDevice, IPlayer {
    @Override
    public void on() {
        System.out.println("The dvd player is turning on!");
    }

    @Override
    public void off() {
        System.out.println("The dvd player is turning off!");
    }

    @Override
    public void play() {
        System.out.println("The dvd player starts playing a movie!");
    }

    @Override
    public void pause() {
        System.out.println("The dvd player is pausing the movie!");
    }

    @Override
    public void stop() {
        System.out.println("The dvd player is stopping the movie!");
    }

    @Override
    public void eject() {
        System.out.println("The dvd player ejects the dvd!");
    }
}
