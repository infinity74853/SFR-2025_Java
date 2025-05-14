package module1.task1_final;

import java.util.Scanner;

public class Calculator {
  public static void run() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      try {
        System.out.print("Введите первое число (или 'q' для выхода): ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("q")) break;

        double num1 = Double.parseDouble(input);

        System.out.print("Введите операцию (+, -, *, /, ^, r): ");
        char operation = scanner.nextLine().charAt(0);
        if (operation == 'q') break;

        System.out.print("Введите второе число: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        processOperation(num1, operation, num2);

      } catch (NumberFormatException e) {
        System.out.println("Ошибка: Некорректный ввод числа!");
      } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Ошибка: Операция не введена!");
      }
    }
    scanner.close();
  }

  private static void processOperation(double num1, char operation, double num2) {
    switch (operation) {
      case '+':
        System.out.println("Результат: " + (num1 + num2));
        break;
      case '-':
        System.out.println("Результат: " + (num1 - num2));
        break;
      case '*':
        System.out.println("Результат: " + (num1 * num2));
        break;
      case '/':
        if (num2 == 0) {
          System.out.println("Ошибка: Деление на ноль!");
        } else {
          System.out.println("Результат: " + (num1 / num2));
        }
        break;
      case '^':
        System.out.println("Результат: " + Math.pow(num1, num2));
        break;
      case 'r':
        if (num2 == 0) {
          System.out.println("Ошибка: Степень корня не может быть нулевой!");
        } else {
          System.out.println("Результат: " + Math.pow(num1, 1 / num2));
        }
        break;
      default:
        System.out.println("Неверная операция!");
    }
  }
}
