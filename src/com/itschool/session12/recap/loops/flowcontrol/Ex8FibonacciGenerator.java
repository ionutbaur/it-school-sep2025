package com.itschool.session12.recap.loops.flowcontrol;

import java.util.Scanner;

public class Ex8FibonacciGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("First " + n + " Fibonacci numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            // Calculate the next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
