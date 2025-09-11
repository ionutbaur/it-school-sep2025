package com.itschool.session12.recap.javabasics;

import java.util.Scanner;

public class Ex4FloatingPointPrecision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second floating-point number: ");
        float num2 = scanner.nextFloat();

        System.out.print("Enter the third floating-point number: ");
        float num3 = scanner.nextFloat();

        // Calculate the sum of the three numbers
        double sum = num1 + num2 + num3;

        // Calculate the average
        double average = sum / 3;

        // Check if the sum exceeds the maximum value that can be represented by a float
        if (sum > Float.MAX_VALUE) {
            System.out.println("The sum exceeds the maximum value that can be represented by a float.");
            System.out.println("Average cannot be calculated.");
        } else {
            System.out.println("Average: " + average);
        }
    }
}
