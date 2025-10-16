package com.itschool.session18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        runtimePolymorphism();
        //compileTimePolymorphism();
    }

    private static void compileTimePolymorphism() {
        StringBuilder stringBuilder = new StringBuilder();
        // 'append' method in many forms with different params
        stringBuilder.append("abc");
        stringBuilder.append(1);
        stringBuilder.append("abc", 0, 0);

        Car car = new Car();
        // 'sum' method in many forms with different params
        System.out.println(car.sum(1, 3));
        System.out.println(car.sum(2, 4, 9));
    }

    private static void runtimePolymorphism() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert which vehicle to start: ");
        String type = scanner.nextLine();

        Vehicle vehicle;
        if (type.equals("vehicle")) {
            vehicle = new Vehicle();
        } else if (type.equals("car")) {
            vehicle = new Car();
        } else if (type.equals("motorcycle")) {
            vehicle = new Motorcycle();
        } else {
            //return;
            vehicle = null;
            //System.exit(123);
        }

        if (vehicle == null) {
            System.out.println("Cannot operate on vehicle.");
        } else {
            vehicle.start();
            System.out.println("==============");

            Car car = new Car();
            Vehicle vehicle1 = car;
        }
    }
}
