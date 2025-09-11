package com.itschool.session12.recap.javabasics;

public class Ex1IntegerOverflow {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE; // maximum int value
        int b = 2;

        // Multiply two int values
        //int result = a * b; // incorrect result, integer overflow
        long result = (long) a * b; // cast to long (a larger data-type for storing numbers) - correct result

        System.out.println("Result: " + result);
    }
}
