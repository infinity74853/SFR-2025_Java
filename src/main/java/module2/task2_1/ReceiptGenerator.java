package module2.task2_1;

public class ReceiptGenerator {
  public static double calculateTotal(int quantity, double price) {
    return quantity * price;
  }

  public static double calculateVAT(double total) {
    return total * 0.20;
  }

  public static void printReceiptLine(String item, double price, int quantity) {
    System.out.printf("%s %.0fр %d шт %.0fр\n", item, price, quantity, calculateTotal(quantity, price));
  }

  public static void main(String[] args) {
    // Покупки Маши и Саши
    printReceiptLine("Платье", 2999, 1);
    printReceiptLine("Худи", 2799, 3);
    printReceiptLine("Блузка", 799, 2);
    printReceiptLine("Джемпер", 2499, 2);
    printReceiptLine("Футболка", 800, 3);
    printReceiptLine("Джинсы", 2199, 2);

    double total = 2999*1 + 2799*3 + 799*2 + 2499*2 + 800*3 + 2199*2;
    double vat = calculateVAT(total);
    System.out.printf("Итого: %.0f рублей\n", total);
    System.out.printf("Включая НДС 20%%: %.0f рублей\n", vat);
  }
}
