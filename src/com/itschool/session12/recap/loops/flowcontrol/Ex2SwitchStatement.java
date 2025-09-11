package com.itschool.session12.recap.loops.flowcontrol;

import java.util.Scanner;

public class Ex2SwitchStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt to enter a day of the week
        System.out.print("Enter a day of the week (e.g., monday, tuesday, ...): ");
        String day = scanner.nextLine();

        String message = switch (day.toLowerCase()) { // ignore case-sensitive
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> day + " is a weekday.";
            case "saturday", "sunday" -> day + " is a weekend day.";
            default -> "Invalid input. Please enter a valid day of the week.";
        };

        System.out.println(message);
    }
}
