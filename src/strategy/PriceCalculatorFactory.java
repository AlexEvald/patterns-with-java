package strategy;

import strategy.calculator.BasicDeliveryPriceCalculator;
import strategy.calculator.BusinessDeliveryPriceCalculator;
import strategy.calculator.PremiumDeliveryPriceCalculator;
import strategy.enums.ClassicPlan;

public class PriceCalculatorFactory {

    public DeliveryPriceCalculator priceCalculatorFor(ClassicPlan plan) {
        if (plan.equals(ClassicPlan.BASIC)) {
            return new BasicDeliveryPriceCalculator();
        } else if (plan.equals(ClassicPlan.PREMIUM)) {
            return new PremiumDeliveryPriceCalculator();
        } else if (plan.equals(ClassicPlan.BUSINESS)) {
            return new BusinessDeliveryPriceCalculator();
        }
        throw new IllegalArgumentException("No support for plan " + plan);
    }
}
