package com.itschool.session21.homework.freqitems;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart1 = new ShoppingCart();
        shoppingCart1.add("laptop");
        shoppingCart1.add("smartphone");
        shoppingCart1.add("tv");

        ShoppingCart shoppingCart2 = new ShoppingCart();
        shoppingCart2.add("tablet");
        shoppingCart2.add("laptop");

        ShoppingCart shoppingCart3 = new ShoppingCart();
        shoppingCart3.add("coffee");
        shoppingCart3.add("laptop");
        shoppingCart3.add("smartphone");

        ECommerce eCommerce = new ECommerce();
        eCommerce.addPurchase(shoppingCart1);
        eCommerce.addPurchase(shoppingCart2);
        eCommerce.addPurchase(shoppingCart3);

        List<String> mostPurchased3Items = eCommerce.getMostFrequentItems(2); // most frequent 2 purchases, sorted by most frequent first
        System.out.println(mostPurchased3Items);

        Set<String> allPurchases = eCommerce.getAllPurchases();
        System.out.println(allPurchases);
    }
}
