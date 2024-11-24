package homeworks.homework_44.Task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task1
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 3, 22, 44, 11, 30, 19, 8, 25, 47, 12);

        List<Integer> result = numbers
                .stream()
                .filter(num -> num > 10)
                .sorted(Comparator.comparingInt(num -> num % 10))
                .toList();

        System.out.println("Числа больше 10, отсортированные по последней цифре: " + result);
    }
}
