package homework_26.Task3;

/**
 * TEst
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Test {
  public static void main(String[] args) {
    NumericPair<Integer, Integer> intPair = new NumericPair<>(10, 20);
    System.out.println(intPair.sum()); // Вывод: 30.0

    NumericPair<Double, Double> doublePair = new NumericPair<>(5.5, 4.5);
    System.out.println(doublePair.sum()); // Вывод: 10.0
  }
}
