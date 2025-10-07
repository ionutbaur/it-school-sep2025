package com.itschool.session17.course.interfaces.otherpack;

public interface MyFirstInterf {

    // constants
    int SOME_VAR = 7;
    String SOME_TEXT = "ionutz";

    // doesn't mean it has default access modifier!
    // methods are public
    void someMethod();

    String someMethodWithParam(int a);
}
