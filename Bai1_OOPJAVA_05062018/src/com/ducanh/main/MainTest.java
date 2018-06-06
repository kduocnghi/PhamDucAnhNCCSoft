package com.ducanh.main;

import com.ducanh.shape.ShapeManager;

public class MainTest {
    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();
        shapeManager.importListShape();
        shapeManager.exportListShape();
        shapeManager.getMaxAreaEachShape();
        shapeManager.getNumberOfShape();
    }
}
