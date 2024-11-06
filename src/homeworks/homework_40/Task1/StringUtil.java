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
        // Заменяет все не буквы на пустоту.
        .replaceAll("[^a-zA-Z0-9а-яА-Я ]", "")

        // Преобразовывает строку в массив слов.
        .split("\\s+");

    // Преобразуем массив в коллекцию уникальных слов.
    Set<String> set = new LinkedHashSet<>(List.of(words));

    // Преобразуем Set в List для сортировки
    List<String> result = new ArrayList<>(set);

    // Сортируем по длине, затем по алфавиту
    result.sort(Comparator.comparingInt(String::length));

    return result;
  }

}
