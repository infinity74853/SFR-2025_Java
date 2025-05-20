package module_4.practice4_2;

import java.util.LinkedList;

public class Task5 {
  public static void execute() {
    LinkedList<String> list = new LinkedList<>();
    list.add("One");
    list.add("Two");
    list.add("Three");
    System.out.print("Task 5: Reversed list: ");
    for (int i = list.size() - 1; i >= 0; i--) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();
  }
}
