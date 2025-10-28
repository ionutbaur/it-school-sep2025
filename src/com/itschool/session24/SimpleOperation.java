package com.itschool.session24;

@FunctionalInterface
public interface SimpleOperation {

    int sumOfStringsLength(String a, String b);

    //String someMethod(int param);

    default void someDefaultMethod() {
        System.out.println("something");
    }
}
