package com.itschool.session21;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        //iteratorDemo();
        //listDemo();
        //hashSetDemo();
        //linkedHashSetDemo();
        treeSetDemo();
    }

    private static void treeSetDemo() {
        // a sorted Set - elements are ordered by the natural order (e.g.: alphabetical for Strings, ascending for Numbers)
        Set<String> names = new TreeSet<>();
        names.add("ionutz");
        names.add("gabriel");
        names.add("baur");
        names.add("cosmin");
        names.add("gabriel");
        names.add("gabriel");

        System.out.println(names);
        System.out.println(names.size());
    }

    private static void linkedHashSetDemo() {
        // similar to HashSet but the elements are sorted by the insertion order (like a List, but with no duplicates)
        Set<String> names = new LinkedHashSet<>();
        names.add("ionutz");
        names.add("gabriel");
        names.add("baur");
        names.add("cosmin");
        names.add("gabriel");
        names.add("gabriel");

        System.out.println(names);
        System.out.println(names.size());
    }

    private static void hashSetDemo() {
        // a high performance Set, does not respect any sorting conditions
        Set<String> names = new HashSet<>();
        names.add("ionutz");
        names.add("gabriel");
        names.add("baur");
        names.add("cosmin");
        names.add("gabriel");
        names.add("gabriel");

        System.out.println(names);
        System.out.println(names.size());
    }

    private static void listDemo() {
        // List allows duplicates, while Set does NOT. Elements are sorted by the insertion order.
        List<String> names = new LinkedList<>();
        names.add("ionutz");
        names.add("gabriel");
        names.add("baur");
        names.add("gabriel");
        names.add("gabriel");

        System.out.println(names);
        System.out.println(names.size());
    }

    private static void iteratorDemo() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(10);
        System.out.println("Initial list: " + list);
        /*Integer integer = 5;
        list.remove(integer);*/

        // works, because we are removing through iterator, not directly from the list
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()) { // while it has elements
            if (integerIterator.next() == 5) { // if next element is 5
                integerIterator.remove(); // remove it
            }
        }

        // error - cannot directly remove from list while iterating through it
        for (Integer element : list) {
            if (element == 5) {
                list.remove(element);
                //list.set(2, 19);
            }
        }

        // error - listSize remains fixed, when removing from list we cannot access all elements in the list anymore - list.get(i) fails with Index out of bounds
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            if (list.get(i) == 5) {
                list.remove(list.get(i));
                //list.set(2, 19);
            }
        }
        System.out.println("Final list: " + list);
    }
}
