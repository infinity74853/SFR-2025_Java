package module1.task1_3;

import java.util.Scanner;

public class ConditionalTasks {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Задача 1.3.1: Совершеннолетие
    System.out.print("Введите возраст: ");
    int age = scanner.nextInt();
    if (age >= 18) {
      System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
    } else {
      System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия");
    }

    // Задача 1.3.2: Шапка и температура
    System.out.print("Введите температуру: ");
    double temp = scanner.nextDouble();
    if (temp < 10) {
      System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
    } else {
      System.out.println("На улице " + temp + " градусов, можно идти без шапки");
    }

    // Задача 1.3.3: Штраф за скорость
    System.out.print("Введите скорость: ");
    int speed = scanner.nextInt();
    if (speed > 110) {
      System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
    } else {
      System.out.println("Если скорость " + speed + ", то штраф не придет");
    }

    // Задача 1.3.4: Учебные учреждения
    System.out.print("Введите возраст: ");
    int age2 = scanner.nextInt();
    if (age2 < 3) System.out.println("Ясли");
    else if (age2 <= 6) System.out.println("Детский сад");
    else if (age2 <= 18) System.out.println("Школа");
    else if (age2 <= 24) System.out.println("Университет");
    else if (age2 <= 60) System.out.println("Работа");
    else System.out.println("Пенсия");

    // Задача 1.3.5: Аттракцион и рост
    System.out.print("Введите рост ребенка (см): ");
    int height = scanner.nextInt();
    if (height < 100) {
      System.out.println("Нельзя кататься");
    } else if (height < 140) {
      System.out.println("Можно с сопровождением");
    } else {
      System.out.println("Можно без сопровождения");
    }

    scanner.close();
  }
}
