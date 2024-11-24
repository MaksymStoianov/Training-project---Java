package homeworks.homework_41.Task1;

/**
 * Task1
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task1 {
  public static void main(String[] args) {
    String testString = "Нет, мой друг, нет, — перебила она. — Довольно!" +
                        "Больше ни слова, ни одного слова от меня, ни строчки — довольно!";
    // Фёдор Михайлович Достоевский – Белые ночи

    System.out.println(StringUtil.getWordCounts(testString));
  }
}
