package com.itschool.session16.immutability;

import java.util.ArrayList;

public record MyFirstRecord(int age, String name, boolean isNice, ArrayList<String> list) {

    public void someMethod() {

    }
}
