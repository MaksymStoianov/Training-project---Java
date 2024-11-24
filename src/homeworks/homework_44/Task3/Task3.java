package homeworks.homework_44.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task3
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .toList();

        System.out.println("Результат: " + result);
    }
}
