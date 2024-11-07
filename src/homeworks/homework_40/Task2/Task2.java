package homeworks.homework_40.Task2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Task2
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task2 {
  public static void main(String[] args) {
    Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
    Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

    System.out.println(SetUtils.union(set1, set2));
    System.out.println(SetUtils.intersection(set1, set2));
    System.out.println(SetUtils.difference(set1, set2));
  }
}
