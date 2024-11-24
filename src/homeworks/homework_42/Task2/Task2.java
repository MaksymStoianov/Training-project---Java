package homeworks.homework_42.Task2;

import java.util.HashMap;
import java.util.Map;

/**
 * Task2
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task2 {

    public static void main(String[] args) {
        String text = "Напишите программу, которая подсчитывает количество слов определенной длины в заданном тексте (строке).";

        Map<Integer, Integer> result = countWordsByLength(text);

        result.forEach((length, count) ->
                System.out.println("Длина: " + length + ", Количество слов: " + count));
    }


    public static Map<Integer, Integer> countWordsByLength(String text) {
        Map<Integer, Integer> wordLengthMap = new HashMap<>();

        String[] words = text.split("[^\\p{L}]+");

        for (String word : words) {
            if (word.isEmpty()) continue;

            int length = word.length();
            wordLengthMap.put(length, wordLengthMap.getOrDefault(length, 0) + 1);
        }

        return wordLengthMap;
    }

}
