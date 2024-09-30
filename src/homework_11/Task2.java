package homework_11;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
  /**
   * Написать метод, который находит
   * среднее значение элементов в массиве (среднее арифметическое).
   */
  public static void main(String[] args) {
    int[] array = createArray(5, 1, 2);

    System.out.println("Массив: ");
    System.out.println(Arrays.toString(array));
    System.out.println("Average: " + averageArray(array));
  }


  public static double averageArray(int[] array) {
    int sum = 0;

    // Проходим по всем элементам массива и суммируем их
    for (int num : array) {
      sum += num;
    }

    // Находим среднее значение
    return (double) sum / array.length;
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
