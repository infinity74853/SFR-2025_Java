package module_2.task2_1;

public class DepositCalculator {
  public static double calculateDeposit(double initialAmount, double monthlyRate, int years) {
    double amount = initialAmount;
    int months = years * 12;
    for (int i = 0; i < months; i++) {
      amount += amount * (monthlyRate / 100);
    }
    return amount;
  }

  public static void main(String[] args) {
    // Тест 1
    double result1 = calculateDeposit(10000, 1.5, 5);
    System.out.printf("Сумма через 5 лет: %.2f руб.\n", result1);

    // Тест 2
    double result2 = calculateDeposit(5000, 0.8, 3);
    System.out.printf("Сумма через 3 года: %.2f руб.\n", result2);
  }
}