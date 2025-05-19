package module_3.practice3_final;

import java.time.LocalDate;

public abstract class Ticket {
  protected double price;
  protected String ticketClass;
  protected LocalDate purchaseDate;

  public Ticket(double price, String ticketClass, LocalDate purchaseDate) {
    this.price = price;
    this.ticketClass = ticketClass;
    this.purchaseDate = purchaseDate;
  }
}
