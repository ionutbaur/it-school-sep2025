package com.itschool.session17.course;

public abstract class Valet {

    private final String name;

    protected Valet(String name) {
        this.name = name;
    }

    public final void parkCar() {
        System.out.println("Parked the care like a pro");
    }

    private void washCar() {
        System.out.println("Wash the car with bubble foam");
    }

    protected abstract void fuelCar();

    public void takeCareOfCar() {
        parkCar();
        washCar();
        fuelCar();
    }
}
