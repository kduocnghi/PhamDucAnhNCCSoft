package com.ducanh.shape;

import com.ducanh.coordinate.Coordinate;

public class Rectangle extends Shape {
    private int weight;
    private int height;
    private float area;
    public Rectangle(Coordinate pivotCoordinate, String color, int weight, int height) {
        super(pivotCoordinate, color);
        this.height = height;
        this.weight=weight;
        this.area = height * weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                ", area=" + area +
                ", pivotCoordinate=" + pivotCoordinate +
                ", color='" + color + '\'' +
                '}';
    }
}
