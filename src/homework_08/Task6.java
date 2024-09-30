package homework_08;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
  public static void main(String[] args) {
    // Создать массив целых чисел произвольной длины от 5 до 15.
    Random random = new Random();
    int arrLength = random.nextInt(11) + 5;
    int[] arr = new int[arrLength];

    // Заполнить массив случайными значениями от -50 до 50.
    for (int i = 0, max = arr.length; i < max; i++) {
      arr[i] = random.nextInt(101) - 50;
    }

    System.out.println("Создан массив с длинной: " + arrLength);
    System.out.println("arr: " + Arrays.toString(arr));

    // Вывести на экран:

    int max = 0;
    int min = 0;
    int sum = 0;
    for (int i = 0, leng = arr.length; i < leng; i++) {
      // Максимальное значение в массиве
      if (max < arr[i]) {
        max = arr[i];
      }

      // Минимальное значение в массиве
      if (min > arr[i]) {
        min = arr[i];
      }

      // Сумма
      sum += arr[i];
    }

    // Среднее арифметическое всех значений в массиве
    System.out.printf("Max: %d, min: %d, average: %.1f%n", max, min, (double) sum / arrLength);
  }
}
