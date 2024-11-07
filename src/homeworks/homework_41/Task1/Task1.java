package homeworks.homework_41.Task1;

import java.util.LinkedHashMap;
import java.util.Map;

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

    System.out.println(getMap(testString));
  }


  /**
   * Возвращает {@code Map<String, Integer>}, где каждому слову соответствует количество его вхождений в текст.
   *
   * @param input Строка.
   * @return {@code Map<String, Integer>}
   */
  public static Map<String, Integer> getMap(String input) {
    String[] words = input
        .trim()
        .toLowerCase()
        .replaceAll("[^a-zA-Z0-9а-яА-Я]", " ")
        .split("\\s+");

    // LinkedHashMap, сохраняет порядок добавления символов.
    Map<String, Integer> map = new LinkedHashMap<>();

    // Считаем количество вхождений.
    for (String word : words) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    return map;
  }
}
