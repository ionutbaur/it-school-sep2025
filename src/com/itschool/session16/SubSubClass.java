package com.itschool.session16;

import com.itschool.session16.otherpack.SubClass;

// grandchild
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
