package homework_07;

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    // Программа предлагает пользователю ввести четырехзначное число.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите четырехзначное число:");

    // Ввод осуществляется только в формате строки (String).
    String input = scanner.nextLine();

    // Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
    if (input.matches("^\\d{4}$")) {
      // Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.

      // Примеры:
      // Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
      // Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.

      // в цифры
      int d1 = input.charAt(0) - '0';
      int d2 = input.charAt(1) - '0';
      int d3 = input.charAt(2) - '0';
      int d4 = Character.getNumericValue(input.charAt(3));

      // Вычисление суммы первых двух цифр и последних двух цифр
      int sum1 = d1 + d2;
      int sum2 = d3 + d4;
      String result = "Число " + input + " -> (" + d1 + "+" + d2 + ") = " + sum1 + "; (" + d3 + "+" + d4 + ") = " + sum2 + "; ";

      // Проверка, является ли число "счастливым"
      if (sum1 == sum2) {
        System.out.println(result + sum1 + " равно " + sum2 + " - число счастливое.");
      } else {
        System.out.println(result + sum1 + " не равно " + sum2 + " - число НЕ является счастливым.");
      }
    } else {
      System.out.println("Введенное значение не является четырехзначным числом.");
    }
  }
}
