package com.ingress.proxy;

public class ProxyVideo implements Video {
    private RealVideo realVideo;
    private String filename;
    private boolean accessGranted;

    public ProxyVideo(String filename, boolean accessGranted) {
        this.filename = filename;
        this.accessGranted = accessGranted;
    }

    @Override
    public void play() {
        if (!accessGranted) {
            System.out.println("Access denied to video: " + filename);
            return;
        }

        if (realVideo == null) {
            realVideo = new RealVideo(filename);
        }
        realVideo.play();
    }
}