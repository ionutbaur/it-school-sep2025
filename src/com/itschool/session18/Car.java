package com.itschool.session18;

public class Car extends Vehicle {

    public void start(int a) {
        System.out.println("Start the car");
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}
