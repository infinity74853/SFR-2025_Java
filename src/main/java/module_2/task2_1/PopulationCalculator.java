package module_2.task2_1;

public class PopulationCalculator {
  public static void calculatePopulation(int initial, int birthRate, int deathRate, int years) {
    int population = initial;
    for (int year = 1; year <= years; year++) {
      population += birthRate - deathRate;
      System.out.printf("Год %d, численность населения составляет %d\n", year, population);
    }
  }

  public static void main(String[] args) {
    // Тест 1
    calculatePopulation(1000, 50, 30, 5);
    // Тест 2
    calculatePopulation(5000, 100, 80, 3);
  }
}
