package homework_32.Layers.model;

import homework_32.Layers.utils.MyArrayList;
import homework_32.Layers.utils.MyList;

/**
 * User
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class User {
  private String email;
  private String password;
  private Role role;
  private final MyList<Car> userCars;


  public User(String email, String password) {
    this.email = email;
    this.password = password;
    this.role = Role.USER;
    this.userCars = new MyArrayList<>();
  }

  public Role getRole() {
    return this.role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public MyList<Car> getUserCars() {
    return this.userCars;
  }

  @Override
  public String toString() {
    return "User{" +
           "email='" + this.email + '\'' +
           ", userCars=" + this.userCars +
           '}';
  }

}
