package homeworks.homework_18;

/**
 * Calculator
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Calculator {

  /**
   * Выполняет сложение двух целых чисел (`a + b`).
   *
   * @param a Первое число.
   * @param b Второе число.
   * @return Результат сложения чисел `a` и `b`.
   */
  public static int add(int a, int b) {
    return a + b;
  }


  /**
   * Выполняет сложение двух дробных чисел (`a + b`).
   *
   * @param a Первое число.
   * @param b Второе число.
   * @return Результат сложения чисел `a` и `b`.
   */
  public static double add(double a, double b) {
    return a + b;
  }


  /**
   * Выполняет вычитание целых чисел (`a - b`).
   *
   * @param a Первое число.
   * @param b Второе число.
   * @return Результат вычитания числа `b` из числа `a`.
   */
  public static int subtract(int a, int b) {
    return a - b;
  }


  /**
   * Выполняет вычитание дробных чисел (`a - b`).
   *
   * @param a Первое число.
   * @param b Второе число.
   * @return Результат вычитания числа `b` из числа `a`.
   */
  public static double subtract(double a, double b) {
    return a - b;
  }


  /**
   * Выполняет умножение двух целых чисел (`a * b`).
   *
   * @param a Первое число.
   * @param b Второе число.
   * @return Результат умножения чисел `a` и `b`.
   */
  public static int multiply(int a, int b) {
    return a * b;
  }


  /**
   * Выполняет умножение двух дробных чисел (`a * b`).
   *
   * @param a Первое число.
   * @param b Второе число.
   * @return Результат умножения чисел `a` и `b`.
   */
  public static double multiply(double a, double b) {
    return a * b;
  }


  /**
   * Выполняет деление двух целых чисел (`a / b`).
   *
   * @param a Делимое (первое число).
   * @param b Делитель (второе число).
   * @return Результат деления числа `a` на число `b`.
   */
  public static double divide(int a, int b) {
    if (b == 0) {
      // Деление на ноль невозможно.
      return 0;
    }

    return (double) a / b;
  }


  /**
   * Выполняет деление двух дробных чисел (`a / b`).
   *
   * @param a Делимое (первое число).
   * @param b Делитель (второе число).
   * @return Результат деления числа `a` на число `b`.
   */
  public static double divide(double a, double b) {
    if (b == 0) {
      // Деление на ноль невозможно.
      return 0;
    }

    return a / b;
  }

}
