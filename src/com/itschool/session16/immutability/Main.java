package com.itschool.session16.immutability;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass("ionutz", "gabriel");
        System.out.println(immutableClass);
        /*System.out.println(immutableClass.getField1());
        System.out.println(immutableClass.getField2());*/
        immutableClass.printFields();
        System.out.println("Field1 is: " + immutableClass.getField1());

        System.out.println("================ hacking");
        //ImmutableClass immutableClass2 = new HackingClass("abc", "def");
        HackingClass immutableClass2 = new HackingClass("abc", "def");
        /*System.out.println(immutableClass2.getField1());
        System.out.println(immutableClass2.getField2());*/

        MyFirstRecord myFirstRecord = new MyFirstRecord(10, "ionutz", true, new ArrayList<>());
        System.out.println(myFirstRecord);
        System.out.println(myFirstRecord.age());
        System.out.println(myFirstRecord.isNice());
        System.out.println(myFirstRecord.name());
        myFirstRecord.someMethod();
    }
}
