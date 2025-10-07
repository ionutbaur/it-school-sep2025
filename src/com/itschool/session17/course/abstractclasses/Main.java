package com.itschool.session17.course.abstractclasses;

import com.itschool.session17.course.abstractclasses.otherpack.DieselCarValet;
import com.itschool.session17.course.abstractclasses.otherpack.GasolineCarValet;

public class Main {

    public static void main(String[] args) {
        // Valet valet = new Valet(); won't work because Valet is abstract
        // valet.takeCareOfCar();

        Valet valet1 = new DieselCarValet();
        valet1.fuelCar();
        valet1.takeCareOfCar();
        System.out.println("============");
        Valet valet2 = new GasolineCarValet();
        valet2.takeCareOfCar();

        System.out.println("Is valet2 instance of Valet: " + (valet2 instanceof Valet));
        System.out.println("Is valet2 instance of GasolineCarValet: " + (valet2 instanceof GasolineCarValet));
        System.out.println("Is valet1 instance of Valet: " + (valet1 instanceof Valet));
        System.out.println("Is valet1 instance of DieselCarValet: " + (valet1 instanceof DieselCarValet));

        System.out.println("Is valet1 instance of GasolineCarValet: " + (valet1 instanceof GasolineCarValet));

        boolean isInstance = valet2 instanceof Valet;
    }
}
