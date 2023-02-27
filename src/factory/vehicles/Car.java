package factory.vehicles;

import factory.Vehicle;
import factory.enums.VehicleColor;

public class Car implements Vehicle {
    private final VehicleColor color;

    public Car(VehicleColor color) {
        this.color = color;
    }

    public VehicleColor color() {
        return color;
    }
}