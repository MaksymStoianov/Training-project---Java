package homeworks.homework_07;

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    // Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число на выбор: 1, 2 или 3:");

    int input = scanner.nextInt();

    // Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
    String result = switch (input) {
      case 1 -> "Один";
      case 2 -> "Два";
      case 3 -> "Три";
      default -> String.valueOf(input);
    };

    System.out.println("Вы ввели число: " + result);
  }
}
