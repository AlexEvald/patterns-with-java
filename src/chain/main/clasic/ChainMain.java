package chain.main.clasic;


import chain.Car;
import chain.steps.*;

/****
 * This pattern is very useful when we have to do different operations on an object in a given order, like a chain factory.
 * The non-chain.main.functional way of implementing this pattern implied creating different classes, in a similar way to Strategy pattern.
 * This used to be a bit verbose, and it adds unnecessary complexity to our code.
 */
public class ChainMain {

    public static void main(String[] args) {

        System.out.println("Hello Chain Pattern");

        final Car car = new Car("Jeep","Black",140);

        final CarWashStep chain = new InitialWashStep();

        chain.andThen(new SoapStep())
                .andThen(new RinseStep())
                .andThen(new PolishStep())
                .andThen(new DryStep());

        final Car finalCar = chain.applyTo(car);

        System.out.println("Final car state is " + finalCar.getState());

    }

}
