package com.itschool.session27;

import java.util.*;

public class Lotto {

    public static void main(String[] args) {
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(13, "Bughi");
        studentsMap.put(7, "Raul Vlad Merisor");
        studentsMap.put(-10, "Valentin");
        studentsMap.put(11, "Calin");
        studentsMap.put(27, "Tavi");
        //studentsMap.put(0, "Marco");
        studentsMap.put(42, "Andrei");
        studentsMap.put(4, "Sorin");
        studentsMap.put(14, "Rodica");
        studentsMap.put(6, "Alina");
        studentsMap.put(-20, "Vlad Andronache");
        //studentsMap.put(0, "Oana");
        studentsMap.put(-30, "Teo");
        studentsMap.put(147235, "Cosmin");
        studentsMap.put(-40, "Daniela");
        studentsMap.put(89, "Laurentiu");

        Set<Integer> set = studentsMap.keySet(); // get the Map keys
        List<Integer> luckyNumbers = new LinkedList<>(set); // build a list over the above set

        Collections.shuffle(luckyNumbers); // shuffle the list's elements

        System.out.println("Lottery draw. Press Enter to draw a lucky student.");
        Scanner scanner = new Scanner(System.in);

        while (!luckyNumbers.isEmpty()) { // while the list is not empty
            scanner.nextLine(); // wait for user to press Enter
            int luckyNumber = luckyNumbers.removeFirst(); // remove the first element from the shuffled list and return it (elements are random in the list)
            String luckyStudent = studentsMap.get(luckyNumber); // retrieve the student name (value) from the Map based on his/her lucky number (Map key)
            System.out.println(luckyStudent); // print the above found student
        }

        System.out.println("Finish.");
    }
}
