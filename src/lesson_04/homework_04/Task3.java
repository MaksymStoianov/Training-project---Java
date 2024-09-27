package lesson_04.homework_04;

public class Task3 {
  public static void main(String[] args) {
    // Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
    long bigNumber = 15_000_000_000L;

    // Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
    int smallNumber = (int) bigNumber;

    // Выводит значение smallNumber на экран.
    System.out.println("Значение smallNumber: " + smallNumber);
  }
}
