package com.itschool.session17.homework.ex6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(7);
        Shape rectangle = new Rectangle(10, 4);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(square);
        shapeList.add(rectangle);

        for (Shape shape : shapeList) {
            System.out.println("Area of: " + shape.getName() + " is: " + shape.area());
        }
    }
}
