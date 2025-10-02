package com.itschool.session17.homework.ex6;

public class Square extends Shape {

    private final int side;

    public Square(int side) {
        super("patrat");
        this.side = side;
    }

    @Override
    protected double area() {
        return side * side;
    }
}
