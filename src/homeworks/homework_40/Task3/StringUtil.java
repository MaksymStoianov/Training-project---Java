package homeworks.homework_40.Task3;

import java.util.*;

/**
 * SetExample
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class StringUtil {

  /**
   * Возвращающий первый неповторяющийся символ в строке.
   *
   * @param input Строка.
   * @return Первый неповторяющийся символ в строке
   */
  public static Character getFirstUniqueChar(String input) {
    String chars = input
        .trim()
        .replaceAll("[^a-zA-Z0-9а-яА-Я]", "");

    // LinkedHashMap, сохраняет порядок добавления символов.
    Map<Character, Integer> charsMap = new LinkedHashMap<>();

    // Проходим по каждому символу строки и считаем его количество.
    for (char ch : chars.toCharArray()) {
      charsMap.put(ch, charsMap.getOrDefault(ch, 0) + 1);
    }

    // Ищем первый символ, у которого количество вхождений равно 1.
    for (Map.Entry<Character, Integer> entry : charsMap.entrySet()) {
      if (entry.getValue() == 1) {
        return entry.getKey();
      }
    }

    return null;
  }


  /**
   * Возвращает {@code List}, состоящий из уникальных элементов списка.
   *
   * @param input Строка.
   * @return {@code List}, состоящий из уникальных элементов списка
   */
  public static List<String> getUniqueSortedWords(String input) {
    String[] words = input
        .trim()
        .replaceAll("[^a-zA-Z0-9а-яА-Я ]", "")
        .split("\\s+");

    // Преобразуем массив в коллекцию уникальных слов.
    Set<String> uniqueWords = new TreeSet<>(
        Comparator
            // Сортируем по длине
            .comparing(String::length)

            // Сортируем по алфавиту
            .thenComparing(Comparator.naturalOrder())
    );

    uniqueWords.addAll(Arrays.asList(words));

    return new ArrayList<>(uniqueWords);
  }

}
