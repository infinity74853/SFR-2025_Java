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
    modules.put("module_3", new String[]{"module_3/practice3_1", "module_3/practice3_2", "module_3/practice3_3", "module_3/practice3_final"});
    modules.put("module_4", new String[]{"module_4/practice4_1", "module_4/practice4_2", "module_4/practice4_3", "module_4/practice4_final"});

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
