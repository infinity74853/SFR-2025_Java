package module_4.practice4_final;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Serializable {
  private static final long serialVersionUID = 1L;
  private String name;
  private String email;
  private List<String> pendingBooks = new ArrayList<>();

  public Customer(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public void notify(String bookTitle) {
    System.out.printf("Уведомление для %s: Книга '%s' теперь в наличии!\n", email, bookTitle);
    pendingBooks.remove(bookTitle);
  }

  public void addPendingBook(String bookTitle) {
    pendingBooks.add(bookTitle);
  }

  // Геттеры
  public String getEmail() { return email; }
  public String getName() { return name; }
}
