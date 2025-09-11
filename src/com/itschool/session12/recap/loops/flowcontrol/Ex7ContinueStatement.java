package com.itschool.session12.recap.loops.flowcontrol;

import java.util.Scanner;

public class Ex7ContinueStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        // Prompt the user to enter numbers until they're done
        while (true) {
            System.out.print("Enter a number (enter 0 to finish): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break; // Exit the loop if 0 is entered
            }

            if (number % 2 != 0) {
                continue; // Skip odd numbers
            }

            sum += number; // Add the even number to the sum
        }

        System.out.println("Sum of the even numbers: " + sum);
    }
}
