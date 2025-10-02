package com.itschool.session17.homework.ex6;

public abstract class Shape {

    private final String name;

    protected Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract double area();
}
