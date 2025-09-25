package com.itschool.session16;

public /*static*/ class TentativeStaticClass { // cannot have an outer class as static

    // inner class (class belonging to the "normal"/outer class TentativeStaticClass) - can be static and have any access modifier
    private static class SomePrivateStaticClass {

    }
}
