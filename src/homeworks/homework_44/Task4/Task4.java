package homeworks.homework_44.Task4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Task4
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task4 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "Alice"),
                new User(2, "Bob"),
                new User(3, "Charlie")
        );

        int searchId = 2;
        Optional<User> user = findUserById(users, searchId);

        user.ifPresentOrElse(
                u -> System.out.println("Найден: " + u),
                () -> System.out.println("Пользователь с id=" + searchId + " не найден")
        );
    }


    public static Optional<User> findUserById(List<User> users, int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }
}
