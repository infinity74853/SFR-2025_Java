package module_4.practice4_final;

import java.io.Serializable;

public class Book implements Serializable {
  private static final long serialVersionUID = 1L;
  private String author;
  private String title;
  private String publisher;
  private int year;
  private double price;

  public Book(String author, String title, String publisher, int year, double price) {
    this.author = author;
    this.title = title;
    this.publisher = publisher;
    this.year = year;
    this.price = price;
  }

  // Геттеры
  public String getTitle() { return title; }
  public String getAuthor() { return author; }
  public String getPublisher() { return publisher; }
  public int getYear() { return year; }
  public double getPrice() { return price; }

  @Override
  public String toString() {
    return String.format("%s - %s (%d), %s, $%.2f", author, title, year, publisher, price);
  }
}
