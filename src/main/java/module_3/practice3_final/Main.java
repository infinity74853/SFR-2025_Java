/**
 ПРАКТИЧЕСКАЯ РАБОТА ПО ИТОГАМ МОДУЛЯ 3.

 Разработать программный модуль "Авиакасса", содержащий сведения о наличии свободных мест на авиамаршруты.
 В базе должны содержаться сведения о номере рейса, экипаже, типе самолета, дате и времени вылета, а также стоимости авиабилетов (разного класса).
 Цена билета зависит от времени покупки билета – иногда авиакомпании делают скидки купившим билет более чем за месяц или на "горящие рейсы".
 Билеты продаются только совершеннолетним гражданам при предъявлении паспорта. При поступлении заявки на билеты программа производит поиск подходящего рейса.

 Алгоритм выполнения задания:
 1.	Определение основных сущностей: создание интерфейсов и абстрактных классов для представления основных сущностей системы: рейса, экипажа, самолета, билета и т.д.
 2.	Разработка классов для хранения информации: создание абстрактного класса Flight для представления рейса с полями номера рейса, типа самолета, даты и времени вылета.
 Создание классов, расширяющих Flight, для конкретных рейсов с дополнительными полями, такими как экипаж, стоимость билетов разного класса и т.д.
 3.	Создание классов для представления экипажа и типа самолета. Создание абстрактного класса Ticket для представления билета с полями стоимости,
 класса билета и времени покупки.
 4.	Управление стоимостью билетов: создание интерфейса TicketPricingStrategy для определения стратегии ценообразования билетов в зависимости от времени покупки.
 Реализация конкретных классов, реализующих интерфейс TicketPricingStrategy, для учета скидок и специальных предложений.
 5.	Проверка возраста пассажира: Создание интерфейса PassengerVerification для проверки возраста пассажира при покупке билета. Реализация класса,
 реализующего интерфейс PassengerVerification, для проверки совершеннолетия пассажира.
 6.	Поиск подходящего рейса: Создание интерфейса FlightSearch для поиска подходящего рейса на основе заданных критериев.
 Реализация класса, реализующего интерфейс FlightSearch, для поиска рейса по заданным параметрам.
 7.	Реализация взаимодействия с пользователями: Создание класса TicketBookingSystem для управления продажей билетов,
 поиска рейсов и взаимодействия с пользователями. Включение методов для добавления новых рейсов, продажи билетов, поиска рейсов и других операций.
 8.	Реализовать консольное меню (с помощью switch-case) для пользователя, объекты классов в методе Main для проверки функциональности модуля "Авиакасса".

 Подсказки:
 Date и LocalDate являются классами, используемыми для работы с датами в Java. В Java 8 и более поздних версиях рекомендуется использовать LocalDate,
 так как Date устарел и не рекомендуется к использованию.

 LocalDate:
 •	LocalDate представляет только дату без времени в ISO-8601 календаре (год-месяц-день).
 •	LocalDate является потокобезопасным и неизменяемым классом.
 •	LocalDate предоставляет удобные методы для работы с датами, такие как plusDays(), minusDays(), isAfter(), isBefore() и т.д.
 Примеры методов для использования в задаче:
 Метод для определения времени до вылета рейса:
 public long getDaysUntilFlight(LocalDate flightDate) {
 LocalDate currentDate = LocalDate.now();
 return ChronoUnit.DAYS.between(currentDate, flightDate);
 }

 Метод для проверки возможности покупки билета со скидкой:
 public boolean isDiscountAvailable(LocalDate purchaseDate, LocalDate flightDate) {
 long daysUntilFlight = ChronoUnit.DAYS.between(purchaseDate, flightDate);
 return daysUntilFlight > 30; // Проверка на покупку билета более чем за месяц до вылета
 }

 Метод для проверки совершеннолетия пассажира:
 public boolean isAdultPassenger(LocalDate birthDate) {
 LocalDate currentDate = LocalDate.now();
 long age = ChronoUnit.YEARS.between(birthDate, currentDate);
 return age >= 18;
 }

 Метод для расчета стоимости билета в зависимости от класса и времени покупки:
 public double calculateTicketPrice(String ticketClass, LocalDate purchaseDate, LocalDate flightDate) {
 double basePrice = getBaseTicketPrice(ticketClass); // Получение базовой цены билета в зависимости от класса
 if (isDiscountAvailable(purchaseDate, flightDate)) {
 return applyDiscount(basePrice); // Применение скидки, если билет куплен заранее
 } else {
 return basePrice;
 }
 }

 Методы для добавления новых рейсов и продажи билетов:
 public void addFlight(Flight newFlight) {
 // Логика добавления нового рейса в систему
 }
 public Ticket sellTicket(Passenger passenger, Flight flight, String ticketClass, LocalDate purchaseDate) {
 if (isAdultPassenger(passenger.getBirthDate())) {
 double ticketPrice = calculateTicketPrice(ticketClass, purchaseDate, flight.getFlightDate());
 Ticket newTicket = new Ticket(passenger, flight, ticketClass, ticketPrice, purchaseDate);
 // Логика продажи билета, например, добавление билета в базу данных
 return newTicket;
 } else {
 // Обработка случая, когда пассажир несовершеннолетний
 return null;
 }
 }
 Метод для поиска подходящего рейса по заданным критериям:
 public Flight findSuitableFlight(String departureCity, String arrivalCity, LocalDate travelDate, String ticketClass) {
 // Логика поиска подходящего рейса с учетом заданных критериев
 return null; // Возвращение найденного рейса или null, если рейс не найден
 }
 Метод для вывода информации о рейсе и доступных местах:
 public void displayFlightInfo(Flight flight) {
 // Вывод информации о рейсе, количестве свободных мест и других деталей
 }

 */


package module_3.practice3_final;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    TicketBookingSystem system = new TicketBookingSystem();
    initFlights(system);

    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("\n1. Поиск рейсов\n2. Купить билет\n3. Выход");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1 -> {
          List<Flight> found = searchFlights(system, scanner);
          found.forEach(f -> System.out.println("Рейс: " + f.getDepartureCity() + " -> " + f.getArrivalCity()));
        }
        case 2 -> buyTicket(system, scanner);
        case 3 -> System.exit(0);
      }
    }
  }

  private static void initFlights(TicketBookingSystem system) {
    Crew crew = new Crew("Иванов", "Петров", new String[]{"Сидорова", "Кузнецов"});
    LocalDateTime depTime = LocalDateTime.of(2024, 12, 25, 15, 30);
    system.addFlight(new ConcreteFlight("SU123", "Boeing 737", depTime,
        "Москва", "Санкт-Петербург", crew, 5000, 15000));
  }

  private static List<Flight> searchFlights(TicketBookingSystem system, Scanner scanner) {
    System.out.print("Откуда: ");
    String from = scanner.next();
    System.out.print("Куда: ");
    String to = scanner.next();
    System.out.print("Дата (yyyy-mm-dd): ");
    LocalDate date = LocalDate.parse(scanner.next());

    return system.searchFlights(from, to, date);
  }

  private static void buyTicket(TicketBookingSystem system, Scanner scanner) {
    System.out.print("Дата рождения (yyyy-mm-dd): ");
    LocalDate birthDate = LocalDate.parse(scanner.next());
    Passenger passenger = new Passenger(birthDate);

    List<Flight> flights = searchFlights(system, scanner);
    if (flights.isEmpty()) {
      System.out.println("Рейсы не найдены!");
      return;
    }

    Flight flight = flights.get(0);
    System.out.print("Класс (ECONOMY/BUSINESS): ");
    String ticketClass = scanner.next().toUpperCase();

    Ticket ticket = system.sellTicket(passenger, flight, ticketClass, LocalDate.now());
    if (ticket != null) {
      System.out.println("Билет куплен: " + ticket);
    }
  }
}
