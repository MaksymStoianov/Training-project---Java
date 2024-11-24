package homeworks.homework_40.Task1;

/**
 * Main
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Main {
  public static void main(String[] args) {
    String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";

    System.out.println(StringUtil.getUniqueSortedWords(testString));
  }
}
