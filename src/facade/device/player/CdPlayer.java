package facade.device.player;

import facade.device.IOnOffDevice;

/**
 * Modeled a cd player
 */
public class CdPlayer implements IOnOffDevice, IPlayer {
    @Override
    public void on() {
        System.out.println("The cd player is turning on!");
    }

    @Override
    public void off() {
        System.out.println("The cd player is turning off!");
    }

    @Override
    public void play() {
        System.out.println("The cd player starts playing some music!");
    }

    @Override
    public void pause() {
        System.out.println("The cd player is pausing the music!");
    }

    @Override
    public void stop() {
        System.out.println("The cd player is stopping the music!");
    }

    @Override
    public void eject() {
        System.out.println("The cd player ejects the cd!");
    }
}
