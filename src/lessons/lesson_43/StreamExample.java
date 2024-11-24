package lessons.lesson_43;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * StreamExample
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class StreamExample {
  public static void main(String[] args) {
    //    task1();
    //    task2();
    //    task3();
    task4();
  }


  private static void task1() {
    List<Integer> values = List.of(-1, -2, -3, 4, 5, 0, -23, 6, 7);

    //    List<Integer> result = new ArrayList<>();
    //
    //    for (Integer item :values) {
    //      if (item > 0) {
    //        result.add(item);
    //      }
    //    }
    //
    //    result.sort(Comparator.naturalOrder());
    //    System.out.println(result);

    List<Integer> result = values.stream()
        .filter(item -> item > 0)
        .sorted()
        .collect(Collectors.toList());

    System.out.println(result);
  }


  private static List<Cat> getListCars() {
    return List.of(
        new Cat("Cat1", 5, "green"),
        new Cat("Cat2", 7, "red"),
        new Cat("Cat3", 3, "blue"),
        new Cat("Car4", 5, "dark")
    );
  }


  private static void task2() {
    getListCars()
        .stream()
        .filter(item -> item.getWeight() > 4)
        .filter(item -> item.getWeight() < 7)
        .toList()
        .forEach(System.out::println);
  }


  private static void task3() {
    getListCars()
        .stream()
        .filter(item -> item.getName().length() > 3)
        .filter(item -> item.getName().length() < 7)
        .forEach(System.out::println);
  }


  private static void task4() {
    getListCars()
        .stream()
        .map(Cat::getName)
        .forEach(System.out::println);
  }
}
