package homework_39.Task2;

import homework_39.TextStyle;
import lesson_38.Color;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Main
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Main {
  private static final Random random = new Random();


  public static void main(String[] args) {
    int size = 5_000;
    int min = 0;
    int max = 1_000;
    List<Integer> ints1 = new ArrayList<>();
    List<Integer> ints2 = new LinkedList<>();

    // Заполнить массив случайными значениями от 0 до 1_000.
    fillRandomValues(ints1, size, min, max);
    fillRandomValues(ints2, size, min, max);


    long startTime1, endTime1, startTime2, endTime2;


    System.out.println(String.format(
        Color.CYAN + "" + TextStyle.BOLD + "%-25s %-10s %-10s" + Color.RESET,
        "",
        "ArrayList",
        "LinkedList"
    ));

    startTime1 = System.currentTimeMillis();
    getElementByIndex(ints1);
    endTime1 = System.currentTimeMillis();

    startTime2 = System.currentTimeMillis();
    getElementByIndex(ints2);
    endTime2 = System.currentTimeMillis();

    System.out.println(String.format(
        Color.CYAN + "%-25s" + Color.RESET + " %-10s %-10s",
        "getElementByIndex()",
        (endTime1 - startTime1) + " ms",
        (endTime2 - startTime2) + " ms"
    ));


    startTime1 = System.currentTimeMillis();
    insertRandomValues(ints1, size, min, max);
    endTime1 = System.currentTimeMillis();

    startTime2 = System.currentTimeMillis();
    insertRandomValues(ints2, size, min, max);
    endTime2 = System.currentTimeMillis();

    System.out.println(String.format(
        Color.CYAN + "%-25s" + Color.RESET + " %-10s %-10s",
        "insertRandomValues()",
        (endTime1 - startTime1) + " ms",
        (endTime2 - startTime2) + " ms"
    ));


    startTime1 = System.currentTimeMillis();
    deleteByRandomIndex(ints1, 1_000);
    endTime1 = System.currentTimeMillis();

    startTime2 = System.currentTimeMillis();
    deleteByRandomIndex(ints2, 1_000);
    endTime2 = System.currentTimeMillis();

    System.out.println(String.format(
        Color.CYAN + "%-25s" + Color.RESET + " %-10s %-10s",
        "deleteByRandomIndex()",
        (endTime1 - startTime1) + " ms",
        (endTime2 - startTime2) + " ms"
    ));


    startTime1 = System.currentTimeMillis();
    deleteByValue(ints1, 1_000, 0, 10_000);
    endTime1 = System.currentTimeMillis();

    startTime2 = System.currentTimeMillis();
    deleteByValue(ints2, 1_000, 0, 10_000);
    endTime2 = System.currentTimeMillis();

    System.out.println(String.format(
        Color.CYAN + "%-25s" + Color.RESET + " %-10s %-10s",
        "deleteByValue()",
        (endTime1 - startTime1) + " ms",
        (endTime2 - startTime2) + " ms"
    ));
  }


  /**
   * Заполняет коллекцию случайными значениями.
   *
   * @param list
   * @param size
   * @param min
   * @param max
   */
  public static void fillRandomValues(List<Integer> list, int size, int min, int max) {
    for (int i = 0; i < size; i++) {
      list.add(random.nextInt(max - min + 1) + min);
    }
  }


  /**
   * Перебирает все элементы и получает значение по индексу.
   *
   * @param list Список 1.
   */
  public static <T> void getElementByIndex(List<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      list.get(i);
    }
  }


  /**
   * Вставляет новые значения по случайному индексу.
   *
   * @param list
   */
  public static <T> void insertRandomValues(List<Integer> list, int count, int min, int max) {
    for (int i = 0; i < count; i++) {
      int index = random.nextInt(list.size());
      int value = random.nextInt(max - min + 1) + min;
      list.add(index, value);
    }
  }


  /**
   * Добавляет элемент по случайному индексу.
   *
   * @param list
   * @param count
   */
  private static void deleteByRandomIndex(List<Integer> list, int count) {
    for (int i = 0; i < count; i++) {
      if (!list.isEmpty()) {
        int index = random.nextInt(list.size());
        list.remove(index);
      }
    }
  }


  /**
   * Удаляет элементы по значению.
   *
   * @param list
   * @param count
   * @param min
   * @param max
   */
  private static void deleteByValue(List<Integer> list, int count, int min, int max) {
    for (int i = 0; i < count; i++) {
      int value = random.nextInt(max - min + 1) + min;
      list.remove(Integer.valueOf(value));
    }
  }


  /**
   * @param value
   */
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
