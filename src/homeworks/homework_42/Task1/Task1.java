package homeworks.homework_42.Task1;

import java.util.HashMap;
import java.util.Map;

/**
 * Task1
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task1 {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(str1 + " и " + str2 + " анаграммы? " + areAnagrams(str1, str2));

        String str3 = "triangle";
        String str4 = "integral";
        System.out.println(str3 + " и " + str4 + " анаграммы? " + areAnagrams(str3, str4));

        String str5 = "apple";
        String str6 = "papel";
        System.out.println(str5 + " и " + str6 + " анаграммы? " + areAnagrams(str5, str6));

        String str7 = "hello";
        String str8 = "billion";
        System.out.println(str7 + " и " + str8 + " анаграммы? " + areAnagrams(str7, str8));
    }


    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = buildCharFrequencyMap(str1);
        Map<Character, Integer> map2 = buildCharFrequencyMap(str2);

        return map1.equals(map2);
    }


    private static Map<Character, Integer> buildCharFrequencyMap(String str) {
        Map<Character, Integer> result = new HashMap<>();

        for (char c : str.toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }

        return result;
    }
}
