package module_3.practice3_final;

import java.time.LocalDate;

public class ConcreteTicket extends Ticket {
  public ConcreteTicket(double price, String ticketClass, LocalDate purchaseDate) {
    super(price, ticketClass, purchaseDate);
  }

  @Override
  public String toString() {
    return String.format("Билет класса %s. Стоимость: %.2f руб.", ticketClass, price);
  }
}
