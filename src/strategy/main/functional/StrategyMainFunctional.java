package strategy.main.functional;


import strategy.Item;
import strategy.enums.Plan;

import java.math.BigDecimal;

/***
 * Strategy pattern is probably one of the most widely used design patterns;
 * it’s normally used in every situation where we have to choose a different behaviour based on some property or input.
 *
 * The only problem with the “old way” of writing a Strategy pattern is that in many cases we have to create a lot of classes and boilerplate code;
 * this could make sense when these classes hold complex logic, but in many cases they’re even too simple to become a class!
 */
public class StrategyMainFunctional {

    public static void main(String[] args) {

        //Functional style
        final Item item = new Item(1L, new BigDecimal("12.99"));
        System.out.println("Basic Delivery price is " + Plan.BASIC.deliveryPrice.apply(item));
        System.out.println("Premium Delivery price is " + Plan.PREMIUM.deliveryPrice.apply(item));
        System.out.println("Business Delivery price is " + Plan.BUSINESS.deliveryPrice.apply(item));
    }
}
