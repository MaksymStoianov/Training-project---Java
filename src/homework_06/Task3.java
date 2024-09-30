package homework_06;

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    // Попросите пользователя ввести целое число с клавиатуры.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ввести целое число:");
    int input = scanner.nextInt();

    // Ваша программа должна вывести строку в формате:
    boolean is1 = (input % 2 == 0);
    boolean is2 = (input % 3 == 0);
    System.out.println("Число: " + input + " четное: " + is1 + "; кратно 3: " + is2 + "; четное и кратное 3: " + (is1 && is2));
  }
}
