package strategy.main.classic;


import strategy.DeliveryPriceCalculator;
import strategy.Item;
import strategy.PriceCalculatorFactory;
import strategy.enums.ClassicPlan;

import java.math.BigDecimal;

/***
 *The Strategy pattern in Java is a behavioral design pattern that allows you to define a family of algorithms,
 *  encapsulate each one as an object, and make them interchangeable at runtime.
 *  In other words, it enables you to define a set of behaviors (strategies) and make them interchangeable depending on the specific needs of your application.
 * The key idea behind the Strategy pattern is to separate the behavior of an object from its implementation.
 * This means that the behavior can be changed without affecting the object itself, making the code more flexible and easier to maintain.
 * To implement the Strategy pattern in Java, you typically start by defining an interface or abstract class that represents the behavior you want to encapsulate.
 * You then create concrete classes that implement this interface or extend the abstract class, representing different strategies.
 * Finally, you create a context class that uses an instance of the interface or abstract class to execute the appropriate strategy at runtime.
 * Overall, the Strategy pattern can be a useful tool for making your code more modular,
 * extensible, and maintainable,
 * especially when you need to support multiple algorithms or behaviors within your application.
 */
public class StrategyMain {

    public static void main(String[] args) {

        final PriceCalculatorFactory factory = new PriceCalculatorFactory();

        // Classic style
        final Item newItem = new Item(1L, new BigDecimal("12.99"));
        final DeliveryPriceCalculator priceCalculator = factory.priceCalculatorFor(ClassicPlan.PREMIUM);
        System.out.println("Delivery price is " + priceCalculator.priceFor(newItem));

    }

}
