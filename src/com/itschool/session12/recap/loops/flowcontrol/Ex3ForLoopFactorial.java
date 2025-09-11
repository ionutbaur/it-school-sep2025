package com.itschool.session12.recap.loops.flowcontrol;

import java.util.Scanner;

public class Ex3ForLoopFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate factorial using a for loop
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print out the factorial of the number
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
