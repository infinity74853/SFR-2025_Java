package module_2.task2_1;

public class WallRepairCost {
  public static double calculateArea(double length, double width, double height) {
    return 2 * (length + width) * height; // Площадь стен без учета окон/дверей
  }

  public static double calculateTotalCost(double area, double demolitionCost, double puttyCost, double wallpaperCost) {
    return area * (demolitionCost + puttyCost + wallpaperCost);
  }

  public static void main(String[] args) {
    double area = calculateArea(5, 4, 3);
    double totalCost = calculateTotalCost(area, 100, 200, 150);
    System.out.printf("Стоимость ремонта: %.2f руб.\n", totalCost);
  }
}
