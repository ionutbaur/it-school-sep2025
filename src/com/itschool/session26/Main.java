package com.itschool.session26;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        String name = null;
        //String name = "ionutz"; // uncomment this line and comment the above for playing
        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println("is the Optional empty (value null)?: " + optionalName.isEmpty());
        System.out.println("is the Optional present (value NOT null)?: "+ optionalName.isPresent());

        boolean isStringNull = Optional.ofNullable(name).isEmpty();
        System.out.println("is the Optional empty (value null) using chained isEmpty?: " + isStringNull);

        String myName = Optional.ofNullable(name) // handle potential null value for 'name'
                .orElse("unknown"); // return its value if not null, otherwise returns "unknown"
        System.out.println("myName is: " + myName);

        Integer nameLength = Optional.ofNullable(name) // handle potential null value for String 'name'
                .map(String::length) // if Optional is present (value not null) then map to its length (reference length method from String class)
                .orElse(0); // if Optional is NOT present (empty Optional/ null value) then return 0.
                //.orElseThrow();
        System.out.println("name length is: " + nameLength);
    }
}
