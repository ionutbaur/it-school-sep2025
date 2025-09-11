package com.itschool.session12.recap.loops.flowcontrol;

import java.util.Arrays;

public class Ex9ArrayModification {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50}; // Example array
        System.out.println("Original array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                // Decrement value at even index
                array[i]--;
            } else {
                // Increment value at odd index
                array[i]++;
            }
        }

        System.out.println("Modified array: " + Arrays.toString(array));
    }
}
