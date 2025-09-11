package com.itschool.session12.recap.loops.flowcontrol;

import java.util.Scanner;

public class Ex4WhileLoopPrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        int divisor = 2; // start with divisor as 2
        while (divisor <= Math.sqrt(number)) { //while the divisor is less than square root (radical) of the number
            if (number % divisor == 0) { // if the number is exactly divided by the divisor, then it is not prime
                return false;
            }
            divisor++; //try with a higher divisor
        }

        return true; // iteration over, return true
    }
}
