package homework_09;

public class Task2 {

  // Пример использования метода
  public static void main(String[] args) {
    printPowerOfTwo(2);
    printPowerOfTwo(3);
    printPowerOfTwo(4);
  }


  /**
   * Написать метод, принимающий на вход целое число.
   * Метод должен вывести на экран 2 в степени этоЧисло
   * Например: Если в метод пришло число 3 - метод
   * должен вывести число 8 (так как 2 в степени 3 = 8)
   *
   * класс Math для нахождения степени числа использовать нельзя ;)
   */
  public static void printPowerOfTwo(int exponent) {
    int result = 1;

    for (int i = 0; i < exponent; i++) {
      result *= 2;
    }

    System.out.println("2 в степени " + exponent + " = " + result);
  }
}
