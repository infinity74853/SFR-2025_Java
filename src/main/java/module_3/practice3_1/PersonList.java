package module_3.practice3_1;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
  private List<Person> persList = new ArrayList<>();

  public void addPerson(Person person) {
    persList.add(person);
  }

  public void delPerson(String firstName) {
    persList.removeIf(p -> p.getFirstName().equals(firstName));
  }

  public void showPersonList() {
    for (Person p : persList) {
      System.out.println(p);
    }
  }
}
