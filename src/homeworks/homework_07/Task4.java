package homeworks.homework_07;

import java.util.Scanner;

public class Task4 {
  public static void main(String[] args) {
    // Напишите программу с использованием оператора switch:
    // Программа просит пользователя ввести число от 1 до 7. Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число от 1 до 7:");

    int input = scanner.nextInt();
    String result = "";

    // Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
    switch (input) {
      case 1:
        result = "Понедельник";
        break;

      case 2:
        result = "Вторник";
        break;

      case 3:
        result = "Среда";
        break;

      case 4:
        result = "Четверг";
        break;

      case 5:
        result = "Пятница";
        break;

      case 6:
      case 7:
        result = "Выходной";
        break;
    }

    System.out.println(result);
  }
}
