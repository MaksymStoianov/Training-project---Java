package lesson_08.homework_08;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
  public static void main(String[] args) {
    // Написать метод, который принимает массив строк.
    // Вывести на экран все символы самой длинной строки из массива.

    String[] colors = {
        "Red",
        "Blue",
        "Green"
    };

    // Найти самую длинную строку
    String result = "";
    for (String color : colors) {
      if (color.length() > result.length()) {
        result = color;
      }
    }
    System.out.println(result);

    // Вывести символы самой длинной строки
    for (int i = 0, leng = result.length(); i < leng; i++) {
      System.out.println(result.charAt(i));
    }
  }
}