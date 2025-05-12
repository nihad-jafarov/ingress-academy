package com.ingress.adapter;

public class Main {
    public static void main(String[] args) {
        LightningCharger lightningCharger = new LightningCharger();
        USBCCharger charger = new LightningToUSBCAdapter(lightningCharger);

        charger.chargeWithUSBC();
    }
}
