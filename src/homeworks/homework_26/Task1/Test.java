package homeworks.homework_26.Task1;

/**
 * Test
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Test {
  public static void main(String[] args) {
    Pair<String> result = new Pair<>("Maksym", "Stoianov");
    System.out.println(result);

    result.swap();
    System.out.println(result);
  }
}
