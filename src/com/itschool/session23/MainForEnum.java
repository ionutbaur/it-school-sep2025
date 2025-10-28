package com.itschool.session23;

import java.time.Month;

public class MainForEnum {

    public static void main(String[] args) {
        /*System.out.println(Season.WINTER);
        System.out.println(Season.SPRING);*/

        Season[] seasons = Season.values(); // all values of the enum as array
        for (Season season : seasons) {
            System.out.println(season);
        }

        Season mySeason = Season.valueOf("SPRING"); // will return Season.SPRING enum value
        System.out.println(mySeason.getNiceName());
        System.out.println(mySeason.getMonths());

        Season spring = Season.SPRING;
        Month jan = Month.JANUARY;

        System.out.println("================");
        System.out.println("Comparing enums:");
        System.out.println(Season.SPRING.equals("SPRING")); // compiles, but returns false - enum Season.SPRING different from String "SPRING"
        // System.out.println(Season.SPRING == "SPRING"); // does not compile - operator '==' can be applied only on same types
        System.out.println(mySeason.equals("SPRING")); // compiles, but returns false - mySeason is Season.SPRING (different type)
        System.out.println(Season.SPRING == spring); // compiles and returns true - both are Season.SPRING (and same index in Season.values() array)
        System.out.println(mySeason == spring); // compiles and returns true - both have the value Season.SPRING
        System.out.println(spring.equals(jan)); // compiles, but returns false - enum Season.SPRING different from enum Month.JANUARY
        // System.out.println(spring == jan); // does not compile - operator '==' can be applied only on same types - we try to compare different types of enums
        System.out.println(spring == null); // compiles and returns false - spring is not null, but has the value Season.SPRING

        Season nullSeason = null;
        System.out.println(nullSeason == null); // compiles and returns true - nullSeason has the value null
    }
}
