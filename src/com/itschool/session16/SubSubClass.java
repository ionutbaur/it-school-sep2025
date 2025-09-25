package com.itschool.session16;

import com.itschool.session16.otherpack.SubClass;

// child class of SubClass (meaning SubClass is super for this class), "grandchild" class of SuperClass
public final class SubSubClass extends SubClass {

    public boolean someProtectedNumber = true;

    public SubSubClass() {
        super("ionutz");
    }

    public void someMethod() {
        System.out.println(this.someProtectedNumber);
        System.out.println(super.someProtectedNumber);
        System.out.println(getSuperSomeProtectedNumber());
    }
}
