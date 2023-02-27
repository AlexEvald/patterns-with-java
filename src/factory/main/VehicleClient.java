package factory.main;

import factory.OldStyleVehicleFactory;
import factory.Vehicle;
import factory.enums.VehicleColor;
import factory.enums.VehicleType;

public class VehicleClient {

    public static void main(String[] args) {
        final Vehicle redCar = VehicleType.CAR.factory.apply(VehicleColor.RED);
        final Vehicle redCar2 = OldStyleVehicleFactory.instanceOfType(VehicleType.CAR, VehicleColor.RED);

        final Vehicle blackTruck = VehicleType.TRUCK.factory.apply(VehicleColor.BLACK);

        final Vehicle blueBus = VehicleType.BUS.factory.apply(VehicleColor.BLUE);


        /*
         * Template method pattern
         * Template method is a pattern that allows us to define some common steps for an algorithm and then
         * the subclasses override some of these steps with their specific behaviours for a particular step.
         */
        blueBus.start(nil -> {
            System.out.println("Check if every new passenger has paid for their tickets");
            System.out.println("Check if every passenger is seated");
        });
    }

}