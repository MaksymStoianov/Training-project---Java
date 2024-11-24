package homeworks.homework_09;

import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    /*
     * Написать метод, принимающий на вход строку.
     * Метод должен вывести на экран число,
     * соответсвующее количеству символов в строке.
     *
     * Например: Если в метод пришла строка "hello"
     * - метод должен вывести число 5 (так как в
     * строке hello 5 символов)
     */
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    System.out.println("Длинна введенной строки: " + input.length());
  }
}
