package com.ingress.abstractfactory;

public class AdultsSweetsFactory implements SweetsFactory {
    public Chocolate createChocolate() {
        return new DarkChocolate();
    }

    public Candy createCandy() {
        return new SourCandy();
    }
}