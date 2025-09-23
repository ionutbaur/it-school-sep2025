package com.itschool.session14.course;

import com.itschool.session13.course.House;

import java.util.ArrayList;

public class MainSession14 {

    public static void main(String[] args) {
        System.out.println(House.ROOF);

        House house = new House();
        System.out.println("Color of house: " + house.color);
        // house.privateMethod(); not working because can be invoked only in "House" class
        // house.defaultMethod(); not working because in different package: the class "House owning this method is in package com.itschool.session13.course, while this class "MainSession14" is in package com.itschool.session14.course
        // house.protectedMethod(); not working invoking from an instance of "House", even though MainSession14 extends House, see below

        //house.publicMethod(); // works because the method is public

        House house2 = new House("yellow", 300);
        System.out.println("Color of house2: " + house2.color);

        House house3 = new House("blue", 500);
        System.out.println("Color of house3: " + house3.color);

        House myHouse = new House("red", 1000, new ArrayList<>());
        myHouse.color = "white";

        System.out.println(myHouse.color);


    }
}
