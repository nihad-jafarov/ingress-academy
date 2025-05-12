package com.ingress.adapter;

public class LightningToUSBCAdapter implements USBCCharger {
    private LightningCharger lightningCharger;

    public LightningToUSBCAdapter(LightningCharger lightningCharger) {
        this.lightningCharger = lightningCharger;
    }

    @Override
    public void chargeWithUSBC() {
        System.out.println("Adapter converts USB-C to Lightning.");
        lightningCharger.chargeWithLightning();
    }
}