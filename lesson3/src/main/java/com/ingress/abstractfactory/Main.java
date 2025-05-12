package com.ingress.abstractfactory;

public class Main {
    public static void main(String[] args) {
        SweetsFactory kidsFactory = new KidsSweetsFactory();
        Chocolate kidsChocolate = kidsFactory.createChocolate();
        Candy kidsCandy = kidsFactory.createCandy();

        kidsChocolate.eat();
        kidsCandy.unwrap();

        SweetsFactory adultsFactory = new AdultsSweetsFactory();
        Chocolate adultsChocolate = adultsFactory.createChocolate();
        Candy adultsCandy = adultsFactory.createCandy();

        adultsChocolate.eat();
        adultsCandy.unwrap();
    }
}
