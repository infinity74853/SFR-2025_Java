package module_1.task1_1;

public class WeightData {
  public static void calculateWeights() {
    // Задача 6: Вес участников
    double weight1 = 73.4;
    double weight2 = 69.4;
    double weight3 = 74.1;

    double total = weight1 + weight2 + weight3;
    double mean = total / 3;

    System.out.printf("Суммарный вес: %.1f кг\n", total);
    System.out.printf("Средний вес: %.1f кг\n", mean);
  }
}