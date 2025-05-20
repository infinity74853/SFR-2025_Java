/**
 Практика. Hashset, Hashmap и Treemap.

 Задание 1.
 Задача: Разработайте программу для управления списком учебных курсов, используя коллекцию HashSet. Пользователи смогут добавлять, удалять и просматривать доступные курсы.

 Алгоритм выполнения:

 a) Создайте класс Course, который будет представлять информацию об учебном курсе, включая название курса и преподавателя. Пример:
 public class Course {
 private String name;
 private String instructor;
 public Course(String name, String instructor) {
 this.name = name;
 this.instructor = instructor;
 }
 // Геттеры и сеттеры
 }

 b) Создайте основной класс CourseManagement, содержащий метод main и основную логику программы.

 c) В методе main инициализируйте коллекцию HashSet<Course> для хранения учебных курсов.

 d) Предложите пользователю выбрать действие:
 •	Добавить новый курс.
 •	Удалить существующий курс.
 •	Вывести список всех доступных курсов.
 •	Завершить программу.

 e) Реализуйте каждое действие с помощью соответствующих методов в классе CourseManagement.
 Для добавления нового курса:
 •	Запросите у пользователя название курса и имя преподавателя.
 •	Создайте объект Course и добавьте его в коллекцию.
 Для удаления курса:
 •	Запросите у пользователя название курса, который нужно удалить.
 •	Удалите соответствующий курс из коллекции.
 Для вывода списка всех курсов:
 •	Пройдитесь по коллекции и выведите информацию о каждом курсе.
 Повторяйте программу в цикле до тех пор, пока пользователь не решит завершить программу.
 Пример:
 import java.util.HashSet;
 import java.util.Iterator;
 import java.util.Scanner;

 class Course {
 private String name;
 private String instructor;

 public Course(String name, String instructor) {
 this.name = name;
 this.instructor = instructor;
 }
 public String getName() {
 return name;
 }
 public String getInstructor() {
 return instructor;
 }
 public String toString() {
 return "Course: " + name + " - Instructor: " + instructor;
 }
 }

 class CourseUtils { // класс утилита для операций над курсами
 public static void addCourse(HashSet<Course> courses, Scanner scanner) {
 System.out.println("Enter the name of the course: ");
 String courseName = scanner.nextLine();
 System.out.println("Enter the instructor's name: ");
 String instructorName = scanner.nextLine();

 Course newCourse = new Course(courseName, instructorName);
 courses.add(newCourse);
 System.out.println("Course added successfully!");
 }

 public static void removeCourse(HashSet<Course> courses, Scanner scanner) {
 System.out.println("Enter the name of the course to remove: ");
 String courseToRemove = scanner.nextLine();
 Iterator<Course> iterator = courses.iterator(); /итератор для удаления элемента из списка/
        while (iterator.hasNext()) {
Course course = iterator.next();
            if (course.getName().equals(courseToRemove)) {
    iterator.remove();
                System.out.println("Course removed successfully!");
            }
                }
                }
public static void viewCourses(HashSet<Course> courses) {
  if (courses.isEmpty()) {
    System.out.println("No courses available.");
  } else {
    System.out.println("List of available courses:");
    for (Course course : courses) {
      System.out.println(course);
    }
  }
}
}

public class CourseManagement {
  public static void main(String[] args) {
    HashSet<Course> courses = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
    boolean running = true;
    while (running) {
      System.out.println("Choose an action:");
      System.out.println("1. Add a new course");
      System.out.println("2. Remove an existing course");
      System.out.println("3. View all available courses");
      System.out.println("4. Exit");
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 1:
          CourseUtils.addCourse(courses, scanner);
          break;
        case 2:
          CourseUtils.removeCourse(courses, scanner);
          break;
        case 3:
          CourseUtils.viewCourses(courses);
          break;
        case 4:
          running = false;
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }
}

Задание 2.
Задача: Напишите программу для учета студентов и их оценок с использованием коллекции HashMap. Пользователь сможет добавлять студентов, присваивать им оценки и просматривать результаты.

Алгоритм выполнения:

а) Создайте класс Student, который будет представлять информацию о студенте, включая имя студента и его оценку.
    Пример:
public class Student {
  private String name;
  private int grade;
  public Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }
  // Геттеры и сеттеры
}

b) Создайте основной класс StudentManagement, содержащий метод main и основную логику программы.

c) В методе main инициализируйте коллекцию HashMap<String, Integer> для хранения студентов и их оценок.
    •	Предложите пользователю выбрать действие:
    •	Добавить нового студента и его оценку.
    •	Удалить существующего студента.
•	Вывести список всех студентов и их оценок.
•	Найти среднюю оценку всех студентов.
•	Завершить программу.

d) Реализуйте каждое действие с помощью соответствующих методов в классе StudentManagement.
Для добавления нового студента и его оценки:
    •	Запросите у пользователя имя студента и его оценку.
    •	Добавьте запись в HashMap.
Для удаления студента:
    •	Запросите у пользователя имя студента, которого нужно удалить.
•	Удалите соответствующую запись из HashMap.
Для вывода списка всех студентов и их оценок:
    •	Пройдитесь по HashMap и выведите информацию о каждом студенте.
Для нахождения средней оценки всех студентов:
    •	Пройдитесь по HashMap и вычислите среднюю оценку всех студентов.
Повторяйте программу в цикле до тех пор, пока пользователь не решит завершить программу.

Задание 3.
    Создайте программу, которая позволит пользователям вводить информацию о сотрудниках и их зарплатах. Программа должна использовать различные коллекции (HashSet, HashMap, TreeMap) для хранения этих данных и выполнять различные операции с ними.
Алгоритм выполнения:

a) Создайте класс Employee, который будет представлять информацию о сотруднике, включая имя сотрудника и его зарплату.
    Пример:
public class Employee {
  private String name;
  private double salary;
  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }
  // Геттеры и сеттеры
}

b) Создайте основной класс EmployeeManagement, который будет содержать метод main и основную логику программы.

c) В методе main инициализируйте три коллекции: HashSet<Employee>, HashMap<String, Double> и TreeMap<String, Double> для хранения информации о сотрудниках и их зарплатах.

    d) Предложите пользователю выбрать действие:
    •	Добавить нового сотрудника.
•	Удалить существующего сотрудника.
•	Вывести список всех сотрудников и их зарплат.
•	Найти сотрудника с самой высокой зарплатой.
    •	Найти среднюю зарплату всех сотрудников.
•	Завершить программу.

e) Реализуйте каждое действие с помощью соответствующих методов в классе EmployeeManagement.
Для добавления сотрудника:
    •	Запросите у пользователя имя сотрудника и его зарплату.
    •	Создайте объект Employee и добавьте его в каждую из трех коллекций.
Для удаления сотрудника:
    •	Запросите у пользователя имя сотрудника, которого нужно удалить.
•	Удалите соответствующего сотрудника из каждой коллекции.
Для вывода списка всех сотрудников и их зарплат:
    •	Пройдитесь по каждой коллекции и выведите информацию о каждом сотруднике.
Для поиска сотрудника с самой высокой зарплатой:
    •	Найдите сотрудника с самой высокой зарплатой в каждой коллекции и выведите его данные.
Для нахождения средней зарплаты всех сотрудников:
    •	Пройдитесь по каждой коллекции и вычислите среднюю зарплату всех сотрудников.
Повторяйте программу в цикле до тех пор, пока пользователь не решит завершить программу.
*/

package module_4.practice4_3;

public class Main {
  public static void main(String[] args) {
    // Запуск управления курсами
    CourseManagement.main(args);
    // Запуск управления студентами
    StudentManagement.main(args);
    // Запуск управления сотрудниками
    EmployeeManagement.main(args);
  }
}

/**
 Необходимо:
 Скомпилировать: javac *.java
 Запустить: java Main
 */
