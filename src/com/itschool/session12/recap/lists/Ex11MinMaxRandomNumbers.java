package com.itschool.session12.recap.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex11MinMaxRandomNumbers {

    public static void main(String[] args) {
        // Create a list of 7 random integers
        List<Integer> randomNumbers = generateRandomNumbers(7);
        System.out.println("Generated list: " + randomNumbers);

        // Find the smallest and largest numbers
        int smallest = findSmallestNumber(randomNumbers);
        int largest = findLargestNumber(randomNumbers);

        // Print the smallest and largest numbers
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

    // Method to generate a list of random integers
    private static List<Integer> generateRandomNumbers(int count) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randomInt = random.nextInt(100); // Generating random integers between 0 and 99
            randomNumbers.add(randomInt);
        }

        return randomNumbers;
    }

    // Method to find the smallest number in a list
    private static int findSmallestNumber(List<Integer> numbers) {
        int min = numbers.getFirst();
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }

        return min;
    }

    // Method to find the largest number in a list
    private static int findLargestNumber(List<Integer> numbers) {
        int max = numbers.getFirst();
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        return max;
    }
}
