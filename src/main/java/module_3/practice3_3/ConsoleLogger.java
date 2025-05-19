package module_3.practice3_3;

public class ConsoleLogger implements Logger {
  @Override
  public void log(String message) {
    System.out.println("Console Log: " + message);
  }
}
