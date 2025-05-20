package module_4.practice4_1;

public class ComparisonUtils {
  public static <T extends Comparable<T>> T getMax(T a, T b) {
    return a.compareTo(b) >= 0 ? a : b;
  }
}
