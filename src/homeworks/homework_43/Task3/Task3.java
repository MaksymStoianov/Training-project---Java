package homeworks.homework_43.Task3;

import lessons.lesson_43.Cat;

import java.util.List;
import java.util.Objects;

/**
 * Task3
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task3 {
  public static void main(String[] args) {
    List<Person> values = List.of(
        new Person("Person1", 15, "city1"),
        new Person("Person2", 17, "city2"),
        new Person("Person3", 19, "city2"),
        new Person("Person4", 17, "city2")
    );

    System.out.println(filter(values));
  }


  private static List<Person> filter(List<Person> values) {
    return values
        .stream()
        .filter(item -> item.getAge() > 15)
        .filter(item -> Objects.equals("city2", item.getCity()))
        .toList();
  }

}
