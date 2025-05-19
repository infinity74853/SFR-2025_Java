package module_3.practice3_1;

public class Person {
  private String lastName;
  private String firstName;
  private String middleName;
  private String birthDate;

  public Person(String lastName, String firstName, String middleName, String birthDate) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
    this.birthDate = birthDate;
  }

  // Setters
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  // Getters
  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getBirthDate() {
    return birthDate;
  }

  @Override
  public String toString() {
    return lastName + " " + firstName + " " + middleName + " (" + birthDate + ")";
  }
}
