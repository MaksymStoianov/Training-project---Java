package homework_38.Task2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * MyComparator
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class MyComparator implements Comparator<Integer> {

  @Override
  public int compare(Integer a, Integer b) {
    boolean isAEven = a % 2 == 0;
    boolean isBEven = b % 2 == 0;

    if (isAEven && !isBEven) {
      // a - четное
      // b - нечетное
      return -1;
    } else if (!isAEven && isBEven) {
      // a - нечетное
      // b - четное
      return 1;
    } else {
      // Оба числа либо четные, либо нечетные
      return a.compareTo(b);
    }
  }

  public static void main(String[] args) {
    Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };

    Arrays.sort(integers, new MyComparator());

    System.out.println(Arrays.toString(integers));
    // return: [2, 4, 6, 8, 1, 3, 5, 7, 7, 9]
  }
}
