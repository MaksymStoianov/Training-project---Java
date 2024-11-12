package homeworks.homework_43.Task2;

import java.util.List;

/**
 * Task2
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task2 {
  public static void main(String[] args) {
    List<String> values = List.of(
        "green",
        "Red",
        "blue",
        "Dark",
        "Blue",
        "red"
    );

    System.out.println(filter(values));
  }


  private static List<String> filter(List<String> values) {
    return values
        .stream()
        .map(String::toLowerCase)
        .filter(item -> item.startsWith("r") || item.startsWith("b"))
        .sorted()
        .distinct() // Удаляет дубликаты
        .toList();
  }

}
