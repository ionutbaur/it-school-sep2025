package com.itschool.session17.homework.ex6;

public class Rectangle extends Shape {

    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        super("dreptunghi");
        this.length = length;
        this.width = width;
    }

    @Override
    protected double area() {
        return length * width;
    }
}
