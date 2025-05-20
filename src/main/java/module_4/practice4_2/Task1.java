package module_4.practice4_2;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
  public static void execute() {
    ArrayList<Integer> list = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      list.add(random.nextInt(100));
    }
    System.out.println("Task 1: ArrayList elements: " + list);
  }
}
