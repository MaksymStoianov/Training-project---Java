package homeworks.homework_05;

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    // Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name:");

    // Используя Scanner, сохраните имя в переменную типа String.
    String input = scanner.nextLine();

    // Выведите на экран количество символов в имени пользователя.
    System.out.println("name.langth: " + input.length());

    // Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
    char firstChar = input.charAt(0);
    char lastChar = input.charAt(input.length() -1 );

    // Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
    System.out.println("firstChar: " + (int) firstChar);
    System.out.println("lastChar: " + (int) lastChar);
  }
}
