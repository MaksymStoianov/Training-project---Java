package lessons.lesson_44;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * FunctionalInterfaces
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class FunctionalInterfaces {
  public static void main(String[] args) {
    List<Integer> values = new ArrayList<>(List.of(-1, 1, -2, 2, -3, 3, -4, 4));

    List<Integer> response1 = filterByPredicate(values, item -> item < 0);
    System.out.println(response1);

    List<Integer> response2 = filterByPredicate(values, item -> item >= 0);
    System.out.println(response2);

    Predicate<String> isLengthGreat5 = str -> str.length() > 5;
    Predicate<String> isContainsJava = str -> str.contains("Java");
    Predicate<String> combineStr = isLengthGreat5.and(isContainsJava);
    System.out.println(combineStr.and(str -> str.contains("J")).test("Java!!!"));
  }


  public static List<Integer> filterByPredicate(List<Integer> values, Predicate<Integer> predicate) {
    List<Integer> result = new ArrayList<>();

    for (Integer value : values) {
      if (predicate.test(value)) {
        result.add(value);
      }
    }

    return result;
  }

}
