package module_3.practice3_final;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DiscountPricingStrategy implements TicketPricingStrategy {
  @Override
  public double calculatePrice(double basePrice, LocalDate purchaseDate, LocalDate flightDate) {
    long daysBefore = ChronoUnit.DAYS.between(purchaseDate, flightDate);
    if (daysBefore > 30) return basePrice * 0.8;    // 20% скидка
    if (daysBefore < 7) return basePrice * 1.2;      // 20% наценка
    return basePrice;
  }
}
