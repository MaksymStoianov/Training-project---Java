package homeworks.homework_09;

public class Task2 {


  public static void main(String[] args) {
    int[] array = {1, 4, 3, 6, 7};

    System.out.println("Обратный порядок:");
    printArray(array);

    System.out.println("\nЧасть в прямом, и часть в обратном порядке с индексом 2:");
    printArray(array, 2);

    System.out.println("\nПечать (reverse = true):");
    printArray(array, true);

    System.out.println("\nПечать (reverse = false):");
    printArray(array, false);
  }


  /**
   * Написать метод, принимающий массив целых чисел
   * и распечатывающий массив в обратной последовательности.
   */
  public static void printArray(int[] array) {
    System.out.print("[");

    for (int i = array.length - 1; i >= 0; i--) {
      System.out.print(array[i]);

      if (i != 0) {
        System.out.print(", ");
      }
    }

    System.out.println("]");
  }


  /**
   * Перегрузить метод, если в него приходит индекс,
   * то часть массива слева до этого индекса распечатывается в обычном
   * порядке, а начиная с этого индекса в обратном:
   */
  public static void printArray(int[] array, int index) {
    System.out.print("[");

    // Печать до индекса в прямом порядке
    for (int i = 0; i < index; i++) {
      System.out.print(array[i]);

      if (i != index - 1) {
        System.out.print(", ");
      }
    }

    // Если индекс не в начале, добавляем запятую перед печатью оставшейся части массива
    if (index != 0 && index != array.length) {
      System.out.print(", ");
    }

    // Печать с индекса в обратном порядке
    for (int i = array.length - 1; i >= index; i--) {
      System.out.print(array[i]);

      if (i != index) {
        System.out.print(", ");
      }
    }

    System.out.println("]");
  }


  /**
   * Еще одна перегрузка: метод принимает массив и булевый флаг.
   * Если флаг == true -> печатает массив в обратном порядке
   * Если флаг == false -> печатает массив в прямом порядке
   */
  public static void printArray(int[] array, boolean reverse) {
    System.out.print("[");

    if (reverse) {
      // Печать в обратном порядке
      for (int i = array.length - 1; i >= 0; i--) {
        System.out.print(array[i]);

        if (i != 0) {
          System.out.print(", ");
        }
      }
    } else {
      // Печать в прямом порядке
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);

        if (i != array.length - 1) {
          System.out.print(", ");
        }
      }
    }

    System.out.println("]");
  }

}
