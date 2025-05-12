package module1.task1_3;

import java.util.Scanner;

public class InputTasks {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Задача 1.3.1: Ввод имени
    System.out.print("Введите ваше имя: ");
    String name = scanner.nextLine();
    System.out.print("Привет, " + name + "!\n");

    // Задача 1.3.2: Арифметика двух чисел
    System.out.print("Введите первое число: ");
    double num1 = scanner.nextDouble();
    System.out.print("Введите второе число: ");
    double num2 = scanner.nextDouble();
    System.out.println("Сумма: " + (num1 + num2));
    System.out.println("Разность: " + (num1 - num2));
    System.out.println("Произведение: " + (num1 * num2));
    System.out.println("Частное: " + (num1 / num2));

    // Задача 1.3.3: Таблица умножения
    System.out.print("Введите число для таблицы умножения: ");
    int n = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " x " + i + " = " + (n * i));
    }

    // Задача 1.3.4: Оценка студента
    System.out.print("Введите оценку (1-5): ");
    int grade = scanner.nextInt();
    switch (grade) {
      case 5: System.out.println("Отлично!"); break;
      case 4: System.out.println("Хорошо"); break;
      case 3: System.out.println("Удовлетворительно"); break;
      default: System.out.println("Неудовлетворительно");
    }

    // Задача 1.3.5: Информация о пользователе
    scanner.nextLine(); // Очистка буфера
    System.out.print("Введите ваш возраст: ");
    int age = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Введите интересный факт о себе: ");
    String fact = scanner.nextLine();
    System.out.println("\nИмя: " + name);
    System.out.println("Возраст: " + age);
    System.out.println("Факт: " + fact);

    scanner.close();
  }
}