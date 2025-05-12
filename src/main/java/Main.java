import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    displayProjectStructure();
  }

  private static void displayProjectStructure() {
    // Модули и их задачи
    Map<String, String[]> modules = new LinkedHashMap<>();
    modules.put("module1", new String[]{"task1_1", "task1_2", "task1_3", "task1_4", "task1_final"});
    modules.put("module2", new String[]{}); // Задачи будут добавлены позже
    modules.put("module3", new String[]{}); // Задачи будут добавлены позже
    modules.put("module4", new String[]{}); // Задачи будут добавлены позже

    // Вывод структуры в консоль
    for (Map.Entry<String, String[]> entry : modules.entrySet()) {
      String module = entry.getKey();
      String[] tasks = entry.getValue();

      System.out.println(module); // Название модуля
      for (String task : tasks) {
        System.out.println("    " + task); // Задачи с отступом
      }
    }
  }
}
