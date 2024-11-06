package homeworks.homework_39.Task1;

import homeworks.homework_39.TextStyle;
import lessons.lesson_38.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Main
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Main {
  public static void main(String[] args) {
    Random random = new Random();

    List<Integer> ints1 = new ArrayList<>(List.of(1, -2, 3));
    List<Integer> ints2 = new ArrayList<>();

    // Заполнить массив случайными значениями от -5 до 5.
    for (int i = 0, max = ints1.size() * 2; i < max; i++) {
      ints2.add(random.nextInt(11) - 5);
    }

    System.out.println(TextStyle.REVERSE + "Элементы списка 1:" + TextStyle.RESET);
    print(ints1);

    System.out.println(TextStyle.REVERSE + "Элементы списка 2:" + TextStyle.RESET);
    print(ints2);

    List<Integer> result = getCommonElements(ints1, ints2);

    System.out.println(TextStyle.REVERSE + "Общие элементы:" + TextStyle.RESET);
    print(result);
  }


  /**
   * Возвращает список состоящий из элементов, которые присутствуют в обеих коллекциях.
   *
   * @param list1 Список 1.
   * @param list2 Список 2.
   * @return Список состоящий из элементов, которые присутствуют в обеих коллекциях.
   */
  public static <T> List<T> getCommonElements(List<T> list1, List<T> list2) {
    //    List<T> result = new ArrayList<>();
    //
    //    for (T element : list1) {
    //      if (list2.contains(element)) {
    //        result.add(element);
    //      }
    //    }

    List<T> result = new ArrayList<>(list1);

    result.retainAll(list2);

    return result;
  }


  public static <T> void print(List<T> value) {
    StringBuilder formattedOutput1 = new StringBuilder();

    int i = 0;
    for (T element : value) {
      formattedOutput1
          .append(Color.CYAN)
          .append(i++)
          .append(". ")
          .append(Color.RESET)
          .append(element)
          .append("\n");
    }

    System.out.println(formattedOutput1);
  }

}
