package module_4.practice4_2;

import java.util.ArrayList;

public class Task4 {
  public static void execute() {
    ArrayList<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Orange");
    String target = "Banana";
    int index = list.indexOf(target);
    System.out.println("Task 4: Index of '" + target + "': " + index);
  }
}
