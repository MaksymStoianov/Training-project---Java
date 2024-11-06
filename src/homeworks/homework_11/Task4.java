package homeworks.homework_11;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

  /**
   * Написать метод, который удаляет все вхождения
   * заданного числа из массива и возвращает новый
   * массив без этого числа.
   */

  public static void main(String[] args) {
    int[] array = createArray(10, 1, 3);
    int target = 2;
    System.out.println("Массив: " + Arrays.toString(array));

    int[] result = removeElement(array, target);
    System.out.println("Новый массив: " + Arrays.toString(result));
  }


  public static int[] removeElement(int[] array, int target) {
    int count = 0;
    for (int num : array) {
      if (num == target) {
        count++;
      }
    }

    if (count == 0) {
      return array;
    }

    int[] result = new int[array.length - count];
    int index = 0;

    for (int num : array) {
      if (num != target) {
        result[index++] = num;
      }
    }

    return result;
  }


  /**
   * Метод для заполнения массива случайными числами
   */
  public static int[] createArray(int amount, int min, int max) {
    Random random = new Random();
    int[] array = new int[amount];
    int primeCount = 0;

    // Заполняем массив случайными числами
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt((max - min) + 1) + min;
    }

    return array;
  }

}
