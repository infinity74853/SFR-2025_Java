package module_4.practice4_3;

import java.util.*;

public class EmployeeManagement {
  private static HashSet<Employee> employeeSet = new HashSet<>();
  private static HashMap<String, Double> employeeMap = new HashMap<>();
  private static TreeMap<String, Double> employeeTree = new TreeMap<>();
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    boolean running = true;
    while (running) {
      System.out.println("\nChoose an action:");
      System.out.println("1. Add employee");
      System.out.println("2. Remove employee");
      System.out.println("3. View all employees");
      System.out.println("4. Find max salary");
      System.out.println("5. Calculate average salary");
      System.out.println("6. Exit");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          addEmployee();
          break;
        case 2:
          removeEmployee();
          break;
        case 3:
          viewEmployees();
          break;
        case 4:
          findMaxSalary();
          break;
        case 5:
          calculateAverage();
          break;
        case 6:
          running = false;
          break;
        default:
          System.out.println("Invalid choice!");
      }
    }
  }

  private static void addEmployee() {
    System.out.print("Enter employee name: ");
    String name = scanner.nextLine();
    System.out.print("Enter employee salary: ");
    double salary = scanner.nextDouble();
    scanner.nextLine();

    Employee employee = new Employee(name, salary);
    employeeSet.add(employee);
    employeeMap.put(name, salary);
    employeeTree.put(name, salary);
    System.out.println("Employee added!");
  }

  private static void removeEmployee() {
    System.out.print("Enter employee name to remove: ");
    String name = scanner.nextLine();
    boolean removed = employeeSet.removeIf(e -> e.getName().equals(name));
    if (removed) {
      employeeMap.remove(name);
      employeeTree.remove(name);
      System.out.println("Employee removed!");
    } else {
      System.out.println("Employee not found!");
    }
  }

  private static void viewEmployees() {
    System.out.println("HashSet:");
    employeeSet.forEach(System.out::println);
    System.out.println("\nHashMap:");
    employeeMap.forEach((k, v) -> System.out.println("Employee: " + k + " - Salary: $" + v));
    System.out.println("\nTreeMap:");
    employeeTree.forEach((k, v) -> System.out.println("Employee: " + k + " - Salary: $" + v));
  }

  private static void findMaxSalary() {
    Optional<Employee> maxSet = employeeSet.stream()
        .max(Comparator.comparingDouble(Employee::getSalary));
    maxSet.ifPresent(e ->
        System.out.println("Max salary (HashSet): " + e));

    Optional<Map.Entry<String, Double>> maxMap = employeeMap.entrySet().stream()
        .max(Map.Entry.comparingByValue());
    maxMap.ifPresent(e ->
        System.out.println("Max salary (HashMap): " + e.getKey() + " - $" + e.getValue()));

    Optional<Map.Entry<String, Double>> maxTree = employeeTree.entrySet().stream()
        .max(Map.Entry.comparingByValue());
    maxTree.ifPresent(e ->
        System.out.println("Max salary (TreeMap): " + e.getKey() + " - $" + e.getValue()));
  }

  private static void calculateAverage() {
    double average = employeeSet.stream()
        .mapToDouble(Employee::getSalary)
        .average()
        .orElse(0.0);
    System.out.printf("Average salary: $%.2f\n", average);
  }
}

