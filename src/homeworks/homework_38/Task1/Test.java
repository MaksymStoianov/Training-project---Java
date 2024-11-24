package homeworks.homework_38.Task1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Test
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Test {
  public static void main(String[] args) {
    Sportsman[] arr = new Sportsman[5];

    arr[0] = new Sportsman("Sportsman1", 12, 4.2);
    arr[1] = new Sportsman("Sportsman2", 23, 3.1);
    arr[2] = new Sportsman("Sportsman3", 32, 4.7);
    arr[3] = new Sportsman("Sportsman4", 14, 4.4);
    arr[4] = new Sportsman("Sportsman5", 18, 4.9);

    SportsmanScoreComparator sportsmanScoreComparator = new SportsmanScoreComparator();

    Arrays.sort(arr, sportsmanScoreComparator);

    System.out.println(Arrays.toString(arr));



    // Анонимный класс
    Arrays.sort(
        arr, new Comparator<Sportsman>() {
          @Override
          public int compare(Sportsman o1, Sportsman o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
          }
        }
    );

    System.out.println(Arrays.toString(arr));
  }
}
