package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    public String getShapeName() {
        String name = "Square";
        return name;
    }

    public double getField() {
        return side*side;
    }

}
