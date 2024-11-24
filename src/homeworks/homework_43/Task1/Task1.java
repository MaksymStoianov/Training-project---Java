package homeworks.homework_43.Task1;

import java.util.List;

/**
 * Task1
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task1 {
  public static void main(String[] args) {
    List<Integer> values = List.of(-1, -2, -3, 4, 5, 0, -23, 6, 7, 20, 23, 111, 102);

    System.out.println(filter(values));
  }


  public static List<Integer> filter(List<Integer> values) {
    return values.stream()
        .filter(item -> item % 2 == 0)
        .filter(item -> item > 10)
        .filter(item -> item < 100)
        .toList();
  }

}
