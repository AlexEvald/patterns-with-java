package functional.chain.steps;

import functional.chain.Car;
import functional.chain.enums.WashState;

public class DryStep extends CarWashStep {
    @Override
    public Car applyTo(Car car) {
        final Car newCar = car.updateState(WashState.DRIED);
        System.out.println("Car state is " + newCar.getState());
        if(nextStep != null){
            return nextStep.applyTo(newCar);
        }
        return newCar;
    }
}
