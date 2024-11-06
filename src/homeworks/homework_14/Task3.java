package homeworks.homework_14;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
  /**
   * Найти второе по величине число в массиве Напишите метод, который находит второе по величине число в массиве целых
   * чисел.
   */
  public static void main(String[] args) {
    int[] array = createArray(10, 1, 10);
    System.out.println("Массив: " + Arrays.toString(array));

    int[] array2 = getPrimeNumbers(array);
    System.out.println("\nМассив с простыми числами: " + Arrays.toString(array2));

    int max2 = getSecondMax(array2);
    System.out.println("\nВторое по величине простое число: " + max2);
  }


  public static int getSecondMax(int[] array) {
    int max = 0;
    int secondMax = 0;

    // Находим максимальное число
    for (int number : array) {
      if (number > max) {
        max = number;
      }
    }

    // Находим второе по величине число
    for (int number : array) {
      if (number > secondMax && number < max) {
        secondMax = number;
      }
    }

    return secondMax;
  }


  /**
   * Метод для заполнения массива случайными числами.
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


  /**
   * Возвращает массив с простыми числами.
   */
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


  /**
   * Метод для проверки, является ли число простым.
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

}
