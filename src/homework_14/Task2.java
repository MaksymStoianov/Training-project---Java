package homework_14;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
  /**
   * Сумма четных чисел
   * Напишите метод, который вычисляет сумму всех четных чисел в массиве.
   */
  public static void main(String[] args) {
    int[] array = createArray(10, 1, 2);
    System.out.println("Массив: " + Arrays.toString(array));

    System.out.println("Сумма четных чисел: " + sumEvenNumbers(array));
  }



  public static int sumEvenNumbers(int[] numbers) {
    int sum = 0;

    for (int number : numbers) {
      if (number % 2 == 0) {
        sum += number;
      }
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
