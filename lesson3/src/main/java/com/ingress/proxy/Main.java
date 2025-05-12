package com.ingress.proxy;

public class Main {
    public static void main(String[] args) {
        Video video1 = new ProxyVideo("funny_cats.mp4", true);
        Video video2 = new ProxyVideo("secret_meeting.mp4", false);

        video1.play();
        video2.play();
    }
}
