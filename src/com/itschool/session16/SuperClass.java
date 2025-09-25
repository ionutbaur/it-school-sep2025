package com.itschool.session16;

// parent class for all classes that extend it
public class SuperClass {

    private String somePrivateStr = "private str";
    String someDefaultStr = "default str";
    public int someProtectedNumber = 4;
    public String somePublicStr = "public str";

    public SuperClass(String somePublicStr) {
        this.somePublicStr = somePublicStr;
    }

    public SuperClass(String somePublicStr, int someProtectedNumber, String someDefaultStr, String somePrivateStr) {
        this.somePublicStr = somePublicStr;
        this.someProtectedNumber = someProtectedNumber;
        this.someDefaultStr = someDefaultStr;
        this.somePrivateStr = somePrivateStr;
    }

    protected void someProtectedMethod() {
        System.out.println("Some protected method from SuperClass");
    }

    public void somePublicMethod() {
        System.out.println("Some public method from SuperClass");
    }

    // even though the class is eligible for extension, a final method cannot be overridden by any of subclasses.
    public final void finalMethod() {
        System.out.println("some final method");
    }

    public static void someStaticMethod() {

    }
}
