package module_4.practice4_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task6 {
  public static void execute() {
    int size = 100000;
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

    for (int i = 0; i < size; i++) {
      arrayList.add(i);
      linkedList.add(i);
    }

    int index = 50000;
    long start = System.nanoTime();
    arrayList.get(index);
    long arrayTime = System.nanoTime() - start;

    start = System.nanoTime();
    linkedList.get(index);
    long linkedTime = System.nanoTime() - start;

    System.out.println("Task 6:");
    System.out.println("ArrayList access time: " + arrayTime + " ns");
    System.out.println("LinkedList access time: " + linkedTime + " ns");
  }
}
