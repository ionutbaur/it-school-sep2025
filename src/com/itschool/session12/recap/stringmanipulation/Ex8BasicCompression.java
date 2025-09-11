package com.itschool.session12.recap.stringmanipulation;

import java.util.Scanner;

public class Ex8BasicCompression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Compress the string
        String compressedString = compressString(input);
        System.out.println("Compressed string: " + compressedString);
    }

    private static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int frequencyCounter = 1; // a letter appears at least once

        for (int currentIndex = 0; currentIndex < str.length(); currentIndex++) {
            int nextIndex = currentIndex + 1;
            if (nextIndex < str.length() && // // if the next index is still in bound of String's length (meaning max str.length() - 1)
                    str.charAt(currentIndex) == str.charAt(nextIndex)) { // and current character is the same as the next character, increment counter
                frequencyCounter++;
            } else {
                // if the current character is different from the next character or is the last character
                // append the character and its counter to the compressed String
                compressed.append(str.charAt(currentIndex));
                compressed.append(frequencyCounter);
                frequencyCounter = 1; // Reset counter for the next character
            }
        }

        return compressed.toString();
    }
}
