package com.ingress.bridge;

public class Radio implements Device {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Radio turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio turned OFF.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to " + volume);
    }
}
