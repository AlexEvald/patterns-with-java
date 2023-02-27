package factory.vehicles;

import factory.Vehicle;
import factory.enums.VehicleColor;

public class Bus implements Vehicle {
    private final VehicleColor color;

    public Bus(VehicleColor color) {
        this.color = color;
    }

    public VehicleColor color() {
        return color;
    }
}
