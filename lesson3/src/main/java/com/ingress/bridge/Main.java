package com.ingress.bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote1 = new BasicRemote(tv);

        remote1.turnOn();
        remote1.volumeUp();
        remote1.turnOff();

        System.out.println();

        Device radio = new Radio();
        RemoteControl remote2 = new BasicRemote(radio);

        remote2.turnOn();
        remote2.volumeUp();
        remote2.turnOff();
    }
}
