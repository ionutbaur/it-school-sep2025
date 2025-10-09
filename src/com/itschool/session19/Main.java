package com.itschool.session19;

import com.itschool.session18.Car;
import com.itschool.session18.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Object vehicleAsObject = vehicle; // 'vehicleAsObject' follows now the 'Object' blueprint, meaning we can apply only the fields and methods of 'Object' class. The ones of 'Vehicle' are lost.

        // Vehicle vehicle2 = vehicleAsObject; // won't compile without casting to the desired type 'Vehicle', even tough it is obvious it is the same instance
        Vehicle vehicle2 = (Vehicle) vehicleAsObject; // apply casting and have the desired Vehicle type
        vehicle2.start();

        System.out.println("=========");

        Car car = new Car(); // instance of 'Car' (right side)
        // Car IS-A Vehicle
        Vehicle carVehicle = car; // 'car' is an instance of 'Car', therefore 'carVehicle' references a 'Car' instance, but of type 'Vehicle'
        if (carVehicle instanceof Car) { // true - Car IS-A Vehicle
            Car castCarVehicle = (Car) carVehicle; // works because 'carVehicle' it is actually a reference to a 'Car' instance - see line 20
        }

        Vehicle vehicle3 = new Vehicle(); // instance of 'Vehicle'
        // recommended to check instance before applying the cast
        if (vehicle3 instanceof Car) { // false - Vehicle IS NOT a Car
            Car car2 = (Car) vehicle3; // compiles because 'Vehicle' and 'Car' are related (same family/inheritance chain),
            // but fails at runtime because Vehicle is not a Car
        }

        // with newer Java versions we can use pattern variable instead of cast
        if (vehicle3 instanceof Car carInstance) {
            Car car2 = carInstance;
        }

        //String str = (String) new Vehicle(); // won't work because String and Vehicle are unrelated
    }
}
