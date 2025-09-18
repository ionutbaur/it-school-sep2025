package com.itschool.session14.course;

import com.itschool.session13.course.House;

public class MainSession14 extends House {

    public static void main(String[] args) {
        House house = new House();
        // house.privateMethod(); not working because can be invoked only in "House" class
        // house.defaultMethod(); not working because in different package: the class "House owning this method is in package com.itschool.session13.course, while this class "MainSession14" is in package com.itschool.session14.course
        // house.protectedMethod(); not working invoking from an instance of "House", even though MainSession14 extends House, see below

        MainSession14 mainSession14 = new MainSession14();
        mainSession14.protectedMethod(); // only in this case works, only in "family" - automatically inherits the method from superclass "House"

        house.publicMethod(); // works because the method is public

        System.out.println(House.ROOF);
    }
}
