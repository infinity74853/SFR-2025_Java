package module_4.practice4_final;

import java.io.*;
import java.util.*;

public class BookStore implements Serializable {
  private static final long serialVersionUID = 1L;
  private Map<String, Book> availableBooks = new HashMap<>();
  private Map<String, Customer> customers = new HashMap<>();
  private Map<String, List<Customer>> waitingList = new HashMap<>();

  public void addBook(Book book) {
    availableBooks.put(book.getTitle(), book);
    checkWaitingList(book.getTitle());
  }

  public void processOrder(String bookTitle, Customer customer) {
    if (availableBooks.containsKey(bookTitle)) {
      System.out.println("Книга доступна. Заказ оформлен.");
    } else {
      customer.addPendingBook(bookTitle);
      waitingList.computeIfAbsent(bookTitle, k -> new ArrayList<>()).add(customer);
      System.out.println("Книги нет в наличии. Вы добавлены в список ожидания.");
    }
  }

  private void checkWaitingList(String bookTitle) {
    waitingList.getOrDefault(bookTitle, Collections.emptyList())
        .forEach(customer -> customer.notify(bookTitle));
    waitingList.remove(bookTitle);
  }

  public void saveState(String filename) throws IOException {
    final long serialVersionUID = 1L;
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
      oos.writeObject(this);
    }
  }

  public static BookStore loadState(String filename) throws IOException, ClassNotFoundException {
    File file = new File(filename);
    if (!file.exists()) return new BookStore();

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
      return (BookStore) ois.readObject();
    }
  }
}
