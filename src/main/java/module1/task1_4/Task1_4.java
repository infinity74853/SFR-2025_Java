package module1.task1_4;

import java.util.Scanner;

public class Task1_4 {
  public static void main(String[] args) {
    calculateYearlyIncome(); // Задача 1.4.1
    calculateDeposit();      // Задача 1.4.2
    printMultiplicationTable(); // Задача 1.4.3
    calculateYearlyIncomeWithWhile(); // Задача 1.4.4
    calculateSavingsMonths(); // Задача 1.4.5
    printNumbers(); // Задача 1.4.6
    PopulationCalculator.calculatePopulation(); // Задача 1.4.7
    calculateMashasSavings(); // Задача 1.4.8
    printEveryTwelveMonths(); // Задача 1.4.9
    findCometYears(); // Задача 1.4.10
  }

  // Задача 1.4.1: Годовой доход (цикл for)
  private static void calculateYearlyIncome() {
    int salary = 80000;
    int yearAmount = 0;
    for (int i = 0; i < 12; i++) {
      yearAmount += salary;
    }
    System.out.println("Годовой доход: " + yearAmount + " руб.");
  }

  // Задача 1.4.2: Вклад Пети (2 года под 2%)
  private static void calculateDeposit() {
    double deposit = 0;
    double monthlyAddition = 20000;
    double interestRate = 0.02;

    for (int month = 0; month < 24; month++) {
      deposit += monthlyAddition;
      deposit *= (1 + interestRate);
    }
    System.out.printf("Сумма вклада через 2 года: %.2f руб.\n", deposit);
  }

  // Задача 1.4.3: Таблица умножения на 5
  private static void printMultiplicationTable() {
    System.out.println("Таблица умножения на 5:");
    for (int i = 1; i <= 10; i++) {
      System.out.println("5 x " + i + " = " + (5 * i));
    }
  }

  // Задача 1.4.4: Годовой доход (цикл while)
  private static void calculateYearlyIncomeWithWhile() {
    int salary = 80000;
    int yearAmount = 0;
    int month = 0;
    while (month < 12) {
      yearAmount += salary;
      month++;
    }
    System.out.println("Годовой доход (while): " + yearAmount + " руб.");
  }

  // Задача 1.4.5: Накопление 5 млн рублей
  private static void calculateSavingsMonths() {
    double target = 5_000_000;
    double monthlySave = 25000;
    double current = 0;
    int months = 0;

    while (current < target) {
      current += monthlySave;
      months++;
      System.out.printf("Месяц %d, сумма накоплений: %.2f руб.\n", months, current);
    }
  }

  // Задача 1.4.6: Вывод чисел в прямом и обратном порядке
  private static void printNumbers() {
    int i = 1;
    System.out.print("Прямой порядок: ");
    while (i <= 10) {
      System.out.print(i + " ");
      i++;
    }

    System.out.print("\nОбратный порядок: ");
    for (int j = 10; j >= 1; j--) {
      System.out.print(j + " ");
    }
    System.out.println();
  }

  // Задача 1.4.8: Накопления Маши
  private static void calculateMashasSavings() {
    double target = 20_000_000;
    double monthlyAddition = 60000;
    double current = 0;
    int months = 0;
    double interestRate = 0.02;

    while (current < target) {
      current += monthlyAddition;
      current *= (1 + interestRate);
      months++;
      System.out.printf("Месяц %d: %.2f руб.\n", months, current);
    }
  }

  // Задача 1.4.9: Накопления каждые 12 месяцев
  private static void printEveryTwelveMonths() {
    double current = 0;
    double monthlyAddition = 60000;
    double interestRate = 0.02;

    for (int month = 1; month <= 36; month++) {
      current += monthlyAddition;
      current *= (1 + interestRate);
      if (month % 12 == 0) {
        System.out.printf("Год %d: %.2f руб.\n", month / 12, current);
      }
    }
  }

  // Задача 1.4.10: Появление кометы
  private static void findCometYears() {
    int currentYear = 2024;
    int startYear = currentYear - 200;
    int endYear = currentYear + 100;

    System.out.println("Годы появления кометы:");
    for (int year = startYear; year <= endYear; year++) {
      if ((year - 0) % 79 == 0) {
        System.out.println(year);
      }
    }
  }
}