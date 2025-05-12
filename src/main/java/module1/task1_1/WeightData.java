package module1.task1_1;

public class WeightData {
  public static void calculateWeights() {
    // Задача 6: Вес участников
    var weight1 = 73.4;
    var weight2 = 69.4;
    var weight3 = 74.1;

    var total = weight1 + weight2 + weight3;
    var mean = total / 3;

    System.out.printf("Суммарный вес: %.1f кг\n", total);
    System.out.printf("Средний вес: %.1f кг\n", mean);
  }
}