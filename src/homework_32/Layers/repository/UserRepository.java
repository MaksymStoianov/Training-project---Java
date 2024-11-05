package homework_32.Layers.repository;

import homework_32.Layers.model.User;
import homework_32.Layers.utils.MyList;

/**
 * UserRepository
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public interface UserRepository {

  /**
   * Добавляет пользователя.
   *
   * @param email
   * @param password
   * @return User
   */
  User addUser(String email, String password);


  MyList<User> getAllUsers();


  MyList<User> getBlockedUsers();


  /**
   * Возвращает пользователя по его email.
   *
   * @param email
   * @return User
   */
  User getUserByEmail(String email);


  /**
   * Проверяет, существует ли пользователь с таким email.
   *
   * @param email
   * @return boolean
   */
  boolean isEmailExists(String email);

}
