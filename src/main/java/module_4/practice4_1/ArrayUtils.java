package module_4.practice4_1;

public class ArrayUtils {
  public static <T> int countOccurrences(T[] array, T element) {
    int count = 0;
    for (T item : array) {
      if (element == null) {
        if (item == null) {
          count++;
        }
      } else {
        if (element.equals(item)) {
          count++;
        }
      }
    }
    return count;
  }
}
