package homework_10;

import java.util.Arrays;

public class Task4 {

  /**
   * Дано: Два отсортированных массива целых чисел.
   * Вам нужно найти элемент, который будет находиться
   * на k-й позиции в объединенном отсортированном массиве.
   *
   * Массив 1 - {100, 112, 256, 349, 770}
   * Массив 2 - {72, 86, 113, 119, 265, 445, 892}
   * k = 7
   * Copy
   * Вывод : 256
   */
  public static void main(String[] args) {
    int[] array1 = {100, 112, 256, 349, 770};
    int[] array2 = {72, 86, 113, 119, 265, 445, 892};
    int k = 7;

    int[] newArray = mergeArrays(array1, array2);
    System.out.println("Объединенный массив: ");
    System.out.println(Arrays.toString(newArray));

    int[] newArray2 = sortArray(newArray);
    System.out.println("\nОтсортированный массив: ");
    System.out.println(Arrays.toString(newArray2));

    System.out.println("\nИскомое число: " + newArray2[k - 1]);
  }



  public static int[] mergeArrays(int[] array1, int[] array2) {
    int[] mergedArray = new int[array1.length + array2.length];

    int i = 0;
    while (i < array1.length) {
        mergedArray[i] = array1[i];
        i++;
    }

    int j = 0;
    while (j < array2.length) {
      mergedArray[i + j] = array2[j];
      j++;
    }

    return mergedArray;
  }



  public static int[] sortArray(int[] array) {
    int n = array.length;
    boolean swapped;

    for (int i = 0; i < n - 1; i++) {
      swapped = false;

      for (int j = 0; j < n - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          swapped = true;
        }
      }

      if (!swapped) {
        break;
      }
    }

    return array;
  }

}
