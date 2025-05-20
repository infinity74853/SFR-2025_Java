/**ПРАКТИЧЕСКАЯ РАБОТА ПО ИТОГАМ МОДУЛЯ 4.

Для выполнения практической работы №4 предлагается выбрать задачу из следующего раздела Сборник практических заданий.
При выполнении задания следует использовать принципы объектно-ориентированного программирования, обработку ошибок:
    1.	Наследование и абстракция – разработать систему наследования, создать абстрактный класс для общей реализации методов и переменных состояния и/или интерфейсы для определения общего контракта и реализации множественного наследования, создать классы-наследники. Не забывать использовать ключевое слово super для вызова методов и конструкторов суперкласса в подклассе, чтобы не допустить лишнего дублирования кода.
2.	Поддерживать инкапсуляцию в классах. Поля классов должны быть private или protected. Для доступа к полям создать геттеры и сеттеры с модификатором public.
    3.	Использовать полиморфизм – при необходимости совершать действия с набором данных объединять их в одну коллекцию и вызывать их общий метод.
При разработке программы не забывайте использовать принципы SOLID, KISS, DRY, которые были упомянуты в данном практикуме.
Файлы с исходными данными для проверки работоспособности создать самостоятельно исходя из требования задания.
Обрабатывать исключения при чтении файлов, проведении расчетов с помощью операторов try catch или выбрасывать собственные с помощью throw при возникновении исключений.
Результат работы программы так же записывать в файл или, при необходимости, в несколько файлов, на усмотрение разработчика.
 */
/**
 Задание 24.
 Разработать программный модуль "Книжный магазин", содержащий сведения о книгах
 (автор, название, издательство, год издания, цена).
 Покупатель оформляет заявку на нужные ему книги, если таковых нет, он заносится в базу и оповещается,
 когда нужные книги поступают в магазин. Результат сохранить в файле.
*/

package module_4.practice4_final;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BookStore store;

    try {
      store = BookStore.loadState("bookstore.dat");
      System.out.println("Данные успешно загружены");
    } catch (ClassNotFoundException | IOException e) {
      System.out.println("Ошибка загрузки: " + e.getMessage());
      store = new BookStore();
    }

    while (true) {
      System.out.println("\n1. Добавить книгу\n2. Оформить заказ\n3. Выход");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1 -> {
          System.out.print("Автор: ");
          String author = scanner.nextLine();
          System.out.print("Название: ");
          String title = scanner.nextLine();
          System.out.print("Издательство: ");
          String publisher = scanner.nextLine();
          System.out.print("Год: ");
          int year = scanner.nextInt();
          System.out.print("Цена: ");
          double price = scanner.nextDouble();
          scanner.nextLine();

          store.addBook(new Book(author, title, publisher, year, price));
        }
        case 2 -> {
          System.out.print("Ваше имя: ");
          String name = scanner.nextLine();
          System.out.print("Email: ");
          String email = scanner.nextLine();
          System.out.print("Название книги: ");
          String bookTitle = scanner.nextLine();

          Customer customer = new Customer(name, email);
          store.processOrder(bookTitle, customer);
        }
        case 3 -> {
          try {
            store.saveState("bookstore.dat");
            System.out.println("Данные сохранены в: "
                + new File("bookstore.dat").getAbsolutePath());
            return;
          } catch (IOException e) {
            System.err.println("Ошибка сохранения: " + e.getMessage());
          }
        }
        default -> System.out.println("Неверный выбор!");
      }
    }
  }
}




