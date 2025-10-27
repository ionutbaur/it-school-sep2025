package com.itschool.session21.homework.freqitems;

import java.util.*;

public class ECommerce {

    // a list of shopping carts - see challenge description
    private final List<ShoppingCart> shoppingHistory = new ArrayList<>();
    private final Map<String, Integer> frequencyMap = new HashMap<>(); // key - product, value - frequency

    // keep track of purchases by storing the frequency of each bought item
    public void addPurchase(ShoppingCart shoppingCart) {
        shoppingHistory.add(shoppingCart);
        for (String item : shoppingCart) { // shopping cart is a list (extends LinkedList), thus we can iterate over it
            int itemFrequency = frequencyMap.getOrDefault(item, 0); // retrieve the current frequency of the item
            frequencyMap.put(item, ++itemFrequency); // increment the frequency in the map
        }
    }

    public List<String> getMostFrequentItems(int desiredFrequency) {
        Set<Map.Entry<String, Integer>> entrySet = frequencyMap.entrySet(); // retrieve the entry set from map
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet); // convert to list so we can easily sort it
        Comparator<Map.Entry<String, Integer>> valueComparator = Map.Entry.comparingByValue(); // comparator to sort by map value (frequency)
        entryList.sort(valueComparator.reversed()); // sort the list in descending order of frequency (most frequent first)

        List<String> mostFrequentItems = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entryList) { // iterate over sorted entries
            int itemFrequency = entry.getValue();
            if (itemFrequency >= desiredFrequency) { // check if item frequency meets the desired threshold (higher or equal)
                mostFrequentItems.add(entry.getKey()); // add the item to the result list
            }
        }

        return mostFrequentItems;
    }

    public Set<String> getAllPurchases() { // all unique (Set) purchased items
        Set<String> allPurchases = new HashSet<>();
        for (ShoppingCart shoppingCart : shoppingHistory) {
            allPurchases.addAll(shoppingCart); // shopping cart is a List, thus a Collection, thus we can add all its items to the Set
        }

        return allPurchases;
    }
}
