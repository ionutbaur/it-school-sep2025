package com.itschool.session39.singleton.eager;

public class MainEagerSingleton {

    public static void main(String[] args) throws ClassNotFoundException {
        // load the class in memory without using it - is will create the instance
        // Class.forName("com.itschool.session39.singleton.eager.EagerSingleton");

        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton3 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton1);
        System.out.println(eagerSingleton2);
        System.out.println(eagerSingleton3);

        eagerSingleton2.displayMessage();
    }
}
