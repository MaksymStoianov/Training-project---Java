package homework_10;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

  /**
   * Написать метод, принимающий на вход массив целых чисел.
   * Метод должен вернуть массив, состоящий только из простых
   * чисел, присутствующих в изначальном массиве
   */

  public static void main(String[] args) {
    int[] array = createArray(50, 1, 100);

    System.out.println("Массив случайных чисел:");
    System.out.println(Arrays.toString(array));

    int[] result = getPrimeNumbers(array);
    System.out.println("\nМассив простых чисел:");
    System.out.println(Arrays.toString(result));

  }


  /**
   * Метод для проверки, является ли число простым
   */
  public static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }

    return true;
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


  public static int[] getPrimeNumbers(int[] array) {

    int primeCount = 0;
    for (int number : array) {
      if (isPrime(number)) {
        primeCount++;
      }
    }

    int[] result = new int[primeCount];
    int index = 0;

    for (int number : array) {
      if (isPrime(number)) {
        result[index++] = number;
      }
    }

    return result;
  }


}
