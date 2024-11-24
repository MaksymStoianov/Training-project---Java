package homeworks.homework_06;

import java.util.Random;

public class Task2 {
  public static void main(String[] args) {
    // Создайте две переменные типа int.

    Random random = new Random();

    // В первую переменную запишите случайное значение от 0 до 50.
    int var1 = random.nextInt(51);

    // Во вторую переменную случайное значение от 0 до 100.
    int var2 = random.nextInt(100);

    //  (опционально) Во вторую переменную случайное значение от -20 до 30.
    var2 = random.nextInt(51) - 20;

    // Проверьте:
    // равны ли переменные,
    System.out.println(var1 + " == " + var2 + ": " + (var1 == var2));

    // не равны ли они,
    System.out.println(var1 + " != " + var2 + ": " + (var1 != var2));

    // больше ли a, чем b,
    System.out.println(var1 + " > " + var2 + ": " + (var1 > var2));

    // и меньше ли b, чем a.
    System.out.println(var1 + " < " + var2 + ": " + (var1 < var2));
  }
}
