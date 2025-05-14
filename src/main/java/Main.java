import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    displayProjectStructure();
  }

  private static void displayProjectStructure() {
    // Модули и их задачи
    Map<String, String[]> modules = new LinkedHashMap<>();
    modules.put("module_1", new String[]{"task1_1", "task1_2", "task1_3", "task1_4", "task1_final"});
    modules.put("module_2", new String[]{"task2_1", "task2_2", "task2_3", "task2_4", "task2_final"});
    modules.put("module_3", new String[]{"task3_1", "task3_2", "task3_3", "task3_final"});
    modules.put("module_4", new String[]{"task4_1", "task4_2", "task4_3", "task4_final"});

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
