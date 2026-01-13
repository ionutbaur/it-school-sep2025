package com.itschool.session39.singleton.lazy.threadsafe;

// a lazy thread-safe singleton, very performant
public class BillPughSingleton {

    private BillPughSingleton() {
        System.out.println("Calling BillPughSingleton constructor");
    }

    // define a static inner class that holds the instance, guarantying thread-safety
    private static class SingletonHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        System.out.println("=========calling getInstance");
        return SingletonHolder.INSTANCE;
    }

    public void displayMessage() {
        System.out.println("Hello from a method in BillPughSingleton");
    }
}
