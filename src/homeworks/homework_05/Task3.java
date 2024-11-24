package homeworks.homework_05;

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    // Попросите пользователя ввести строку чётной длины с клавиатуры.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите строку чётной длины:");

    String input = scanner.nextLine();

    char char1 = input.charAt(input.length() / 2);
    char char2 = input.charAt(input.length() / 2 + 1);

    // Распечатайте два средних символа строки.
    System.out.println(char1 + "" + char2);
  }
}
