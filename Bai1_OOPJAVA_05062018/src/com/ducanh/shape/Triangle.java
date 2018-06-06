package com.ducanh.shape;

import com.ducanh.coordinate.Coordinate;
import com.ducanh.shape.Shape;

public class Triangle extends Shape {
    private int edgeA;
    private int edgeB;
    private int edgeC;
    private float area;

    public Triangle(Coordinate pivotCoordinate, String color, int edgeA, int edgeB, int edgeC) {
        super(pivotCoordinate, color);
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
        float p = (edgeA + edgeB + edgeC)/2;
        this.area = (float) Math.sqrt(p*(p-edgeA)*(p-edgeB)*(p-edgeC));
    }

    public int getEdgeA() {
        return edgeA;
    }

    public int getEdgeB() {
        return edgeB;
    }

    public int getEdgeC() {
        return edgeC;
    }

    @Override
    public float getArea() {
        return area;
    }

    public void setEdgeA(int edgeA) {
        this.edgeA = edgeA;
    }

    public void setEdgeB(int edgeB) {
        this.edgeB = edgeB;
    }

    public void setEdgeC(int edgeC) {
        this.edgeC = edgeC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edgeA=" + edgeA +
                ", edgeB=" + edgeB +
                ", edgeC=" + edgeC +
                ", area=" + area +
                ", pivotCoordinate=" + pivotCoordinate +
                ", color='" + color + '\'' +
                '}';
    }
}
