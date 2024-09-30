package homework_08;

public class Task1 {
  public static void main(String[] args) {
    // Найдите произведение всех чисел от 1 до 15 включительно.
    int result = 0;

    int i = 1;
    while (i <= 15) {
      result = (result > 0 ? result * i : i);
      i++;
    }

    // Результат выведите на экран
    System.out.println("Произведение всех чисел от 1 до 15: " + result); // 2004310016
  }
}
