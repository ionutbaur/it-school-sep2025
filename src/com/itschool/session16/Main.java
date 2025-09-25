package com.itschool.session16;

import com.itschool.session16.otherpack.SubClass;

public class Main {

    public static void main(String[] args) {
        //basicInheritance();

        SubClass subClass = new SubClass("gabriel");
        subClass.someLogic();
        subClass.somePublicMethod();
        subClass.wrapperSuperSomePublicMethod();

        System.out.println("=========");
        SubSubClass subSubClass = new SubSubClass();
        subSubClass.someMethod();
    }

    private static void basicInheritance() {
        SuperClass superClass = new SuperClass("baur");
        System.out.println(superClass.someProtectedNumber);
        System.out.println(superClass.someDefaultStr);
        // superClass.someSubClassStr; does not work

        SubClass subClass = new SubClass("gabriel");
        System.out.println("someProtectedNumber from subClass: " + subClass.someProtectedNumber);
        System.out.println(subClass.somePublicStr);
        System.out.println(subClass.someSubClassStr);
        // System.out.println(subClass.someDefaultStr); does not work

        subClass.someProtectedMethod();
        subClass.somePublicMethod();
    }
}
