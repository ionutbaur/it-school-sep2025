package com.itschool.session24;

public class SimpleOperationImpl implements SimpleOperation {

    @Override
    public int sumOfStringsLength(String a, String b) {
        return a.length() + b.length();
    }

    /*@Override
    public String someMethod(int param) {
        return "ceva";
    }*/
}
