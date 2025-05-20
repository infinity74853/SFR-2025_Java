package module_4.practice4_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
  public static void execute() {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);

    int threshold = 25;
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
      if (iterator.next() > threshold) {
        iterator.remove();
      }
    }
    System.out.println("Task 2: After removal: " + list);
  }
}
