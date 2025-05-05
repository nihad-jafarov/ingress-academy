package com.ingress.O.bad;

import java.util.List;

public class AreaCalculator {
    public double totalArea(List<Object> shapes) {
        double total = 0;
        for (Object shape : shapes) {
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                total += Math.PI * c.radius * c.radius;
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                total += r.width * r.height;
            }
        }
        return total;
    }
}