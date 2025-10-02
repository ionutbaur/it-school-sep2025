package com.itschool.session17.course.otherpack;

import com.itschool.session17.course.Valet;

public class DieselCarValet extends Valet {

    public DieselCarValet() {
        super("DieselCarValet");
    }

    @Override
    public void fuelCar() {
        System.out.println("Fuel the care with diesel.");
    }
}
