package com.itschool.session17.course.interfaces;

import com.itschool.session17.course.interfaces.otherpack.MyFirstInterf;

public class MyFirstInterfImpl implements MyFirstInterf {

    @Override
    public void someMethod() {
        System.out.println("some method impl");
    }

    @Override
    public String someMethodWithParam(int a) {
        return "ionutz" + a;
    }
}
