package com.itschool.session36;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //checkedExceptionWithTryCatch();
        //checkedExceptionWithDeclaration();
        //catchMultipleExceptionsInSameBlock();
        //catchMultipleExceptionsInDifferentBlocks();
        //finallyBlock();
        tryWithResources();
    }

    private static void tryWithResources() {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please insert a number:");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (NullPointerException e) {
            System.out.println("error...");
        }
    }

    private static void finallyBlock() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please insert a number:");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (NullPointerException e) {
            System.out.println("error...");
        } finally {
            System.out.println("Finally close the scanner");
            scanner.close();
        }

        System.out.println("At the end close the scanner");
        scanner.close();
    }

    private static void catchMultipleExceptionsInDifferentBlocks() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please insert a number:");
            int number = scanner.nextInt();
            System.out.println("The number is: " + number);

            System.out.println(4 / 0);

            String text = null;
            String upperText = text.toUpperCase();
            System.out.println(upperText);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred.");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("NPE occurred");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception occured");
            e.printStackTrace();
        }
    }

    private static void catchMultipleExceptionsInSameBlock() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please insert a number:");
            int number = scanner.nextInt();
            System.out.println("The number is: " + number);

            String text = null;
            String upperText = text.toUpperCase();
            System.out.println(upperText);
        } catch (InputMismatchException | NullPointerException e) {
            System.out.println("Some error occurred.");
            e.printStackTrace();
        }
    }

    private static void checkedExceptionWithDeclaration() throws IOException {
        File myFile = new File("/ionutz");
        boolean isFileCreated = myFile.createNewFile();
        System.out.println("File created: " + isFileCreated);
    }

    private static void checkedExceptionWithTryCatch() {
        try {
            // File myFile = new File("ionutz"); // this will work
            File myFile = new File("/ionutz"); // this will not work
            boolean isFileCreated = myFile.createNewFile();
            System.out.println("File created: " + isFileCreated);
        } catch (IOException e) {
            System.out.println("Cannot create file");
            e.printStackTrace();
        }
    }
}
