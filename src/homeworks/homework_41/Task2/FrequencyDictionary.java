package homeworks.homework_41.Task2;

import java.util.Map;

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
    return StringUtil.getWordCounts(text);
  }


  private static Map<Character, Integer> frequencyCharsDictionary(String text) {
    return StringUtil.getCharCounts(text);
  }

}
