package com.itschool.session12.recap.javabasics;

public class Ex2DivisionByZero {

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        // Check if the divisor is zero before performing division
        if (divisor == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        }
    }
}
