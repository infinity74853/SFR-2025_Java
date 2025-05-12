package module1.task1_2;

public class SalaryCalculator {
  public static void calculateSalaries() {
    double[] salaries = {67760, 83690, 76230, 45240};
    for (double salary : salaries) {
      double increasedSalary = salary * 1.05;
      double annualDiff = (increasedSalary - salary) * 12;
      System.out.printf("Сотрудник: Новая зарплата = %.2f руб/мес, Годовая разница = %.2f руб\n",
          increasedSalary, annualDiff);
    }
  }
}
