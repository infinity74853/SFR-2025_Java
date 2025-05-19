package module_3.practice3_2;

public class Hogwarts {
  private final String name;
  private final int magicPower;
  private final int transgressionDistance;

  public Hogwarts(String name, int magicPower, int transgressionDistance) {
    this.name = name;
    this.magicPower = magicPower;
    this.transgressionDistance = transgressionDistance;
  }

  public String getName() {
    return name;
  }

  public int getMagicPower() {
    return magicPower;
  }

  public int getTransgressionDistance() {
    return transgressionDistance;
  }

  public void printInfo() {
    System.out.println("Ученик: " + name);
    System.out.println("Сила магии: " + magicPower);
    System.out.println("Расстояние трансгрессии: " + transgressionDistance);
  }
}
