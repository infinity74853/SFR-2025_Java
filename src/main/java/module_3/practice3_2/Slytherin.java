package module_3.practice3_2;

public class Slytherin extends Hogwarts {
  private final int cunning;
  private final int determination;
  private final int ambition;
  private final int resourcefulness;
  private final int powerLust;

  public Slytherin(String name, int magicPower, int transgressionDistance,
                   int cunning, int determination, int ambition,
                   int resourcefulness, int powerLust) {
    super(name, magicPower, transgressionDistance);
    this.cunning = cunning;
    this.determination = determination;
    this.ambition = ambition;
    this.resourcefulness = resourcefulness;
    this.powerLust = powerLust;
  }

  // Аналогичные методы compare и printInfo для Slytherin
}
