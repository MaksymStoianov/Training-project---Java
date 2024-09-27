package lesson_08.homework_08;

public class Task3 {
  public static void main(String[] args) {
// Используйте цикл while для решения задачи:
// Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.

    int i = 0;
    while (i < 100) {
      i++;
      if (i % 5 == 0) {
        System.out.println(i);
      }
    }

    // Task 3.1 * (Опционально)
    // Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.

    i = 0;
    int count = 0;
    while (i < 100) {
      i++;
      if (i % 5 == 0 && count < 7) {
        System.out.println(i);
        count ++;
      }
    }
  }
}
