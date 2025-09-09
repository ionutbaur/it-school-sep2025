package com.itschool.session11.course;

import java.util.Arrays;

public class CourseMain {

    static int primitiveNumber; // primitive int -> default value: 0
    static Integer objectNumber; // object Integer -> default value: null

    public static void main(String[] args) {
        // easyDemo();
        //stringArrayDemo();
        //multidimensionalArray();
        arrayAdvanced();

        String name = "ionutz";
        char[] charsArray = name.toCharArray();
        char firstChar = charsArray[0];

        String firstLetter = String.valueOf(firstChar);
        System.out.println(firstLetter);
        String[] array = new String[5];
        varArgsMethod(0, array);
        varArgsMethod(1);
        varArgsMethod(2, "ionutz");
        varArgsMethod(3, "ionutz", "gabriel");
    }

    static void varArgsMethod(int number, String... args) {
        int length = args.length;
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    static void arrayAdvanced() {
        String[] array = {"ionutz", "gabriel", "baur", "ionutz", "ceva"};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(array));

        int foundIndex = Arrays.binarySearch(array, "ionutz");
        System.out.println(foundIndex);
    }

    static void multidimensionalArray(){
        String[] array1 = {"creion", "caiet", "pix"};
        String[] array2 = {"ionutz", "gabriel"};

        String[][] matrix = { array1, array2 };
        String[][] matrix2 = {
                //  0        1        2
               {"creion", "caiet", "pix"}, // array1 // index 0

                // 0         1
               {"ionutz", "gabriel"} // array2 // index 1
        };

        System.out.println(Arrays.deepToString(matrix2));
    }

    static void stringArrayDemo() {
        //int[] intArray = {1, 2, 3};
        // indices          0           1         2
        String[] names = {"Ionutz", "Gabriel", "Baur"};
        String name1 = names[2];
        System.out.println(name1);

        for (String name : names) {
            System.out.println("The name is: " + name);
        }
    }

    static void easyDemo() {
        System.out.println(primitiveNumber); // 0
        System.out.println(objectNumber); // null

        System.out.println("Printing elements of array babeshte");
                        // indices      0  1  2  3  4
        int[] numbers = new int[5]; // [0, 0, 0, 0, 0] // values
        System.out.println(numbers[0]); // numbers[ceva]: // ceva -> index
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        numbers[2] = 9;
        int elementAtIndex2 = numbers[2];
        System.out.println(elementAtIndex2);

        //System.out.println(numbers[5]);

        //System.out.println(Arrays.toString(numbers));

        Integer[] nums = new Integer[5];
        System.out.println("Printing elements of nums: ");
        System.out.println(Arrays.toString(nums));

        System.out.println("Printing element at index 2:");
        Object objAtIndex2 = (Integer) nums[2];
        Integer integerAtIndex2 = nums[2];
        System.out.println(objAtIndex2);
        System.out.println(integerAtIndex2);

        /*int intAtIndex2 = nums[2]; // null -> error
        System.out.println(intAtIndex2);*/

        Object objCastToIntAtIndex2 = (int) nums[2];
        System.out.println(objCastToIntAtIndex2);

        Integer nullInteger = null;
        nullInteger.toString();
    }
}
