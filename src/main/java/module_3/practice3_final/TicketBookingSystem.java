package module_3.practice3_final;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TicketBookingSystem {
  private List<Flight> flights = new ArrayList<>();
  private TicketPricingStrategy pricingStrategy = new DiscountPricingStrategy();
  private PassengerVerification verification = new AdultPassengerVerification();

  public void addFlight(Flight flight) {
    flights.add(flight);
  }

  public Ticket sellTicket(Passenger passenger, Flight flight, String ticketClass, LocalDate purchaseDate) {
    if (!verification.isAdult(passenger.getBirthDate())) {
      System.out.println("Ошибка: Пассажир несовершеннолетний!");
      return null;
    }

    double basePrice = ((ConcreteFlight) flight).getPrice(ticketClass);
    double finalPrice = pricingStrategy.calculatePrice(
        basePrice, purchaseDate, flight.getDepartureDateTime().toLocalDate()
    );

    return new ConcreteTicket(finalPrice, ticketClass, purchaseDate);
  }

  public List<Flight> searchFlights(String from, String to, LocalDate date) {
    return flights.stream()
        .filter(f -> f.getDepartureCity().equalsIgnoreCase(from))
        .filter(f -> f.getArrivalCity().equalsIgnoreCase(to))
        .filter(f -> f.getDepartureDateTime().toLocalDate().equals(date))
        .toList();
  }
}
