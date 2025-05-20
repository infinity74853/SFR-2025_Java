package module_4.practice4_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CourseManagement {
  private static HashSet<Course> courses = new HashSet<>();
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    boolean running = true;
    while (running) {
      System.out.println("\nChoose an action:");
      System.out.println("1. Add a new course");
      System.out.println("2. Remove a course");
      System.out.println("3. View all courses");
      System.out.println("4. Exit");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          addCourse();
          break;
        case 2:
          removeCourse();
          break;
        case 3:
          viewCourses();
          break;
        case 4:
          running = false;
          break;
        default:
          System.out.println("Invalid choice!");
      }
    }
  }

  private static void addCourse() {
    System.out.print("Enter course name: ");
    String name = scanner.nextLine();
    System.out.print("Enter instructor name: ");
    String instructor = scanner.nextLine();
    courses.add(new Course(name, instructor));
    System.out.println("Course added!");
  }

  private static void removeCourse() {
    System.out.print("Enter course name to remove: ");
    String name = scanner.nextLine();
    Iterator<Course> iterator = courses.iterator();
    while (iterator.hasNext()) {
      Course course = iterator.next();
      if (course.getName().equals(name)) {
        iterator.remove();
        System.out.println("Course removed!");
        return;
      }
    }
    System.out.println("Course not found!");
  }

  private static void viewCourses() {
    if (courses.isEmpty()) {
      System.out.println("No courses available.");
      return;
    }
    for (Course course : courses) {
      System.out.println(course);
    }
  }
}
