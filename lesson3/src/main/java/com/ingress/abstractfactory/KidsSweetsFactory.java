package com.ingress.abstractfactory;

public class KidsSweetsFactory implements SweetsFactory {
    public Chocolate createChocolate() {
        return new MilkChocolate();
    }

    public Candy createCandy() {
        return new SweetCandy();
    }
}