package lesson_08.homework_08;

import java.util.Scanner;

public class Task5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число:");
    String input = scanner.nextLine();

    int result = 0;
    String info = "";

    int i = 0;
    do {
      result += input.charAt(i) - '0';
      info = info + (i == 0 ? "" : " + ") + input.charAt(i);
      i++;
    } while (input.length() > i);

    System.out.println("Спасибо!\n" + info + " = " + result);
  }
}
