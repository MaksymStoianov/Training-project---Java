package homework_09.old;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] array4 = {1, 3, 7, 8, 10, 15, 17, 17, 18, 26, 27, 27, 28, 29, 30, 31, 33, 36, 37, 39, 40, 43, 43, 43, 43, 44, 46, 47, 48, 49};
    int number4 = 29;
    int result4 = ArrayUtils.binarySearch(array4, number4);
    System.out.println(Arrays.toString(array4));
    System.out.println("Индекс числа " + number4 + " (двоичный поиск): " + result4);
  }
}