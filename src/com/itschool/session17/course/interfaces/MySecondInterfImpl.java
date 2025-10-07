package com.itschool.session17.course.interfaces;

import com.itschool.session17.course.interfaces.otherpack.MyFirstInterf;

public class MySecondInterfImpl implements MyFirstInterf {

    @Override
    public void someMethod() {
        System.out.println("some method in MySecondInterfImpl");
    }

    @Override
    public String someMethodWithParam(int a) {
        return "gabriel";
    }
}
