package strategy;

import java.math.BigDecimal;

public interface DeliveryPriceCalculator {
    BigDecimal priceFor(Item item);
}
