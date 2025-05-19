package module_3.practice3_final;

import java.time.LocalDateTime;

public class ConcreteFlight extends Flight {
  private Crew crew;
  private double economyPrice;
  private double businessPrice;

  public ConcreteFlight(String flightNumber, String aircraftType, LocalDateTime departureDateTime,
                        String departureCity, String arrivalCity, Crew crew,
                        double economyPrice, double businessPrice) {
    super(flightNumber, aircraftType, departureDateTime, departureCity, arrivalCity);
    this.crew = crew;
    this.economyPrice = economyPrice;
    this.businessPrice = businessPrice;
  }

  public double getPrice(String ticketClass) {
    return switch (ticketClass.toUpperCase()) {
      case "BUSINESS" -> businessPrice;
      default -> economyPrice;
    };
  }
}
