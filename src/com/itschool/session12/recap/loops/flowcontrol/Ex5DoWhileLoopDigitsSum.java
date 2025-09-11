package com.itschool.session12.recap.loops.flowcontrol;

import java.util.Scanner;

public class Ex5DoWhileLoopDigitsSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum of the digits using a do-while loop
        int sum = 0;
        int remainingDigits = Math.abs(number); // Use absolute value to handle negative numbers
        do {
            int lastDigit = remainingDigits % 10;
            sum += lastDigit; // Add the last digit to the sum
            remainingDigits /= 10; // Remove the last digit from the number
        } while (remainingDigits > 0);

        System.out.println("Sum of the digits: " + sum);
    }
}
