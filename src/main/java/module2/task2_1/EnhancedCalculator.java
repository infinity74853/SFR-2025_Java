package module2.task2_1;

import java.util.Scanner;

public class EnhancedCalculator {
  public static double add(double a, double b) { return a + b; }
  public static double subtract(double a, double b) { return a - b; }
  public static double multiply(double a, double b) { return a * b; }
  public static double divide(double a, double b) { return a / b; }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите первое число: ");
    double num1 = scanner.nextDouble();
    System.out.print("Введите второе число: ");
    double num2 = scanner.nextDouble();
    System.out.print("Выберите операцию (+, -, *, /): ");
    char operation = scanner.next().charAt(0);

    switch (operation) {
      case '+':
        System.out.println("Результат: " + add(num1, num2));
        break;
      case '-':
        System.out.println("Результат: " + subtract(num1, num2));
        break;
      case '*':
        System.out.println("Результат: " + multiply(num1, num2));
        break;
      case '/':
        System.out.println("Результат: " + divide(num1, num2));
        break;
      default:
        System.out.println("Некорректная операция!");
    }
    scanner.close();
  }
}
