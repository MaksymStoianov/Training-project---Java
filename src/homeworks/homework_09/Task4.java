package homeworks.homework_09;

import java.util.Arrays;
import java.util.Random;

public class Task4 {


  public static void main(String[] args) {
    int[] array = createArray(50, 1, 100);

    System.out.println("Массив случайных чисел:");
    System.out.println(Arrays.toString(array));

    findPrimeNumbers(array);
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


  public static void findPrimeNumbers(int[] array) {
    System.out.println("\nПростые числа в массиве:");

    int count = 0;

    for (int number : array) {
      if (isPrime(number)) {
        System.out.print(number + " ");
        count++;
      }
    }

    System.out.println("\nКоличество простых чисел: " + count);
  }

}

