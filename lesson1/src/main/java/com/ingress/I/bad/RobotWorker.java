package com.ingress.I.bad;

public class RobotWorker implements Worker {
    public void work() {
        System.out.println("Robot is working");
    }

    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}