package com.itschool.session17.course.interfaces;

import com.itschool.session17.course.interfaces.otherpack.MyFirstInterf;

public class Main {

    public static void main(String[] args) {
        System.out.println(MyFirstInterf.SOME_VAR);
        System.out.println(MyFirstInterf.SOME_TEXT);
        System.out.println("===============");

        MyFirstInterf myFirstInterf = new MyFirstInterfImpl();
        myFirstInterf.someMethod();
        System.out.println(myFirstInterf.someMethodWithParam(4));
    }
}
