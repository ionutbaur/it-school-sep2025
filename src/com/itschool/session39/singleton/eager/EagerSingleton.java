package com.itschool.session39.singleton.eager;

public class EagerSingleton {

    // eager create the instance when the class is loaded in memory - ensures thread-safety
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Calling EagerSingleton constructor");
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public void displayMessage() {
        System.out.println("Hello from a method in EagerSingleton");
    }
}
