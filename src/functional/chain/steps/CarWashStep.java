package functional.chain.steps;

import functional.chain.Car;

public abstract class CarWashStep {
    protected CarWashStep nextStep;

    public CarWashStep andThen(CarWashStep nextStep){
        this.nextStep=nextStep;
        return nextStep;
    }

    public abstract Car applyTo(Car car);

}
