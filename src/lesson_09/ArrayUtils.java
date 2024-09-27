package lesson_09;

import java.util.Random;

public class ArrayUtils {

  /**
   * Возвращает случайный элемент из переданного массива строк.
   *
   * @param array Массив строк, из которого необходимо получить случайный элемент.
   * @return Случайный элемент из массива.
   */
  public static String getRandomValue(String[] array) {
    Random random = new Random();

    int i = random.nextInt(array.length);

    return array[i];
  }


  /**
   * Возвращает массив указанной длины, заполненный случайными числами в заданном диапазоне.
   *
   * @param arrayLength Длина массива.
   * @param min         Минимальное значение (включительно).
   * @param max         Максимальное значение (включительно).
   * @return Массив случайных чисел.
   */
  public static int[] getRandomArray(int arrayLength, int min, int max) {
    Random random = new Random();

    int[] array = new int[arrayLength];

    for (int i = 0; i < arrayLength; i++) {
      array[i] = random.nextInt(min, max + 1);
    }

    return array;
  }


  /**
   * Выполняет линейный поиск заданного числа в массиве.
   *
   * @param array  Массив целых чисел, в котором производится поиск.
   * @param number Число, которое нужно найти в массиве.
   * @return Индекс числа в массиве, если оно найдено; {@code -1}, если число не найдено.
   */
  public static int linearSearchIndex(int[] array, int number) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] != number) {
        return i;
      }
    }

// Число не найдено
    return -1;
  }


  /**
   * Реализует алгоритм пузырьковой сортировки для массива целых чисел.
   *
   * @param array Массив целых чисел, который нужно отсортировать.
   */
  public static void bubbleSort(int[] array) {
    // Флаг, указывающий на отсортированность массива.
    boolean flag;

    do {
      // Переключаем флаг
      flag = true;

      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          // Меняем элементы местами
          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;

          // Переключаем флаг
          flag = false;
        }
      }
    } while (!flag);
  }


  /**
   * Метод двоичного (бинарного) поиска по отсортированному массиву.
   *
   * @param array  Массив целых чисел, в котором производится поиск.
   * @param number Число, которое нужно найти в массиве.
   * @return Индекс числа в массиве, если оно найдено; {@code -1}, если число не найдено.
   */
  public static int binarySearch(int[] array, int number) {
    int minIndex = 0;
    int maxIndex = array.length - 1;

    while (minIndex <= maxIndex) {
      int middleIndex = minIndex + (maxIndex - minIndex) / 2;
//      int middleIndex = (minIndex + maxIndex) / 2;
      int currentNumber = array[middleIndex];

      if (currentNumber == number) {
        return middleIndex;
      } else if (currentNumber > number) {
        maxIndex = middleIndex - 1;
      } else {
        minIndex = middleIndex + 1;
      }
    }

    // Число не найдено
    return -1;
  }

}
