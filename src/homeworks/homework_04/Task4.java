package homeworks.homework_04;

public class Task4 {
  public static void main(String[] args) {
    // Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.
    // Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.
    // Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных функций), и выведите результат.

    char ch1 = 'm';
    char ch2 = 'a';
    char ch3 = 'k';
    char ch4 = 's';
    char ch5 = 'y';
    char ch6 = 'm';

    // Ваш код
    System.out.println("My name: " +
        (char) (ch1 - 32) +
        (char) (ch2 - 32) +
        (char) (ch3 - 32) +
        (char) (ch4 - 32) +
        (char) (ch5 - 32) +
        (char) (ch6 - 32)
    );
  }
}