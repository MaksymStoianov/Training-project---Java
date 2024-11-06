package homeworks.homework_06.old;

// Дан следующий код. Вашей задачей является предсказать, какой вывод будет напечатан в консоли после выполнения программы.

public class BooleanTest {
  public static void main(String[] args) {
    int a = 8;
    int b = 3;
    boolean result;

    result = (a + b) > 10;
    System.out.println("Result 1: " + result); // true
    // 11 больше 10, верно

    result = (a - b) == 5;
    System.out.println("Result 2: " + result); // true
    // 5 равно 5, верно

    result = (a * b) != 24;
    System.out.println("Result 3: " + result); // false
    // 24 не равно 24, неверно

    result = (a / b) >= 2;
    System.out.println("Result 4: " + result); // true
    // 2.6(6) больше или рано 2, верно

    result = !(a % b == 2);
    System.out.println("Result 5: " + result); // false
    // остаток от деления 8 на 3 = 2, далее 2 равно 2, и отрицаем это, результат неверно
  }
}