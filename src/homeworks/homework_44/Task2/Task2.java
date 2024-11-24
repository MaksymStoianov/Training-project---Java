package homeworks.homework_44.Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Task2
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("apple", "banana", "kiwi", "cherry", "fig", "pear");

        String shortestString = strings
                .stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("Список пуст");

        System.out.println("Строка с минимальной длиной: " + shortestString);
    }
}
