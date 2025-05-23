package module_1.task1_1;

public class Task1_1 {
  public static void main(String[] args) {
    // Задача 1: Инициализация переменных через var
    boolean task = false;
    double puppy = 8.0;
    double myMoney = 33234.6;
    int goodLuck = 763789;

    // Задача 2: Увеличение значений на 4
    puppy += 4;
    myMoney += 4;
    goodLuck += 4;

    // Задача 3: Уменьшение значений
    puppy -= 5;
    myMoney -= 234.3;
    goodLuck -= 6;

    // Задача 4: Попытка вычесть 2 из boolean (ошибка компиляции)
    // Раскомментируйте для проверки:
    // task = task - 2; // Ошибка: bad operand types for binary operator '-'

    // Задача 5: Расчет с переменной bird
    double bird = 3.5;
    bird = (bird * 10) / 3.5 + 4;
    System.out.println("Результат задачи 5: " + bird);

    // Задача 6: Вес участников (используем класс WeightData)
    module_1.task1_1.WeightData.calculateWeights();

    // Задача 7: Зарплата сотрудников
    int employees = 200;
    double hoursPerDay = 8;
    int workDays = 23;
    double salaryPerHour = 1000;
    double totalSalary = employees * hoursPerDay * workDays * salaryPerHour;
    System.out.printf("Сумма выплат за месяц: %.2f руб.\n", totalSalary);

    // Задача 8: Расчет налога (13%)
    double tax = totalSalary * 0.13;
    System.out.printf("Суммарный налог (13%%): %.2f руб.\n", tax);
  }
}