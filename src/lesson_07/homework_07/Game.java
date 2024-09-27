package lesson_07.homework_07;

import java.util.Random;

public class Game {
  public static void main(String[] args) {
    Random random = new Random();
    int counter = 0;

    while (true) {
      counter++;

      // Бросок костей
      int val1 = random.nextInt(6) + 1;
      int val2 = random.nextInt(1, 7);

      // Вывод значений костей
      System.out.println("Бросок " + counter + ": " + val1 + " и " + val2);

      // Проверка на дубль
      if (val1 == val2) {
        System.out.println("Дубль!");
      }

      // Проверка на окончание игры
      else if ((val1 == 3 && val2 == 5) || (val1 == 5 && val2 == 3)) {
        System.out.println("Конец игры");
        break;
      }
    }

  }
}
