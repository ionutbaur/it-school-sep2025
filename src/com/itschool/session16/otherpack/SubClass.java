package com.itschool.session16.otherpack;

import com.itschool.session16.SuperClass;

// child class of SuperClass and parent for classes that extend it
public class SubClass extends SuperClass {

    public String someProtectedNumber = "10 as string";

    public String someSubClassStr = someProtectedNumber + "string from subclass";

    public SubClass(String somePublicStr) {
        super(somePublicStr);
    }

    public void someLogic() {
        System.out.println("someProtectedNumber: " + someProtectedNumber);
        System.out.println("This someProtectedNumber: " + this.someProtectedNumber);
        System.out.println("Super someProtectedNumber: " + super.someProtectedNumber);
    }

    public int getSuperSomeProtectedNumber() {
        this.somePublicMethod();
        super.somePublicMethod();
        return 0;
    }

    public void wrapperSuperSomePublicMethod() {
        super.somePublicMethod();
    }

    @Override
    public void somePublicMethod() {
        System.out.println("Some public method from SubClass");
        //super.somePublicMethod();
    }


    // cannot override because the method is final in super class
    /*public void finalMethod() {
        System.out.println("some overridden final method");
    }*/

    // not considered overridden, but redeclare
    public static void someStaticMethod() {
        System.out.println("some different logic");
        // super.someStaticMethod(); 'super' won't work here because is instance specific and is referenced from a static context
        SuperClass.someStaticMethod(); // correct way of calling static method (regardless if it is a super class or not)
    }
}
