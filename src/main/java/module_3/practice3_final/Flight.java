package module_3.practice3_final;

import java.time.LocalDateTime;

public abstract class Flight {
  private String flightNumber;
  private String aircraftType;
  private LocalDateTime departureDateTime;
  private String departureCity;
  private String arrivalCity;

  public Flight(String flightNumber, String aircraftType, LocalDateTime departureDateTime,
                String departureCity, String arrivalCity) {
    this.flightNumber = flightNumber;
    this.aircraftType = aircraftType;
    this.departureDateTime = departureDateTime;
    this.departureCity = departureCity;
    this.arrivalCity = arrivalCity;
  }

  // Геттеры
  public LocalDateTime getDepartureDateTime() {
    return departureDateTime;
  }

  public String getDepartureCity() {
    return departureCity;
  }

  public String getArrivalCity() {
    return arrivalCity;
  }
}
