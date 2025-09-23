package com.itschool.session13.course;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int x = 0; // primitive variable
        String name = "ionutz"; // object (String) variable
        String name2 = new String("ionutz"); // object (String) instance of a new String
        List<String> list = new ArrayList<>();

        House myHouse = new House();
        String myHouseColor = myHouse.color;
        System.out.println(myHouseColor);
        System.out.println("My house had the initial color: " + myHouse.color);
        System.out.println(myHouse.price);

        System.out.println("=======================");
        myHouse.color = "Blue";
        System.out.println("I painted my house in: " + myHouse.color);

        myHouse.price = 100;
        System.out.println("my house hase the new price: " + myHouse.price);

        ArrayList<Window> myHouseWindows = new ArrayList<>();

        Window seaViewWindow = createWindow(true,
                false, 100, 50, "Green");
        myHouseWindows.add(seaViewWindow); // add in list

        Window mountainViewWindow = createWindow(false,
                true, 0, 0, "Red");
        myHouseWindows.add(mountainViewWindow); // add in list

        Window nullWindow = createWindow(false,
                false, 0, 0, null);
        myHouseWindows.add(nullWindow); // add in list

        Window negativeLengthWindow = createWindow(false,
                false, -7, 0, null);
        myHouseWindows.add(negativeLengthWindow);

        System.out.println("====================");
        System.out.println(myHouseWindows);
        System.out.println(mountainViewWindow.getColor());
        System.out.println(mountainViewWindow.getLength());
        System.out.println(seaViewWindow.getLength());

        System.out.println(myHouse);
        myHouse.windows.addAll(myHouseWindows);
        System.out.println("My house has the following windows: " + myHouse.windows);

        System.out.println("Printing the colors of all windows in the house");
        for (Window window : myHouse.windows) {
            if (window.getColor() == null) {
                System.out.println("No color");
            } else {
                System.out.println(window.getColor());
            }
        }

        myHouse.openWindows();
        System.out.println("=======================");
        System.out.println("Price before increase: " + myHouse.price);
        myHouse.increasePrice(30);
        System.out.println("Price after increase: " + myHouse.price);
        myHouse.increasePrice(100);
        System.out.println(myHouse.price);
        System.out.println("==================");
        //myHouse.houseLightning();
        boolean illuminated = myHouse.isHouseIlluminated();
        System.out.println("Is my house illuminated?: " + illuminated);

        House neigboursHouse = new House();
        System.out.println("Is neigbour house illuminated?: " + neigboursHouse.isHouseIlluminated());

        // myHouse.privateMethod(); not working
        myHouse.defaultMethod();
        myHouse.protectedMethod();
        myHouse.publicMethod();

        myHouse.color = "Yellow";
        House.name = "My house";
        System.out.println("printing checkAttributes for myHouse");
        myHouse.checkAttributes();

        System.out.println("==============");
        System.out.println("printing checkAttributes for neigboursHouse");
        neigboursHouse.checkAttributes();

        System.out.println(House.ROOF);
        //someMethod(); doesn't work - the "main" method in this class is static (not instance related), while someMethod() is not static (is instance dependent).
        House.staticMethod();
        int area = House.computeArea(100, 50);
        System.out.println(area);
    }

    public static Window createWindow(boolean areVedereLaMare,
                                      boolean areVedereLaMunte,
                                      int lungime,
                                      int latime,
                                      String culoare) {
        Window window = new Window();
        window.setHasSeeView(areVedereLaMare);
        window.setWidth(latime);
        window.setLength(lungime);
        window.setColor(culoare);
        window.setHasMountainView(areVedereLaMunte);

        return window;
    }

    void someMethod() {
        // not static method, meaning instance method - requires an instance of this "Main" class in order to be able to invoke it
    }
}
