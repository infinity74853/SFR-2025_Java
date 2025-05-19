package module_3.practice3_final;

import java.time.LocalDate;

public class Passenger {
  private final LocalDate birthDate;

  public Passenger(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }
}
