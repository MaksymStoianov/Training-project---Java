package homeworks.homework_08;

import java.util.Scanner;

public class Task4 {
  public static void main(String[] args) {
    // Напишите программу, которая просит пользователя ввести слово "hello". Если пользователь вводит правильное слово, программа благодарит его и завершает работу. Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.
    Scanner scanner = new Scanner(System.in);
    String input;

    // Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова, и выведите это количество на экран.
    int count = 0;

    do {
      System.out.println("Введите слово: \"hello\".");
      input = scanner.nextLine();
      count++;
    } while (!input.equals("hello"));

    System.out.println("Спасибо!\nКоличество попыток: " + count);

  }
}
