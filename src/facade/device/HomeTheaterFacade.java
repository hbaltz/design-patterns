package facade.device;

import facade.device.amplifier.Amplifier;
import facade.device.amplifier.AmplifierMode;
import facade.device.light.TheaterLights;
import facade.device.player.CdPlayer;
import facade.device.player.DvdPlayer;
import facade.device.popcornpopper.PopcornPopper;
import facade.device.projector.Projector;
import facade.device.screen.Screen;
import facade.device.tuner.Tuner;

public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final Tuner tuner;
    private final DvdPlayer dvdPlayer;
    private final CdPlayer cdPlayer;
    private final Projector projector;
    private final TheaterLights theaterLights;
    private final Screen screen;
    private final PopcornPopper popcornPopper;

    public HomeTheaterFacade(
            Amplifier amplifier,
            Tuner tuner,
            DvdPlayer dvdPlayer,
            CdPlayer cdPlayer,
            Projector projector,
            TheaterLights theaterLights,
            Screen screen,
            PopcornPopper popcornPopper)
    {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    /**
     * Follows the same sequence we had to do by hand but wrap it in a handy method that does all the work
     * For each task we are delegating the responsibility to the corresponding component in the subsystem
     */
    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();

        theaterLights.on();
        theaterLights.dim();

        screen.down();

        projector.on();
        projector.setDvdPlayer(dvdPlayer);
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setDvdPlayer(dvdPlayer);
        amplifier.setVolume(5);

        dvdPlayer.on();
        dvdPlayer.play();
    }

    /**
     * Take care of shutting everything down for us.
     * Again each task is delegated to the appropriate component in the subsystem
     */
    public void endMovie() {
        System.out.println("Shutting movie theater down ...");
        popcornPopper.off();
        theaterLights.bright();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    public void listenToCd() {
        amplifier.on();
        amplifier.setCdPlayer(cdPlayer);
        amplifier.setVolume(5);

        cdPlayer.on();
        cdPlayer.play();
    }

    public void endCd() {
        amplifier.off();
        cdPlayer.stop();
        cdPlayer.eject();
        cdPlayer.off();
    }

    public void listenToRadio(double frequency) {
        amplifier.on();
        amplifier.setTuner(tuner);
        amplifier.setVolume(5);

        tuner.on();
        tuner.setFrequency(frequency);
    }

    public void endRadio() {
        amplifier.off();
        tuner.off();
    }
}
