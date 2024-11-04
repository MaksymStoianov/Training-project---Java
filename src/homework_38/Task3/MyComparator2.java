package homework_38.Task3;

import homework_38.Task2.MyComparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * MyComparator2
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class MyComparator2 implements Comparator<Integer> {

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
      return isAEven ? a.compareTo(b) : b.compareTo(a);
    }
  }

  public static void main(String[] args) {
    Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };

    Arrays.sort(integers, new MyComparator2());

    System.out.println(Arrays.toString(integers));
    // return: [2, 4, 6, 8, 9, 7, 7, 5, 3, 1]
  }

}
