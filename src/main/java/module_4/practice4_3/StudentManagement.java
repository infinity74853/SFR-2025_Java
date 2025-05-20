package module_4.practice4_3;

import java.util.HashMap;
import java.util.Scanner;

public class StudentManagement {
  private static HashMap<String, Integer> students = new HashMap<>();
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    boolean running = true;
    while (running) {
      System.out.println("\nChoose an action:");
      System.out.println("1. Add student");
      System.out.println("2. Remove student");
      System.out.println("3. View all students");
      System.out.println("4. Calculate average grade");
      System.out.println("5. Exit");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          addStudent();
          break;
        case 2:
          removeStudent();
          break;
        case 3:
          viewStudents();
          break;
        case 4:
          calculateAverage();
          break;
        case 5:
          running = false;
          break;
        default:
          System.out.println("Invalid choice!");
      }
    }
  }

  private static void addStudent() {
    System.out.print("Enter student name: ");
    String name = scanner.nextLine();
    System.out.print("Enter student grade: ");
    int grade = scanner.nextInt();
    scanner.nextLine();
    students.put(name, grade);
    System.out.println("Student added!");
  }

  private static void removeStudent() {
    System.out.print("Enter student name to remove: ");
    String name = scanner.nextLine();
    if (students.remove(name) != null) {
      System.out.println("Student removed!");
    } else {
      System.out.println("Student not found!");
    }
  }

  private static void viewStudents() {
    if (students.isEmpty()) {
      System.out.println("No students available.");
      return;
    }
    students.forEach((name, grade) ->
        System.out.println("Student: " + name + " - Grade: " + grade));
  }

  private static void calculateAverage() {
    if (students.isEmpty()) {
      System.out.println("No students to calculate.");
      return;
    }
    double average = students.values().stream()
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);
    System.out.printf("Average grade: %.2f\n", average);
  }
}
