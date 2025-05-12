package com.ingress.facade;

public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private Amplifier amplifier;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, Amplifier amplifier) {
        this.dvd = dvd;
        this.projector = projector;
        this.amplifier = amplifier;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amplifier.on();
        amplifier.setVolume(10);
        projector.on();
        projector.setWideScreenMode();
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down home theater...");
        dvd.off();
        projector.off();
        amplifier.off();
    }
}