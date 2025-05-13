package org.ingress.observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer channel1 = new NewsChannel("Channel A");
        Observer channel2 = new NewsChannel("Channel B");

        agency.attach(channel1);
        agency.attach(channel2);

        agency.setNews("Breaking News: Observer Pattern Implemented!");
    }
}
