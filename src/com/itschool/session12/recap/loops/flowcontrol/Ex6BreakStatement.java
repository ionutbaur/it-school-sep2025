package com.itschool.session12.recap.loops.flowcontrol;

import java.util.Scanner;

public class Ex6BreakStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        // Prompt the user to enter numbers until a negative number is entered
        while (true) {
            System.out.print("Enter a number (enter a negative number to exit): ");
            int number = scanner.nextInt();

            if (number < 0) {
                break; // Exit the loop if a negative number is entered
            }

            sum += number; // Add the positive number to the sum
        }

        System.out.println("Sum of the positive numbers: " + sum);
    }
}
