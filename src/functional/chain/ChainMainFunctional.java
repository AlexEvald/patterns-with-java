package functional.chain;


import functional.chain.enums.WashState;

import java.util.function.Function;

// This is the Functional approach
public class ChainMainFunctional {

    public static void main(String[] args) {
        final Car car = new Car("Ferrari", "Red", 500);

        final Function<Car,Car> initialFunction = c -> new Car("Ferrari", "Yellow", 500);

//this is not using the custom andThen of CarWashStep but the build in andThen of the Function interface
// also need to mention that the Car that is executing those steps is the Yellow Ferrari not the Red
        final Function<Car,Car> chain = initialFunction
                .andThen(c1 -> c1.updateState(WashState.INITIAL_WASH))
                .andThen(c2 -> c2.updateState(WashState.SOAP))
                .andThen(c3 -> c3.updateState(WashState.RINSED))
                .andThen(c4 -> c4.updateState(WashState.POLISHED))
                .andThen(c5 -> c5.updateState(WashState.DRIED));

        final Car finalCar = chain.apply(car);
        System.out.println("Final car state is " + finalCar.getState());

    }
}
