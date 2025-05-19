package module_3.practice3_final;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AdultPassengerVerification implements PassengerVerification {
  @Override
  public boolean isAdult(LocalDate birthDate) {
    return ChronoUnit.YEARS.between(birthDate, LocalDate.now()) >= 18;
  }
}
