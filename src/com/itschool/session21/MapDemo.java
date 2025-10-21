package com.itschool.session21;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        //hashMapDemo();
        //linkedHashMap();
        //treeMap();
        List<String> names = List.of("ionutz", "gabriel", " baur");
        // names.add("alina"); won't work because List.of returns an immutable map, thus it prohibits its modification of any kind
        //System.out.println(names);

        Map<Set<String>, Set<Integer>> map = new HashMap<>();
        Set<String> stringSet = Set.of("ionutz");
        Set<Integer> integerSet = Set.of(12);

        map.put(stringSet, integerSet);

        Map<Long, String> cnpMap = Map.of(
                1234567890L, "ionutz", // entry
                987654321L, "gabriel", //entry
                1234567890L, "baur" // duplicate key - Map.of does not allow it and error happens.
                // Other Maps such as HashMap allows putting duplicate keys, but it automatically removes them, keeping the most recent updated ones.
        );
        System.out.println(cnpMap);
    }

    private static void treeMap() {
        // a sorted Map - entries are ordered by the natural order of the keys (e.g.: alphabetical for Strings, ascending for Numbers)
        Map<Long, String> cnpMap = new TreeMap<>();
        cnpMap.put(1234567890L, "ionutz");
        cnpMap.put(987654321L, "gabriel");
        cnpMap.put(12345L, "baur");
        cnpMap.put(987654321L, "laurentiu");
        cnpMap.put(987654321L, "alina");
        cnpMap.put(987654321L, "cosmin");
        System.out.println(cnpMap);
    }

    private static void linkedHashMap() {
        // similar to HashMap but the entries are sorted by the insertion order of the keys.
        Map<Long, String> cnpMap = new LinkedHashMap<>();
        cnpMap.put(123456789L, "ionutz");
        cnpMap.put(987654321L, "gabriel");
        cnpMap.put(12345L, "baur");
        cnpMap.put(987654321L, "laurentiu");
        cnpMap.put(987654321L, "alina");
        cnpMap.put(987654321L, "cosmin");
        System.out.println(cnpMap);
    }

    private static void hashMapDemo() {
        // a high performance Map, does not respect any sorting conditions. The keys are unique, the values can be the same.
        // key-cnp, value-name
        Map<Long, String> cnpMap = new HashMap<>();
        cnpMap.put(123456789L, "ionutz"); // key: 123456789L (type Long), value: "ionutz" (type String)
        cnpMap.put(987654321L, "gabriel");
        cnpMap.put(12345L, "baur");
        cnpMap.put(987654321L, "laurentiu");
        cnpMap.put(987654321L, "alina");
        cnpMap.put(987654321L, "cosmin");
        //cnpMap.remove(987654321L);

        // each key-value pair (entry) in the Map is a 'Map.Entry' object. Iterate through the full entries
        for (Map.Entry<Long, String> entry : cnpMap.entrySet()) { // all the entries in a Map represent an entrySet of type Set
            System.out.println(entry.getKey()); // access the key (left side) of the entry
            System.out.println(entry.getValue()); // access the value (right side) of the entry
            System.out.println("===============");
        }

        // iterate only through the keys of the Map - a keySet of type Set
        for (Long cnp : cnpMap.keySet()) {
            System.out.println(cnp);
        }

        // iterate only through the values of the Map - values of type Collection (a more abstract layer than List/Set etc)
        for (String name : cnpMap.values()) {
            System.out.println(name);
        }

        System.out.println(cnpMap);
    }
}
