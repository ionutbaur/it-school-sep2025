package com.itschool.session39.singleton;

public class NonSingletonMain {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
