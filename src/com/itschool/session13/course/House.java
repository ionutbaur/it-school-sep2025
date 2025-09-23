package com.itschool.session13.course;

import java.util.ArrayList;

public class House {

    // breaks the Encapsulation principle - its instance fields are not private
    static String name; // default null, but once initialized in any form (instance or not), it keeps its value in memory (does not reset on each instance)
    public static final String ROOF = "tigla metalica"; //constant accessible everywhere (public)
    public String color; // not initialized, by default null
    int price = 4; // initialized with 4 (each instance will be created with 'price' as value 4)
    ArrayList<String> materials; // not initialized, by default null
    ArrayList<Window> windows = new ArrayList<>();

    // explicit constructor - no-arg constructor
    public House() {
        System.out.println("Instance of house constructed!");
    }

    public House(String color, int price) {
        System.out.println("House with color and price constructed!");
        this.color = color;
        this.price = price;
    }

    public House(String color, int price, ArrayList<Window> windows) {
        /*this.color = color;
        this.price = price;*/
        this(color, price);
        this.windows = windows;
    }

    // initialized with a new ArrayList (not null) - each instance will be created with 'windows' as a new empty ArrayList

    // static - NOT instance specific, does not need an instance
    static void staticMethod() {
        //color = "red"; // doesn't work, doesn't know who's instance 'color' to handle
        //checkAttributes(); // doesn't work, doesn't know who's instance 'checkAttributes()' method to handle
    }

    static void staticMethod2() {
        staticMethod(); // works, staticMethod2 and staticMethod are both static (don't require an instance)
    }

    public static int computeArea(int length, int width) {
        return length * width;
    }

    void checkAttributes() {
        staticMethod(); // works - even though checkAttributes() is instance specific, it doesn't care if we reference something not related to its instance
        if (color == null) {
            System.out.println("color is null");
        } else {
            System.out.println("color is: " + color);
        }

        System.out.println("===============");

        if (name == null) {
            System.out.println("name is null");
        } else {
            System.out.println("name is: " + name);
        }
    }

    void openWindows() {
        System.out.println("I opened the windows");
    }

    public void increasePrice(int percentage) {
        double percent = (double) percentage / 100;
        price += price * percent;
    }

    private String houseLightning() {
        if (windows == null || windows.isEmpty()) {
            //System.out.println("dark house");
            String dark = "dark house";
            return dark; // redundant, may return directly literal "dark house"
        } else if (windows.size() == 1) {
            //System.out.println("ok light house");
            return "ok light house"; // return directly the String (literal in this case)
        } else { // windows.size > 1
            //System.out.println("nice light house");
            return "nice light house";
        }
    }

    boolean isHouseIlluminated() {
        String houseLight = houseLightning();
        return !"dark house".equals(houseLight);
    }

    // available only in this class
    private void privateMethod() {

    }

    // available only in this package: com.itschool.session13.course
    void defaultMethod() {
        // named also package-private method
    }

    // available in this package: com.itschool.session13.course and in the subclasses extending this class (if the case)
    protected void protectedMethod() {

    }

    // available everywhere - across all classes in the project
    public void publicMethod() {
        System.out.println("publicMethod invoked");
    }

    @Override
    public String toString() {
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
        return "House{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", materials=" + materials +
                ", windows=" + windows +
                '}';
    }
}
