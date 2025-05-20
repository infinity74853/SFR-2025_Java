/**
 Практика. Generics в коллекциях и методах.

 Задача 1.
 Создайте обобщенный тип для представления пары объектов. Два объекта в паре могут быть разных типов.
 • Пример использования: Pair p = new Pair(…);
 Реализуйте методы для установки и получения значений объектов в паре.
 Пример:
 public class Pair<T, U> {
 private T first;
 private U second;
 public Pair(T first, U second) {
 this.first = first;
 this.second = second;
 }
 public T getFirst() {
 return first;
 }
 public void setFirst(T first) {
 this.first = first;
 }
 public U getSecond() {
 return second;
 }
 public void setSecond(U second) {
 this.second = second;
 }
 public static void main(String[] args) {
 Pair<String, Integer> pair = new Pair<>("Hello", 123);
 System.out.println("First: " + pair.getFirst());
 System.out.println("Second: " + pair.getSecond());
 }
 }

 Задача 2.
 Создайте обобщенный класс Triple для представления тройки объектов разных типов. Реализуйте методы для установки и получения значений объектов в тройке.

 Задача 3.
 Напишите обобщенный метод для сравнения двух объектов и возвращения большего из них. Например, метод может сравнивать как целочисленные типы данных,
 так и типы данных с плавающей точкой.

 Задача 4.
 Задание: Напишите обобщенный метод countOccurrences для подсчета количества вхождений определенного элемента в массиве.
 Дополнение: Реализуйте метод countOccurrences таким образом, чтобы он принимал массив объектов любого типа и искомый элемент,
 а возвращал количество вхождений этого элемента в массиве.
 */

package module_4.practice4_1;

public class Main {
  public static void main(String[] args) {
    // Задача 1: Пример использования Pair
    Pair<String, Integer> pair = new Pair<>("Hello", 123);
    System.out.println("Pair: " + pair.getFirst() + ", " + pair.getSecond());

    // Задача 2: Пример использования Triple
    Triple<String, Integer, Double> triple = new Triple<>("Java", 42, 3.14);
    System.out.println("Triple: " + triple.getFirst() + ", " + triple.getSecond() + ", " + triple.getThird());

    // Задача 3: Пример сравнения объектов
    Integer maxInt = ComparisonUtils.getMax(10, 20);
    System.out.println("Max Integer: " + maxInt);

    String maxStr = ComparisonUtils.getMax("apple", "banana");
    System.out.println("Max String: " + maxStr);

    // Задача 4: Пример подсчета вхождений
    String[] words = {"apple", "banana", "apple", "orange", "apple"};
    int appleCount = ArrayUtils.countOccurrences(words, "apple");
    System.out.println("Occurrences of 'apple': " + appleCount);

    Integer[] numbers = {1, 2, 3, 1, 2, 1};
    int oneCount = ArrayUtils.countOccurrences(numbers, 1);
    System.out.println("Occurrences of 1: " + oneCount);
  }
}
