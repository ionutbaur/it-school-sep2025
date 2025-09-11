package com.itschool.session12.recap.javabasics;

import java.util.Scanner;

public class Ex3StringToInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        String input = scanner.nextLine();

        if (isNumber(input)) {
            int intValue = Integer.parseInt(input);
            System.out.println("Integer value: " + intValue);
        } else {
            System.out.println("Invalid input. Please enter a valid integer value.");
        }
    }

    // method to check if a given sting is number
    private static boolean isNumber(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) { // if at least one character from the string is not digit, then the string is not a number
                return false;
            }
        }

        return true; // otherwise (ended iteration through all the characters), the string is number
    }
}
