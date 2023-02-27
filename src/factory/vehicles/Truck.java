package factory.vehicles;

import factory.Vehicle;
import factory.enums.VehicleColor;

public class Truck implements Vehicle {
    private final VehicleColor color;

    public Truck(VehicleColor color) {
        this.color = color;
    }

    public VehicleColor color() {
        return color;
    }
}