package com.itschool.session17.homework.ex6;

public class Circle extends Shape {

    private final int radix;

    public Circle(int radix) {
        super("cerc");
        this.radix = radix;
    }

    @Override
    protected double area() {
        return Math.PI * radix * radix;
    }
}
