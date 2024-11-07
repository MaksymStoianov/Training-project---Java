package homeworks.homework_41.Task2;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * FrequencyDictionary
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class FrequencyDictionary {
  public static void main(String[] args) {
    String text = "Строка для проверки количества вхождений слов" +
                  ".\n Строка для проверки и теста. и количества слов для проверки";

    Map<String, Integer> frequencyMap = frequencyDictionary(text);
    frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

    Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

    System.out.println("\nВхождение символов: ");
    frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
    System.out.println();
  }


  private static Map<String, Integer> frequencyDictionary(String text) {
    String[] values = text
        .trim()
        .toLowerCase()
        .replaceAll("[^a-zA-Z0-9а-яА-Я]", " ")
        .split("\\s+");

    // LinkedHashMap, сохраняет порядок добавления символов.
    Map<String, Integer> map = new LinkedHashMap<>();

    // Считаем количество вхождений.
    for (String item : values) {
      map.put(item, map.getOrDefault(item, 0) + 1);
    }

    return map;
  }


  private static Map<Character, Integer> frequencyCharsDictionary(String text) {
    // TreeMap, натуральная сортировка.
    Map<Character, Integer> map = new TreeMap<>(Comparator.naturalOrder());

    // Считаем количество вхождений.
    for (Character item : text.toCharArray()) {
      map.put(item, map.getOrDefault(item, 0) + 1);
    }

    return map;
  }


}
