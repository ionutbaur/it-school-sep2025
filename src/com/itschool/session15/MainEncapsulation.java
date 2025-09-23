package com.itschool.session15;

import com.itschool.session13.course.Main;
import com.itschool.session13.course.Window;

public class MainEncapsulation {

    public static void main(String[] args) {
        Window window = Main.createWindow(false,
                false, -7, 0, null);
        System.out.println(window.getLength()); // retrieving the length through encapsulation - getter method
    }
}
