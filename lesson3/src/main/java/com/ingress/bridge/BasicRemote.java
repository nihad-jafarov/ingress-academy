package com.ingress.bridge;

public class BasicRemote extends RemoteControl {

    private int currentVolume = 10;

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void volumeUp() {
        currentVolume += 5;
        device.setVolume(currentVolume);
    }
}
