package com.ducanh.shape;

import com.ducanh.coordinate.Coordinate;
import com.ducanh.shape.Shape;

public class Circle extends Shape {
    private int radius;
    private float area;

    public Circle(Coordinate pivotCoordinate, String color, int radius) {
        super(pivotCoordinate, color);
        this.radius = radius;
        this.area = (float)(radius * radius * 3.14);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public float getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", pivotCoordinate=" + pivotCoordinate +
                ", color='" + color + '\'' +
                '}';
    }
}
