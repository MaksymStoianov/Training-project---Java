package lessons.lesson_44;

import lessons.lesson_38.Color;
import lessons.lesson_38.TextStyle;

import java.util.*;
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
    //    task4();
    //    task6();
    //    task7();
    //    task8();

    task9();
  }

  private static void task9() {
    List<Cat> cats = new ArrayList<>(
        List.of(
            new Cat("Petr", 2500, 25, "red", "IT"),
            new Cat("Silvia", 1500, 22, "blue", "IT"),
            new Cat("Stefan", 2500, 30, "green", "Management"),
            new Cat("Olivia", 2700, 25, "red", "Management"),
            new Cat("Sebastian", 3500, 24, "blue", "IT"),
            new Cat("Hanna", 1300, 35, "red", "IT"),
            new Cat("Petr", 2500, 25, "green", "Cleaning"),
            new Cat("Petr", 2500, 25, "green", "Cleaning"),
            new Cat("John", 3200, 19, "blue", "IT")
        )
    );


    System.out.println("\n\n======== 1\n");
    // Уникальные в рамках отдела

    Map<String, Set<Cat>> result1 = cats
        .stream()
        .collect(Collectors.groupingBy(
            Cat::getGroup,
            Collectors.toSet()
        ));

    result1.forEach((key, values) -> {
      System.out.println(Color.CYAN + "" + TextStyle.BOLD + key + Color.BLACK);
      values.forEach(System.out::println);
      System.out.println();
    });


    System.out.println("\n\n======== 2\n");
    // Количество по группам

    Map<String, Long> result2 = cats
        .stream()
        .collect(Collectors.groupingBy(
            Cat::getGroup,
            Collectors.counting()
        ));

    result2.forEach((key, value) -> {
      System.out.println(Color.CYAN + "" + TextStyle.BOLD + key + Color.BLACK + ": " + value);
    });


    System.out.println("\n\n======== 3\n");
    // Средний возраст по группам

    Map<String, Double> result3 = cats
        .stream()
        .collect(Collectors.groupingBy(
            Cat::getGroup,
            Collectors.averagingDouble(Cat::getAge)
        ));

    result3.forEach((key, value) -> {
      System.out.println(Color.CYAN + "" + TextStyle.BOLD + key + Color.BLACK + ": " + value);
    });


    System.out.println("\n\n======== 4\n");
    // Средний возраст по группам, вывод списка Weight

    Map<String, List<Integer>> result4 = cats
        .stream()
        .collect(
            Collectors.groupingBy(
                Cat::getGroup,
                Collectors.mapping(
                    Cat::getWeight,
                    Collectors.toList()
                )
            )
        );

    result4.forEach((key, value) -> {
      System.out.println(Color.CYAN + "" + TextStyle.BOLD + key + Color.BLACK + ": " + value);
    });


    System.out.println("\n\n======== 5\n");
    //

    IntSummaryStatistics result5 = cats
        .stream()
        .collect(
            Collectors.summarizingInt(Cat::getWeight)
        );

    System.out.println(Color.CYAN + "" + TextStyle.BOLD + "min" + Color.BLACK + ": " + result5.getMin());
    System.out.println(Color.CYAN + "" + TextStyle.BOLD + "max" + Color.BLACK + ": " + result5.getMax());
    System.out.println(Color.CYAN + "" + TextStyle.BOLD + "avg" + Color.BLACK + ": " + result5.getAverage());
    System.out.println(Color.CYAN + "" + TextStyle.BOLD + "count" + Color.BLACK + ": " + result5.getCount());
    System.out.println(Color.CYAN + "" + TextStyle.BOLD + "sum" + Color.BLACK + ": " + result5.getSum());

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
        new Cat("Cat33", 3, "blue"),
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

  private static void task6() {
    getListCars()
        .stream()
        .map(Cat::getName)
        .filter(item -> item.length() < 5)
        .map((item) -> "1. " + item)
        .forEach(System.out::println);
  }

  private static void task7() {
    Cat cat1 = new Cat("Cat1", 5, "green");
    Cat cat2 = new Cat("Cat2", 7, "red");
    Cat cat3 = new Cat("Cat3", 3, "blue");
    Cat cat4 = new Cat("Car4", 5, "dark");

    Cat[] cats = new Cat[]{cat1, cat2, null, cat3, cat4};

    Arrays.stream(cats)
        .filter(Objects::nonNull)
        .filter(item -> item.getWeight() > 3)
        .toList()
        .forEach(System.out::println);
  }

  private static void task8() {
    Optional<String> name = getListCars()
        .stream()
        .filter(Objects::nonNull)
        .map(Cat::getName)
        .filter(Objects::nonNull)
        .max(Comparator.comparingInt(String::length));

    if (name.isEmpty()) {
      System.out.println("Нет имен!");
    } else {
      System.out.println(name.get());
    }
  }


}
