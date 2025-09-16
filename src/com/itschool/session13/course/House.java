package com.itschool.session13.course;

import java.util.ArrayList;

public class House {

    String color; // not initialized, by default null
    int price = 4; // initialized with 4 (each instance will be created with 'price' as value 4)
    ArrayList<String> materials; // not initialized, by default null
    ArrayList<Window> windows = new ArrayList<>(); // initialized with a new ArrayList (not null) - each instance will be created with 'windows' as a new empty ArrayList

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", materials=" + materials +
                ", windows=" + windows +
                '}';
    }
}
