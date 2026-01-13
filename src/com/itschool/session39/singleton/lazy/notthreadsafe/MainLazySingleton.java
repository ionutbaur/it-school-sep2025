package com.itschool.session39.singleton.lazy.notthreadsafe;

public class MainLazySingleton {

    public static void main(String[] args) throws ClassNotFoundException {
        // load the class in memory without using it - is will NOT create the instance
        Class.forName("com.itschool.session39.singleton.lazy.notthreadsafe.LazySingleton");

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        LazySingleton lazySingleton3 = LazySingleton.getInstance();

        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);
        System.out.println(lazySingleton3);

        lazySingleton2.displayMessage();
    }
}
