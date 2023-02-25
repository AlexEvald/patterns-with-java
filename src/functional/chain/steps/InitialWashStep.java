package functional.chain.steps;

import functional.chain.Car;
import functional.chain.enums.WashState;

public class InitialWashStep extends CarWashStep {


    @Override
    public Car applyTo(Car car) {
        final Car newCar = car.updateState(WashState.INITIAL_WASH);
        if(nextStep != null){
            return nextStep.applyTo(newCar);
        }
        return newCar;
    }
}
