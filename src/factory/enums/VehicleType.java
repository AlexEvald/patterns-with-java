package factory.enums;

import factory.vehicles.Bus;
import factory.vehicles.Car;
import factory.vehicles.Truck;
import factory.Vehicle;

import java.util.function.Function;

public enum VehicleType {
    BUS(Bus::new),
    TRUCK(Truck::new),
    CAR(Car::new);

    public final Function<VehicleColor, Vehicle> factory;

    VehicleType(Function<VehicleColor, Vehicle> factory) {
        this.factory = factory;
    }
}