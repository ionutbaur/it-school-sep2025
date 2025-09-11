package com.itschool.session12.recap.stringmanipulation;

import java.util.Scanner;

public class Ex7SentenceReverser {

    private static final String DELIMITER = " "; // constant

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: "); // ana are mere
        String sentence = scanner.nextLine();

        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    private static String reverseWords(String sentence) {
        // Split the sentence into words using whitespace as delimiter
        String[] words = sentence.split(DELIMITER);

        // Create a StringBuilder to build the reversed sentence
        StringBuilder reversed = new StringBuilder();
        // Iterate over the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) { // not the last word
                reversed.append(DELIMITER); // Add whitespace between words
            }
        }

        return reversed.toString();
    }
}
