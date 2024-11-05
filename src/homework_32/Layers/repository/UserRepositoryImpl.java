package homework_32.Layers.repository;

import homework_32.Layers.model.Role;
import homework_32.Layers.model.User;
import homework_32.Layers.view.Color;
import homework_32.Layers.view.TextStyle;
import homework_32.Layers.utils.MyArrayList;
import homework_32.Layers.utils.MyList;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * UserRepositoryImpl
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class UserRepositoryImpl implements UserRepository {
  private final MyList<User> users;
  private final AtomicInteger usersCount = new AtomicInteger(1);


  public UserRepositoryImpl() {
    this.users = new MyArrayList<>();
    this.addUsers();
  }


  private void addUsers() {
    User userAdmin = new User("admin1@email.com", "passWord12345!");
    userAdmin.setRole(Role.ADMIN);

    User userBlocked = new User("user1@email.com", "passWord123!");
    userBlocked.setRole(Role.BLOCKED);

    users.addAll(
        userAdmin,
        userBlocked,
        new User("user2@email.com", "passWord12!"),
        new User("user3@email.com", "passWord12!"),
        new User("user4@email.com", "passWord12!"),
        new User("user5@email.com", "passWord12!")
    );
  }


  /**
   * Добавляет пользователя.
   *
   * @param email
   * @param password
   * @return User
   */
  @Override
  public User addUser(String email, String password) {
    User user = new User(email, password);

    this.users.add(user);

    return user;
  }


  public MyList<User> getAllUsers() {
    return this.users;
  }


  @Override
  public MyList<User> getBlockedUsers() {
    MyList<User> result = new MyArrayList<>();

    for (User user : this.users) {
      if (user.getRole().equals(Role.BLOCKED)) {
        result.add(user);
      }
    }

    return result;
  }


  /**
   * Возвращает пользователя по его email.
   *
   * @param email
   * @return User
   */
  @Override
  public User getUserByEmail(String email) {
    for (User user : this.users) {
      if (user.getEmail().equals(email)) {
        return user;
      }
    }

    return null;
  }


  /**
   * Проверяет, существует ли пользователь с таким email.
   *
   * @param email
   * @return boolean
   */
  @Override
  public boolean isEmailExists(String email) {
    for (User user : this.users) {
      if (user.getEmail().equals(email)) {
        return true;
      }
    }

    return false;
  }


  /**
   * Печатает список пользователей в табличном формате.
   *
   * @param users
   */
  public void print(MyList<User> users) {
    System.out.printf(
        "\n" + Color.CYAN + TextStyle.BOLD + "%-30s %-30s %-15s" + Color.RESET,
        "Email",
        "Password",
        "Role"
    );

    for (User user : users) {
      System.out.printf(
          "\n%-30s %-30s %-15s",
          user.getEmail(),
          user.getPassword(),
          user.getRole()
      );
    }

    System.out.println("\n");
  }

}
