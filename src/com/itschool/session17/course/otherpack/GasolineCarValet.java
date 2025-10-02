package com.itschool.session17.course.otherpack;

import com.itschool.session17.course.Valet;

public class GasolineCarValet extends Valet {

    public GasolineCarValet() {
        super("GasolineCarValet");
    }

    @Override
    public void fuelCar() {
        System.out.println("Fuel the car with gasoline!");
    }
}
