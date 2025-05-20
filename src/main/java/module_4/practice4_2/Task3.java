package module_4.practice4_2;

import java.util.ArrayList;

public class Task3 {
  public static void execute() {
    ArrayList<String> list1 = new ArrayList<>();
    list1.add("A");
    list1.add("B");

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("C");
    list2.add("D");

    ArrayList<String> merged = new ArrayList<>(list1);
    merged.addAll(list2);
    System.out.println("Task 3: Merged list: " + merged);
  }
}
