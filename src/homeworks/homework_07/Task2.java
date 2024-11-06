package homeworks.homework_07;

import java.util.Random;

public class Task2 {
  public static void main(String[] args) {
    // Запишите в 4 переменные случайные числа от 0 до 100.

    Random random = new Random();

    int var1 = random.nextInt(101);
    int var2 = random.nextInt(101);
    int var3 = random.nextInt(101);
    int var4 = random.nextInt(101);

    // Выведите все 4 числа на экран.
    System.out.println(
        "var1: " + var1
            + "\nvar2: " + var2
            + "\nvar3: " + var3
            + "\nvar4: " + var4
    );

    int result = var1;

    if (var2 > result) {
      result = var2;
    }

    if (var3 > result) {
      result = var3;
    }

    if (var4 > result) {
      result = var4;
    }

    System.out.println("Максимальное число: " + result);
  }
}
