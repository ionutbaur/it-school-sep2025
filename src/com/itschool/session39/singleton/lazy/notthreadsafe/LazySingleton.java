package com.itschool.session39.singleton.lazy.notthreadsafe;

public class LazySingleton {

    // start with no instance
    private static LazySingleton INSTANCE;

    private LazySingleton() {
        System.out.println("Calling LazySingleton constructor");
    }

    // ensure thread-safety by making the method 'synchronized', but sometimes might reduce performance
    public static /*synchronized*/ LazySingleton getInstance() {
        System.out.println("=== getInstance called");
        if (INSTANCE == null) { // first time called, create the instance when this method is invoked (lazy) and keep it in the memory (static)
            System.out.println("First time initialize");
            INSTANCE = new LazySingleton();
        }

        return INSTANCE;
    }

    public void displayMessage() {
        System.out.println("Hello from a method in LazySingleton");
    }
}
