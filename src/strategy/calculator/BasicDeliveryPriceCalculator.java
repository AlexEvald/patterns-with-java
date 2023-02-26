package strategy.calculator;

import strategy.DeliveryPriceCalculator;
import strategy.Item;

import java.math.BigDecimal;

public class BasicDeliveryPriceCalculator implements DeliveryPriceCalculator {
    @Override
    public BigDecimal priceFor(Item item) {
        return item.price().multiply(new BigDecimal("0.025")).add(new BigDecimal("1.0"));
    }
}
