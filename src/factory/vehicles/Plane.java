package factory.vehicles;


import factory.AbstractVehicle;

public class Plane extends AbstractVehicle {
    @Override
    protected void preStartCheck() {
        System.out.println("Checking that doors are properly closed!");
    }
}
