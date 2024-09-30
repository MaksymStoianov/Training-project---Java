package homework_10;

import java.util.Arrays;

public class Task1 {
  /**
   * Написать метод со следующим функционалом:
   * <p>
   * На вход метод принимает массив целых чисел и число - длину нового массива. Метод должен создать и распечатать
   * массив заданной в параметрах длинны. В начало массива должны быть скопированы элементы из входящего массива:
   * <p>
   * {0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
   * <p>
   * {0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
   * <p>
   * Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
   */

  public static void main(String[] args) {
    // Пример использования метода
    int[] array1 = {0, 1, 2, 3, 4, 5, 6};
    copyOfArray(array1, 3);

    int[] array2 = {0, 1, 2};
    copyOfArray(array2, 5);
  }


  public static void copyOfArray(int[] original, int newLength) {
    int[] newArray = new int[newLength];

    for (int i = 0; i < newLength; i++) {
      if (i < original.length) {
        newArray[i] = original[i];
      } else {
        newArray[i] = 0;
      }
    }

    System.out.println("Результат: " + Arrays.toString(newArray));
  }

}
