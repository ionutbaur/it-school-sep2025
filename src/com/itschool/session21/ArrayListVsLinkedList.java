package com.itschool.session21;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        //List<Integer> list = new ArrayList<>();

        System.out.println("Started inserting in list at: " + LocalDateTime.now());
        for (int i = 0; i < 1_000_000; i++) {
            list.addFirst(i); //best performance with an LinkedList for writing into the list
        }
        System.out.println("Ended inserting in list at: " + LocalDateTime.now());

        System.out.println("================");

        list = new ArrayList<>(list); // transform the list to an ArrayList for best performance on reading from list
        System.out.println("Started retrieving from list at: " + LocalDateTime.now());
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        System.out.println("Ended retrieving from list at: " + LocalDateTime.now());
    }
}
