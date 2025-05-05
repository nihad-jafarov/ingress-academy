package com.ingress.O.good;

import java.util.List;

public class AreaCalculator {
    public double totalArea(List<Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.area();
        }
        return total;
    }
}
