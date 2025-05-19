package module_3.practice3_1;

public class Calculator {
  public int add(int a, int b) {
    return a + b;
  }

  public int minus(int a, int b) {
    return a - b;
  }

  public int multiplication(int a, int b) {
    return a * b;
  }

  public double division(int a, int b) {
    if (b == 0) throw new ArithmeticException("Деление на ноль!");
    return (double) a / b;
  }
}
