package com.ingress.facade;

public class Main {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Amplifier amp = new Amplifier();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, amp);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
