package module1.task1_4;

public class PopulationCalculator {
  public static void calculatePopulation() {
    int population = 25_000_000;
    int birthRate = 17;
    int deathRate = 8;

    for (int year = 1; year <= 6; year++) {
      int births = population * birthRate / 1000;
      int deaths = population * deathRate / 1000;
      population += (births - deaths);
      System.out.printf("Год %d, численность населения: %d\n", year, population);
    }
  }
}