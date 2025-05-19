package module_3.practice3_final;

import java.time.LocalDate;

public interface TicketPricingStrategy {
  double calculatePrice(double basePrice, LocalDate purchaseDate, LocalDate flightDate);
}
