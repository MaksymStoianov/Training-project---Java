package homeworks.homework_40.Task1;

import java.util.*;

/**
 * SetExample
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class StringUtil {

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
