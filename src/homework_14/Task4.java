package homework_14;

import java.util.Scanner;

public class Task4 {
  /**
   * Подсчет гласных и согласных Напишите программу, которая просит пользователя ввести слово и подсчитывает количество
   * гласных и согласных букв в этом слове.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Просим пользователя ввести слово
    System.out.print("Введите слово: ");
    // Приводим к нижнему регистру для упрощения проверки
    String word = scanner.nextLine().toLowerCase();

    int vowelCount = 0;
    int consonantCount = 0;

    // Перебираем все символы слова
    for (int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);

      if (isVowel(letter)) {
        vowelCount++;
      } else {
        consonantCount++;
      }
    }

    System.out.println("Количество гласных: " + vowelCount);
    System.out.println("Количество согласных: " + consonantCount);
  }


  /**
   * Метод для проверки, является ли символ гласной буквой.
   */
  public static boolean isVowel(char letter) {
    return "aeiouаеиоуыэюя".indexOf(letter) != -1;
  }
}
