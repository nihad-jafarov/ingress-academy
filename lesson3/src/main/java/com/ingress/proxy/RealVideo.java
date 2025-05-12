package com.ingress.proxy;

public class RealVideo implements Video {
    private String filename;

    public RealVideo(String filename) {
        this.filename = filename;
        loadFromDisk(); // Simulate expensive operation
    }

    private void loadFromDisk() {
        System.out.println("Loading video: " + filename);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + filename);
    }
}
