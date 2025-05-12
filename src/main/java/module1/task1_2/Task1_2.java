package module1.task1_2;

public class Task1_2 {
  public static void main(String[] args) {
    task1(); // Задачи 1.2.1–1.2.11
  }

  private static void task1() {
    // Задача 1: Объявление переменных разных типов
    int count = 40000;
    byte age = 22;
    short distance = 32767;
    long universeAge = 9223372036854775807L;
    float price = 3.75f;
    double pi = 3.1415926535;
    char symbol = 'J';
    boolean isJavaCool = true;

    // Задача 2: Инициализация переменных
    int a = 25;
    double b = 26.4;
    long c = 985439324234L;
    double d = 4.5422;
    int e = 3894;
    int f = -234;
    int g = 234542;
    byte h = 67;

    // Задача 3: Арифметические операции
    int number1 = 15;
    int number2 = 4;
    int sum = number1 + number2;
    int sub = number1 - number2;
    int mul = number1 * number2;
    int div = number1 / number2;
    int mod = number1 % number2;
    System.out.printf("Сумма: %d, Разность: %d, Умножение: %d, Деление: %d, Остаток: %d\n",
        sum, sub, mul, div, mod);

    // Задача 4: Неявное преобразование int -> float
    int intValue = 100;
    float floatValue = intValue;
    System.out.println("Неявное преобразование: " + floatValue);

    // Задача 5: Явное преобразование double -> int
    double doubleValue = 123.456;
    int intFromDouble = (int) doubleValue;
    System.out.println("Явное преобразование: " + intFromDouble);

    // Задача 6: Создание объекта Object
    Object myObject = new Object();

    // Задача 7: Создание объектов Car
    Car myCar1 = new Car();
    Car myCar2 = new Car();

    // Задача 8: Создание объектов Bus
    Bus myBus1 = new Bus();
    Bus myBus2 = new Bus();
    Bus myBus3 = new Bus();

    // Задача 9: Расчет производительности оборудования
    int logosPer4Min = 9;
    int minutes = 20;
    int logos20Min = (logosPer4Min * minutes) / 4;
    int logosDay = logosPer4Min * (24 * 60 / 4);
    System.out.printf("За 20 мин: %d логотипов\nЗа сутки: %d логотипов\n",
        logos20Min, logosDay);

    // Задача 10: Расчет банок краски
    int totalCans = 18;
    int floors = totalCans / (4 + 2); // 3 этажа
    int whiteCans = floors * 4;
    int greenCans = floors * 2;
    System.out.printf("Белая краска: %d банок, Зеленая: %d банок\n",
        whiteCans, greenCans);

    // Задача 11: Расчет зарплат (вызов метода из SalaryCalculator)
    SalaryCalculator.calculateSalaries();
  }
}