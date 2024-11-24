package homeworks.homework_11;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

  /**
   * Написать метод, который считает сумму всех элементов в массиве.
   */
  public static void main(String[] args) {
    int[] array = createArray(5, 1, 2);

    System.out.println("Массив: ");
    System.out.println(Arrays.toString(array));
    System.out.println("Сумма: " + sumArray(array));
  }


  public static int sumArray(int[] array) {
    int sum = 0;

    // Проходим по всем элементам массива и добавляем их к сумме
    for (int num : array) {
      sum += num;
    }

    return sum;
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
