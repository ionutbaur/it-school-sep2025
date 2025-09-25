package com.itschool.session16.otherpack;

import com.itschool.session16.SuperClass;

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


    // not working because the method is final
    /*public void finalMethod() {
        System.out.println("some final method");
    }*/

    public static void someStaticMethod() {
        SuperClass.someStaticMethod();
    }
}
