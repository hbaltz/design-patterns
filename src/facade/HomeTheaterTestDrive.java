package facade;

import facade.device.HomeTheaterFacade;
import facade.device.amplifier.Amplifier;
import facade.device.light.TheaterLights;
import facade.device.player.CdPlayer;
import facade.device.player.DvdPlayer;
import facade.device.popcornpopper.PopcornPopper;
import facade.device.projector.Projector;
import facade.device.screen.Screen;
import facade.device.tuner.Tuner;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        PopcornPopper popcornPopper = new PopcornPopper();
        TheaterLights theaterLights= new TheaterLights();
        Screen screen = new Screen();
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer= new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Tuner tuner = new Tuner();


        // If we want to have a movie night that are the following action we have to do (without a facade)
        /*
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
        */
        // And this is just to start the movie night, ath the end we will have to turn everything off

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
                amplifier,
                tuner,
                dvdPlayer,
                cdPlayer,
                projector,
                theaterLights,
                screen,
                popcornPopper
        );

        // Here we start the movie night
        homeTheaterFacade.watchMovie();
        // Here we end it
        homeTheaterFacade.endMovie();
    }
}
