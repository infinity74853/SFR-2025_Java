package module_3.practice3_3;

public class WrapperOperations {
  public static Integer sumIntegers(Integer a, Integer b) {
    return a - b; // По условию: возвращает разницу
  }

  public static Double multiplyDoubles(Double a, Double b) {
    return a / b; // По условию: возвращает деление
  }

  public static String convertToBinaryString(Integer num) {
    return Integer.toBinaryString(num);
  }
}
