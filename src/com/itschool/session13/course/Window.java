package com.itschool.session13.course;

public class Window {

    int length; // by default 0
    int width; // be default 0
    String color; // by default null
    boolean hasSeeView; // by default false
    boolean hasMountainView; // by default false

    @Override
    public String toString() {
        return "Window{" +
                "hasSeeView=" + hasSeeView +
                ", length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", hasMountainView=" + hasMountainView +
                '}';
    }
}
