package com.ducanh.shape;


import com.ducanh.coordinate.Coordinate;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeManager {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public ShapeManager(){

    }

    public void exportListShape(){
        for (int i=0;i<shapes.size();i++){
            System.out.println(shapes.get(i).toString());
        }
    }

    public int getNumberOfShape(){
        return shapes.size();
    }

    public void getMaxAreaEachShape(){
        float maxRectangle = 0;
        float maxTriangle = 0;
        float maxCircle = 0;
        for (int i=0;i<shapes.size();i++){
            if (shapes.get(i) instanceof Rectangle){
                if(shapes.get(i).getArea() > maxRectangle){
                    maxRectangle = shapes.get(i).getArea();
                }
            }else if(shapes.get(i) instanceof Circle){
                if(shapes.get(i).getArea() > maxCircle){
                    maxCircle = shapes.get(i).getArea();
                }
            }else if(shapes.get(i) instanceof Triangle){
                if(shapes.get(i).getArea() > maxTriangle){
                    maxTriangle = shapes.get(i).getArea();
                }
            }
        }
        System.out.println(maxRectangle+"  "+maxCircle+"  "+maxTriangle);
    }

    public void importListShape(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Nhập hình tròn");
            System.out.println("2. Nhập hình chữ nhật");
            System.out.println("3. Nhập hình hình tam giác");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.println("-------------------------------------------------------------");

            int control = scanner.nextInt();
            switch (control){
                case 1 :
                    System.out.println("Nhập tọa độ x của tâm :");
                    int x = scanner.nextInt();
                    System.out.println("Nhập tọa độ y của tâm :");
                    int y = scanner.nextInt();
                    System.out.println("Nhập màu sắc :");
                    String color = scanner.next() +scanner.nextLine();
                    System.out.println(color +"xxxxxx");
                    System.out.println("Nhập bán kính :");
                    int radius = scanner.nextInt();
                    shapes.add(new Circle(new Coordinate(x,y), color, radius));
                    break;
                case 2 :
                    System.out.println("Nhập tọa độ x của tâm :");
                    int x1 = scanner.nextInt();
                    System.out.println("Nhập tọa độ y của tâm :");
                    int y1 = scanner.nextInt();
                    System.out.println("Nhập màu sắc :");

                    String color1 = scanner.next() +scanner.nextLine();
                    System.out.println("Nhập chiều dài :");
                    int width = scanner.nextInt();
                    System.out.println("Nhập chiều rộng :");
                    int height = scanner.nextInt();
                    shapes.add(new Rectangle(new Coordinate(x1, y1), color1, width, height));
                    break;
                case 3 :
                    System.out.println("Nhập tọa độ x của tâm :");
                    int x2 = scanner.nextInt();
                    System.out.println("Nhập tọa độ y của tâm :");
                    int y2 = scanner.nextInt();
                    System.out.println("Nhập màu sắc :");

                    String color2 = scanner.next() +scanner.nextLine();
                    System.out.println("Nhập cạnh a :");
                    int a = scanner.nextInt();
                    System.out.println("Nhập cạnh b :");
                    int b = scanner.nextInt();
                    System.out.println("Nhập cạnh c :");
                    int c = scanner.nextInt();
                    if(a + b <= c || a + c <= b || b + c <= a){
                        break;
                    }
                    shapes.add(new Triangle(new Coordinate(x2, y2), color2, a, b, c));
                    break;
                case 4:
                    return;
            }
        }
    }
}
