package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeCollector = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapeCollector.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeCollector.contains(shape)) {
            shapeCollector.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >=0 && n < shapeCollector.size()) {
            shape = shapeCollector.get(n);
        }
        return shape;
    }

    public void showFigure() {
        System.out.println(shapeCollector.toString());
    }

    public int getFiguresQuantity() {
        return shapeCollector.size();
    }

}
