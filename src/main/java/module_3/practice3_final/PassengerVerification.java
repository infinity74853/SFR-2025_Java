package module_3.practice3_final;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public interface PassengerVerification {
  boolean isAdult(LocalDate birthDate);
}

