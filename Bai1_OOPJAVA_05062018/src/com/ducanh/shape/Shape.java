package com.ducanh.shape;

import com.ducanh.coordinate.Coordinate;

public abstract class Shape {
    protected Coordinate pivotCoordinate;
    protected String color;

    public Shape(Coordinate pivotCoordinate, String color) {
        this.pivotCoordinate = pivotCoordinate;
        this.color = color;
    }

    public Coordinate getPivotCoordinate() {
        return pivotCoordinate;
    }

    public void setPivotCoordinate(Coordinate pivotCoordinate) {
        this.pivotCoordinate = pivotCoordinate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  abstract float getArea();

    @Override
    public String toString() {
        return "Shape{" +
                "pivotCoordinate=" + pivotCoordinate +
                ", color='" + color + '\'' +
                '}';
    }
}
